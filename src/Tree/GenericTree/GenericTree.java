package Tree.GenericTree;
import java.util.*;

public class GenericTree {
    public static class Node {
        int data;
        List<Node> children;
        public Node(int data) {
            this.data = data;
            children = new ArrayList<>();
        }
    }
    public static void display(Node node) {
        StringBuilder str = new StringBuilder(node.data + " -> ");
        for(Node child : node.children) {
            str.append(child.data).append(", ");
        }
        str.append(".");
        System.out.println(str);
        for(Node child : node.children) {
            display(child);
        }
    }
    public static void main(String[] args) {
        int[] array = {10, 20, -1, 30, 50, -1, 60, -1, -1, 40, -1, -1};
        Node root = null;

        Stack<Node> stack = new Stack<>();

        for (int element : array) {
            if (element == -1) {
                stack.pop();
            } else {
                Node node = new Node(element);
                if (stack.isEmpty()) {
                    root = node;
                } else {
                    Node nodeInStack = stack.peek();
                    nodeInStack.children.add(node);
                }
                stack.push(node);
            }
        }
        assert root != null;
        display(root);
    }
}
