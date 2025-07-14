import java.util.*;
public class totalElectricityBillProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float total;
        float a = 0;

        if(n > 0 && n <= 50){
            a = n * 3.50f;
        } else if(n >= 51 && n <= 150){
            int unitsAbove50 = n - 50;
            a = (50 * 3.50f) + (unitsAbove50 * 4.50f);
        } else if(n >= 151 && n <= 250){
            int unitsAbove150 = n - 150;
            a = (50 * 3.50f) + (100 * 4.50f) + (unitsAbove150 * 5.20f);
        } else if(n > 250) {
            int unitsAbove250 = n - 250;
            a = (50 * 3.50f) + (100 * 4.50f) + (100 * 5.20f) + (unitsAbove250 * 6.75f);
        }

        total = a + (a * 0.20f);
        System.out.printf("%.2f\n", total);
    }
}
