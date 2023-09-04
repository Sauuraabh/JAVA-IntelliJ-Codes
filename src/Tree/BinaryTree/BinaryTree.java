package Tree.BinaryTree;

import java.util.Stack;

public class BinaryTree {
    public static class Node {
        Integer data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static class Pair {
        Node node;
        int state;
        public Pair(Node node, int state) {
            this.node = node;
            this.state = state;
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
            str.append(node.right.data).append(" ");
        } else {
           str.append(".. ");
        }

        System.out.println(str);

        display(node.left);
        display(node.right);
    }
    public static void main(String[] args) {
        Integer[] array = {50,25,15,null,null,35,30,null,null,null,75,60,null,70,null,null,90,null,null};
        Stack<Pair> stack = new Stack<>();

        Node root = new Node(array[0]);
        Pair pair = new Pair(root, 1);
        stack.push(pair);

        int index = 0;
        while(!stack.isEmpty()) {
            Pair top = stack.peek();
            if(top.state == 1) {
                index++;
                if(array[index] != null) {
                    Node leftNode = new Node(array[index]);
                    top.node.left = leftNode;
                    Pair leftPair = new Pair(leftNode, 1);
                    stack.push(leftPair);
                } else {
                    top.node.left = null;
                }
                top.state++;
            } else if(top.state == 2) {
                index++;
                if(array[index] != null) {
                    Node rightNode = new Node(array[index]);
                    top.node.left = rightNode;
                    Pair rightPair = new Pair(rightNode, 1);
                    stack.push(rightPair);
                } else {
                    top.node.right = null;
                }
                top.state++;
            } else {
                stack.pop();
            }
        }
        display(root);
    }
}
