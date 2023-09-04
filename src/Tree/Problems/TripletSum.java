package Tree.Problems;
import Tree.TreeBST.TreeBST;

import java.util.ArrayList;
import java.util.*;

public class TripletSum {
    public static int[] findTriplet(List<Integer> list, int sum) {
        int[] array = new int[3];
        for(int i = 0; i < list.size() - 2; i++) {
            int start = i + 1;
            int end = list.size()-1;
            array[0] = list.get(i);

            while(start < end) {
                int currSum = list.get(i) + list.get(start) + list.get(end);
                if (currSum == sum) {
                    array[1] = list.get(start);
                    array[2] = list.get(end);
                    return array;
                } else if (currSum < sum) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return new int[0];
    }
    public static List<Integer> inOrderTraversal(TreeBST.Node root, List<Integer> list) {
        if(null == root) return null;

        inOrderTraversal(root.left, list);
//        System.out.println(root.data);
        list.add(root.data);
        inOrderTraversal(root.right, list);

        return list;
    }
    public static List<Integer> postOrderTraversal(TreeBST.Node root, List<Integer> list) {
        if(null == root) return null;

        postOrderTraversal(root.left, list);
        postOrderTraversal(root.right, list);
//        System.out.println(root.data);
        list.add(root.data);

        return list;
    }
    public static List<Integer> preOrderTraversal(TreeBST.Node root, List<Integer> list) {
        if(null == root) return null;

//        System.out.println(root.data);
        list.add(root.data);
        preOrderTraversal(root.left, list);
        preOrderTraversal(root.right, list);

        return list;
    }
    public static void main(String[] args) {
        Integer[] array = {-8, 10, 15, 20, 25, 30, 35};
        TreeBST.Node root = TreeBST.buildATree(array);
        System.out.println("--------In Order---------");
        List<Integer> list = inOrderTraversal(root, new ArrayList<>());
        System.out.println(list);
        System.out.println("--------Pre Order---------");
        List<Integer> listPreOrder = preOrderTraversal(root, new ArrayList<>());
        System.out.println("--------Post Order---------");
        List<Integer> listPostOrder = postOrderTraversal(root, new ArrayList<>());

        int[] res = findTriplet(list, 45);
        if(res.length != 0) {
            System.out.println("Triplet available in tree. Triplet index is : " + Arrays.toString(res));
        } else {
            System.out.println("Triplet not available in tree");
        }
    }
}
