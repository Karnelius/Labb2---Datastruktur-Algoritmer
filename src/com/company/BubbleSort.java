package com.company;


class BubbleSort {

    void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++)
            for (int j = 0; j < array.length-i-1; j++)
                if (array[j] > array[j+1])
                {
                    int swap = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swap;
                }
    }

    void printArray(int[] array) {
        for (int i : array) System.out.print(i + " ");
        System.out.println();
    }
}

