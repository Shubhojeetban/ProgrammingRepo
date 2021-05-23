package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tree {

    public static class Node {

        private int data;
        private Node left;
        private Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private Node insert(int data, Node root) {
        Node p = null, k = root;
        Node temp = new Node(data);
        if (root == null) {
            root = temp;
            return root;
        }
        while (k != null) {
            p = k;
            if (k.data > temp.data) {
                k = k.left;
            } else {
                k = k.right;
            }
        }
        if (p.data > temp.data) {
            p.left = temp;
        } else {
            p.right = temp;
        }
        return root;
    }

    private void inorderDisplay(Node root) {
        if (root != null) {
            inorderDisplay(root.left);
            System.out.print(root.data + " ");
            inorderDisplay(root.right);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Tree t = new Tree();
        Node root = null;
        while (true) {
            System.out.println("Choose One option \n1. Insert multiple data\n2. Display\n3. Delete\n"
                    + " Type any other key to exit");
            int choice = Integer.parseInt(read.readLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter the datas:");
                    String[] s = read.readLine().split(" ");
                    for (String a : s) {
                        root = t.insert(Integer.parseInt(a), root);
                    }
                    break;
                case 2:
                    t.inorderDisplay(root);
                    System.out.println();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
