package com.laptanovich.arraytask.service.impl;

import com.laptanovich.arraytask.entity.CustomArray;
import com.laptanovich.arraytask.service.ArraySortService;

public class ArraySortServiceImpl implements ArraySortService {

    @Override
    public void bubbleSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length - 1; i++ ) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                   swap(array, j, j+1);
                }
            }
        }
    }

    @Override
    public void quickSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        quickSortRecursive(array, 0, array.length - 1);
    }

    private void quickSortRecursive(int[] array, int left, int right) {
        if (left < right) {
            int pivot = quickSortPartition(array, left, right);
            quickSortRecursive(array, left, pivot - 1);
            quickSortRecursive(array, pivot + 1, right);
        }
    }

    private int quickSortPartition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;
        for (int j = left; j <= right; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, right);
        return i + 1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array [i] = temp;
    }
}
