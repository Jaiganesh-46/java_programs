import java.util.*;

public class weightedNumberSort {
    
    static int calculateWeight(int num) {
        int weight = 0;

        int sqrt = (int) Math.sqrt(num);
        if (sqrt * sqrt == num) weight += 5;

        if (num % 4 == 0 && num % 6 == 0) weight += 4;

        if (num % 2 == 0) weight += 3;

        return weight;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        numbers.sort((a, b) -> {
            int w1 = calculateWeight(a);
            int w2 = calculateWeight(b);
            if (w1 != w2) {
                return Integer.compare(w2, w1); 
            } else {
                return Integer.compare(b, a); 
            }
        });

        System.out.println("Sorted numbers based on weight:");
        
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
