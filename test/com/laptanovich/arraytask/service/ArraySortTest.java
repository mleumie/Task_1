package test.com.laptanovich.arraytask.service;

import com.laptanovich.arraytask.entity.CustomArray;
import com.laptanovich.arraytask.service.impl.ArraySortServiceImpl;
import org.junit.jupiter.api.Test;
import com.laptanovich.arraytask.service.ArraySortService;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraySortTest {
    private ArraySortService service = new ArraySortServiceImpl();
    private static final int[] EMPTY_ARRAY = new int[0];
    private static final int[] SINGLE_ARRAY = new int[]{67};
    private static final int[] UNSORTED_ARRAY = new int[]{5, 2, 9, 1, 7};
    private static final int[] SORTED_ARRAY = new int[]{1, 2, 5, 7, 9};

    @Test
    void bubbleSortEmptyArray() {
        CustomArray customArray = new CustomArray(EMPTY_ARRAY);
        service.bubbleSort(customArray);
        assertArrayEquals(EMPTY_ARRAY, customArray.getArray());
    }

    @Test
    void bubbleSortSingleElement() {
        CustomArray customArray = new CustomArray(SINGLE_ARRAY);
        service.bubbleSort(customArray);
        assertArrayEquals(SINGLE_ARRAY, customArray.getArray());
    }

    @Test
    void bubbleSortUnsortedArray() {
        CustomArray customArray = new CustomArray(UNSORTED_ARRAY);
        service.bubbleSort(customArray);
        assertArrayEquals(SORTED_ARRAY, customArray.getArray());
    }

    @Test
    void bubbleSortSortedArray() {
        CustomArray customArray = new CustomArray(SORTED_ARRAY);
        service.bubbleSort(customArray);
        assertArrayEquals(SORTED_ARRAY, customArray.getArray());
    }

    @Test
    void quickSortEmptyArray() {
        CustomArray customArray = new CustomArray(EMPTY_ARRAY);
        service.quickSort(customArray);
        assertArrayEquals(EMPTY_ARRAY, customArray.getArray());
    }

    @Test
    void quickSortSingleElement() {
        CustomArray customArray = new CustomArray(SINGLE_ARRAY);
        service.quickSort(customArray);
        assertArrayEquals(SINGLE_ARRAY, customArray.getArray());
    }

    @Test
    void quickSortUnsortedArray() {
        CustomArray customArray = new CustomArray(UNSORTED_ARRAY);
        service.quickSort(customArray);
        assertArrayEquals(SORTED_ARRAY, customArray.getArray());
    }

    @Test
    void quickSortSortedArray() {
        CustomArray customArray = new CustomArray(SORTED_ARRAY);
        service.quickSort(customArray);
        assertArrayEquals(SORTED_ARRAY, customArray.getArray());
    }
}
