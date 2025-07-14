import java.util.Scanner;

public class printDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                boolean alreadyPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (nums[k] == nums[i]) {
                        alreadyPrinted = true;
                        break;
                    }
                }

                if (!alreadyPrinted)
                    System.out.print(nums[i] + " ");
            }
        }
    }
}
