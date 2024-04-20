import java.util.*;

public class PrefixSumOptimizedApproach {
    public static void prefixSumMatrix(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;
        // Traverse the array row-wise to calculate the row-wise prefix sum
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }

        // Traverse the array column-wise to calculate the column-wise prefix sum
        for (int j = 0; j < n; j++) {
            for (int i = 1; i < m; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
    }

    public static int sumRegion(int arr[][], int r1, int c1, int r2, int c2) {
        int sum = arr[r2][c2];
        int up = r1 > 0 ? arr[r1 - 1][c2] : 0;
        int left = c1 > 0 ? arr[r2][c1 - 1] : 0;
        int repeated_region = (r1 > 0 && c1 > 0) ? arr[r1 - 1][c1 - 1] : 0;

        return sum - up - left + repeated_region;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter Number of Columns: ");
        int columns = sc.nextInt();
        int arr[][] = new int[rows][columns];

        System.out.println("Enter the Elements of Matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int r1, r2, c1, c2;

        System.out.println("Enter r1: ");
        r1 = sc.nextInt();
        System.out.println("Enter c1: ");
        c1 = sc.nextInt();
        System.out.println("Enter r2: ");
        r2 = sc.nextInt();
        System.out.println("Enter c2: ");
        c2 = sc.nextInt();

        prefixSumMatrix(arr);
        int result = sumRegion(arr, r1, c1, r2, c2);

        System.out.println("The Sum is: " + result);
    }
}
