package Array;

import java.util.*;

public class TwoDimArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[4][3];

        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        for(int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
