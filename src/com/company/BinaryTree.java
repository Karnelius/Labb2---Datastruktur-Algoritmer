package com.company;


 class BinaryTree {
    Node root;

    private static class Node {
        Node left;
        Node right;
        int key;

        public Node(int key) {
            this.key = key;
        }
    }

    private int minValueOfLeftTree(Node root) {
        int minVal = root.key;
        while (root.left != null) {
            minVal = root.left.key;
            root = root.left;
        }
        return minVal;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node tree, int key) {
        if (tree == null) {
            return tree;
        }

        if (key < tree.key) {
            tree.left = deleteRec(tree.left, key);
        } else if (key > tree.key) {
            tree.right = deleteRec(tree.right, key);
        } else {
            // one child
            if (tree.left == null)
                return tree.right;

            else if (tree.right == null)
                return tree.left;

            //two children
            tree.key = minValueOfLeftTree(tree.right);
            tree.right = deleteRec(tree.right, tree.key);
        }

        return tree;
    }

    private Node insertRec(Node tree, int key) {
        if (tree == null) {
            tree = new Node(key);
            return tree;
        }
        if (key < tree.key) {
            tree.left = insertRec(tree.left, key);
        } else if (key > tree.key) {
            tree.right = insertRec(tree.right, key);
        }
        return tree;
    }

    //      ---Traverse orders---

    public void printInOrder() {
        printTreeInOrder(root);
    }

    public void printTreeInReverseOrder() {
        printTreeInReverseOrder(root);
    }

    public void printTreeInPreOrder() {
        printTreeInPreOrder(root);
    }

    public void printTreeInPostOrder() {
        printTreeInPostOrder(root);
    }

    private void printTreeInOrder(Node tree) {
        if (tree == null) {
            return;
        }
        printTreeInOrder(tree.left);
        System.out.println(tree.key);
        printTreeInOrder(tree.right);
    }

    private void printTreeInReverseOrder(Node tree) {
        if (tree == null) {
            return;
        }
        printTreeInReverseOrder(tree.right);
        System.out.println(tree.key);
        printTreeInReverseOrder(tree.left);
    }

    private void printTreeInPreOrder(Node tree) {
        if (tree == null) {
            return;
        }
        System.out.println(tree.key);
        printTreeInPreOrder(tree.left);
        printTreeInPreOrder(tree.right);
    }

    private void printTreeInPostOrder(Node tree) {
        if (tree == null) {
            return;
        }
        printTreeInPostOrder(tree.left);
        printTreeInPostOrder(tree.right);
        System.out.println(tree.key);
    }

}
