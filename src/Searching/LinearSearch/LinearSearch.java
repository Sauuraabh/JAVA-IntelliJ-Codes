package Searching.LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {18, 12, 9, 14, 77, 50};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value to be searched in given array : ");
        int target = in.nextInt();
        if(searchTarget(array, target)) {
            System.out.println("Element is present in array");
        } else {
            System.out.println("Element is not present in array");
        }
    }
    public static boolean searchTarget(int[] array, int target) {
        for(int element : array) {
            if(element == target) return true;
        }
        return false;
    }
}