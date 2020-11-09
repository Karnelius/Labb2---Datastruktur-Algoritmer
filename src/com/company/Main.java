package com.company;

public class Main {


    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] array = {44, 78, 5, 12, 1, 8, 39};
        bs.bubbleSort(array);
        System.out.println("Sorted array: ");
        bs.printArray(array);
        System.out.println("\n-----------------");


        BinaryTree bt = new BinaryTree();
        /* 8,3,10,1,6,13

                  8
               3     10
             1   6      13

        */

        bt.insert(8);
        bt.insert(3);
        bt.insert(10);
        bt.insert(1);
        bt.insert(6);
        bt.insert(13);

        System.out.println("\nTree in order:");
        bt.printInOrder();

        System.out.println("\nTree in reverse order:");
        bt.printTreeInReverseOrder();

        System.out.println("\nTree in pre-order:");
        bt.printTreeInPreOrder();

        System.out.println("\nTree in post-order:");
        bt.printTreeInPostOrder();

        System.out.println("\nTree in order after deletion");

        bt.delete(1);
        bt.delete(10);
        bt.delete(8);

        bt.printTreeInPostOrder();

    }
}



