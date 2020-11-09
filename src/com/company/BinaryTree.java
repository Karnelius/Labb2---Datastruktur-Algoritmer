package com.company;


public class BinaryTree {

    Node root;

    public void insert(int key) {
        root = insertRec(root, key);
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



    int locateTheSmallChild(Node root)
    {
        int smolChild = root.key;
        while (root.left != null)
        {
            smolChild = root.left.key;
            root = root.left;
        }
        return smolChild;
    }



    public void remove(int key){
        root = removeRec(root, key);
    }

    Node removeRec(Node tree, int key)
    {
        if (tree == null)  return tree;

        if (key < tree.key)
            tree.left = removeRec(tree.left, key);
        else if (key > tree.key)
            tree.right = removeRec(tree.right, key);
        else
        {
            if (tree.left == null)
                return tree.right;

            else if (tree.right == null)
                return tree.left;

            tree.key = locateTheSmallChild(tree.right);
            tree.right = removeRec(tree.right, tree.key);
        }

        return tree;
    }





    // TODO  Travsering

    public void printInOrder(){
        printTreeInOrder(root);

    }

    public void printInReversedOrder(){
        printTreeInReversedOrder(root);
    }

    public void printInPreOrder(){
        printTreeInPreOrder(root);

    }

    public void printInPostOrder(){
        printTreeinPostOrder(root);
    }


    private void printTreeInReversedOrder(Node tree){
        if(tree==null){
            return;
        }
        printTreeInReversedOrder(tree.right);
        System.out.println(tree.key);
        printTreeInReversedOrder(tree.left);

    }

    private void printTreeInOrder(Node tree) {
        if(tree == null){
            return;
        }
        printTreeInOrder(tree.left);
        System.out.println(tree.key);
        printTreeInOrder(tree.right);

    }

    private void printTreeInPreOrder(Node tree){
        if(tree ==null){
            return;
        }
        System.out.println(tree.key);
        printTreeInPreOrder(tree.left);
        printTreeInPreOrder(tree.right);

    }

    private void printTreeinPostOrder(Node tree){
        if(tree == null){
            return;
        }
        printTreeinPostOrder(tree.left);
        printTreeinPostOrder(tree.right);
        System.out.println(tree.key);

    }

    class Node{
        Node left = null;
        Node right = null;
        int key;

        public Node(int key) {
            this.key = key;
        }
    }
}
