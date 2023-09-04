package Tree.BinarySearchTree;

public class BinarySearchTree {
    public static class Node {
        Integer data;
        Node left;
        Node right;
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
    public static int maxValue(Node node) {
        if(node == null) {
            return Integer.MIN_VALUE;
        }
        int currentNodeValue = node.data;
        int leftMax = maxValue(node.left);
        int rightMax = maxValue(node.right);

        int max = Math.max(leftMax, rightMax);

        return Math.max(currentNodeValue, max);
    }
    public static int minValue(Node node) {
        if(node == null) {
            return Integer.MAX_VALUE;
        }
        int currentNodeValue = node.data;
        int leftMin = minValue(node.left);
        int rightMin = minValue(node.right);

        int max = Math.min(leftMin, rightMin);

        return Math.min(currentNodeValue, max);
    }
    public static void main(String[] args) {
        Integer[] array = {15, 25, 35, 50, 65, 75, 90};

        Node root = buildATree(array, 0, array.length-1);

        display(root);

        System.out.println("Maximum value in tree is : " + maxValue(root));
        System.out.println("Minimum value in tree is : " + minValue(root));
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
