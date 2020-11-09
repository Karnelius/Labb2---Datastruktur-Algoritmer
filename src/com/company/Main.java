package com.company;

public class Main {


    public static void main(String args[]) {

        BubbleSort sort = new BubbleSort();

        int arr[] = {64, 34, 25, 12, 22, 11, 90, 141, 3, 55, 10, 4, 14, 1, 2, 9, 210};
        sort.bubbleSort(arr);
        System.out.println("Sorterad array");
        sort.printTheArray(arr);
        System.out.println("-----------------");





        BinaryTree bt = new BinaryTree();

        bt.insert(8);
        bt.insert(3);
        bt.insert(10);
        bt.insert(1);
        bt.insert(6);
        bt.insert(13);

        
        bt.insert(1000);
        bt.remove(1000);


        System.out.println("Print In Order: ");
        bt.printInOrder();
        System.out.println("------");

        System.out.println("Print in Reversed Order");
        bt.printInReversedOrder();
        System.out.println("------");

        System.out.println("Print in Pre Order: ");
        bt.printInPreOrder();
        System.out.println("------");

        System.out.println("Print in Post Order");
        bt.printInPostOrder();
        System.out.println("------");

    }
    }



