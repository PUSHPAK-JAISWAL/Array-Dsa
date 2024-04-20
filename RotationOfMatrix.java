// time complexity is O(m*n)
// space complexity is O(1)


import java.util.*;
import java.io.*;

public class RotationOfMatrix
{
    public static void main(String args[])
    {
        int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotatedMatrix(arr);
        for(var mat:arr)
        {
            System.out.println(Arrays.toString(mat));
        }
    }
    public static void rotatedMatrix(int[][] arr)
    {
        // Step 1: Transpose the 2D Array
        int m = arr.length;// this gives the numbers of rows.

        int n = arr[0].length;// this gives the numbers of columns.

        for(int i=0;i<m;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        // Step 2: To Swap left and right side Elements
        for(int i=0;i<m;i++)
        {
            int leftIndex = 0;
            int RightIndex=n-1;
            
            while(leftIndex<RightIndex)
            {
                int temp =arr[i][leftIndex];
                arr[i][leftIndex]=arr[i][RightIndex];
                arr[i][RightIndex]=temp;
                leftIndex++;
                RightIndex--;
            }
        }


    }
}