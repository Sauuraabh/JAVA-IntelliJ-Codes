package Searching.BinarySearch;

import java.util.Scanner;

public class BinarySearchRecP1 {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,10,13,16,20,25,27,30,45,67,89,145};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int target = input.nextInt();
        int ans = binaryRec(array, target, 0, array.length-1);

        if(ans == -1) {
            System.out.println("Value doesn't exists in given array");
        } else {
            System.out.println("Length of array is " + array.length);
            System.out.println("Value " + array[ans] + " exists in given array at index : " + ans +
                    " and index is starting from value 0");
        }
    }
    public static int binaryRec(int[] array, int target, int start, int end) {
        if(start > end) return -1;

        int mid = (start + ((end - start) / 2));

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            return binaryRec(array, target, start, mid - 1);
        } else {
            return binaryRec(array, target, mid + 1, end);
        }
    }
}
