package Tree.TreeBST;

public class TreeBST {
    public static class Node {
        public Integer data;
        public Node left;
        public Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public Node(Integer data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static void display(Node node) {
        if(null == node) return;

        StringBuilder str = new StringBuilder();

        if(null != node.left) {
            str.append(node.left.data).append(" ");
        } else {
            str.append(".. ");
        }
        str.append(" <- ").append(node.data).append(" ->  ");

        if(null != node.right) {
            str.append(node.right.data).append("  ");
        } else {
            str.append(".. ");
        }

        System.out.println(str);

        display(node.left);
        display(node.right);
    }
    public static void main(String[] args) {
        Integer[] array = {15, 25, 35, 50, 65, 75};
        Node root = buildATree(array);
        display(root);
        if(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            System.out.println("Given tree is fully tree BST.");
        } else {
            System.out.println("Given tree is not fully tree BST.");
        }
    }
    public static boolean isBST(Node root, int min, int max) {
        if(root == null) return true;

        Integer parentValue = root.data;

        if(parentValue <= min || parentValue >= max) return false;

        return isBST(root.left, min, parentValue) && isBST(root.right, parentValue, max);
    }
    public static Node buildATree(Integer[] array) {
        int low = 0;
        int high = array.length-1;
        return buildATree(array, low, high);
    }
    public static Node buildATree(Integer[] array, int low, int high) {
        if(low >= high) return new Node(array[high]);

        int mid = (low + high) / 2;
        int data = array[mid];

        Node leftNode = buildATree(array, low, mid-1);
        Node rightNode = buildATree(array, mid+1, high);

        return new Node(data, leftNode, rightNode);
    }
}
