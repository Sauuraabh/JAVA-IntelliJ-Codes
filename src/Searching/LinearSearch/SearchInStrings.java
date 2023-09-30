package Searching.LinearSearch;
import java.util.*;
public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Saurabh";
        char target = 'U';

        System.out.println(searchInString(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));

        for(char ch : name.toUpperCase().toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println();
        for(char ch : name.toLowerCase().toCharArray()) {
            System.out.print(ch + " ");
        }

    }
    public static boolean searchInString(String name, char target) {
        if(name.isEmpty()) return false;

        for(int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == target) return true;
        }

        return false;
    }
}
