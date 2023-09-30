package Searching.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] array = {18, 12, -7, 3, 14, 28};
        int target = 3;
        if(inRange(array, target, 2, 4)) {
            System.out.println("Element is present in range");
        } else {
            System.out.println("Element is not present in range");
        }
    }
    public static boolean inRange(int[] array, int target, int start, int end) {
        if(array.length == 0) return false;

        if(start > array.length || end > array.length) return false;

        for(int i = start; i <= end; i++) {
            if(array[i] == target) return true;
        }
        return false;
    }
}
