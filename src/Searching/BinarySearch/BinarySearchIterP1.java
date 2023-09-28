package Searching.BinarySearch;

import java.util.Scanner;

public class BinarySearchIterP1 {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,10,13,16,20,25,27,30,45,67,89,145};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int target = input.nextInt();
        int ans = binary(array, target, 0, array.length-1);

        if(ans == -1) {
            System.out.println("Value doesn't exists in given array");
        } else {
            System.out.println("Length of array is " + array.length);
            System.out.println("Value " + array[ans] + " exists in given array at index : " + ans +
                    " and index is starting from value 0");
        }
    }
    public static int binary(int[] array, int target, int start, int end) {
        if(start > end) return -1;

        while (start <= end) {
            int mid = (start + ( end - start ) / 2 );

            if(array[mid] == target) return mid;

            if(array[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
