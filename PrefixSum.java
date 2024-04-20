import java.util.*;
import java.io.*;

// time complexity O(m*n)
// space complexity O(1)


public class PrefixSum
{
    public static int FindSumMatrix(int [][]arr,int r1,int r2,int c2,int c1)
    {
        int sum=0;
        for(int i=r1;i<=r2;i++)
        {
            for(int j=c1;j<=c2;j++)
            {
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows.: ");
        int rows=sc.nextInt();
        System.out.println("Enter Numbers of Columns.: ");
        int columns = sc.nextInt();
        int arr[][]= new int[rows][columns];

        System.out.println("Enter the Elements of Matrix.: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        int r1,r2,c1,c2;

        System.out.println("Enter r1 : ");
        r1=sc.nextInt();
        System.out.println("Enter c1 : ");
        c1=sc.nextInt();
        System.out.println("Enter r2 : ");
        r2=sc.nextInt();
        System.out.println("Enter c2 : ");
        c2=sc.nextInt();

        System.out.println("The Sum is : "+FindSumMatrix(arr,r1,r2,c2,c1));
    }
}