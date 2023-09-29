package ArrayList;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(34);
        list.add(36);
        list.add(46);
        list.add(78);
        list.add(786);
        list.add(5787);

        System.out.println(list);

        System.out.println(list.contains(46));
        System.out.println(list.contains(45));

        list.set(3, 87);

        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        Scanner in = new Scanner(System.in);
        for( int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println(list.get(6));
        System.out.println(list.get(7));
        System.out.println(list.get(8));
    }
}
