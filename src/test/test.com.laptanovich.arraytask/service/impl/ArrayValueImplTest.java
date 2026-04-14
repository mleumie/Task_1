package service.impl;

import com.laptanovich.arraytask.entity.CustomArray;
import com.laptanovich.arraytask.service.impl.ArrayValueServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.laptanovich.arraytask.service.ArrayValueService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayValueImplTest {
    private ArrayValueService service = new ArrayValueServiceImpl();

    @BeforeEach
        void setUp() {
        service = new ArrayValueServiceImpl();
    }

    @Test
    void findMinOnEmptyArrayReturnsEmpty() {
        CustomArray customArray = new CustomArray(new int[0]);
        Optional<Integer> result = service.findMin(customArray);
        assertFalse(result.isPresent());
    }

    @Test
    void findMinOnNonEmptyReturnsMin() {
        CustomArray customArray = new CustomArray(new int[]{5, 6, 8, 3, 9});
        Optional<Integer> result = service.findMin(customArray);
        assertTrue(result.isPresent());
        assertEquals(3, result.get());
    }

    @Test
    void findMaxOnEmptyArrayReturnsEmpty() {
        CustomArray customArray = new CustomArray(new int[0]);
        Optional<Integer> result = service.findMax(customArray);
        assertFalse(result.isPresent());
    }

    @Test
    void findMaxOnNonEmptyReturnsMin() {
        CustomArray customArray = new CustomArray(new int[]{5, 6, 8, 3, 9});
        Optional<Integer> result = service.findMax(customArray);
        assertTrue(result.isPresent());
        assertEquals(9, result.get());
    }

    @Test
    void sumOnEmptyArrayReturnsEmpty() {
        CustomArray customArray = new CustomArray(new int[0]);
        Optional<Integer> result = service.sum(customArray);
        assertFalse(result.isPresent());
    }

    @Test
    void sumOnNonEmptyReturnsMin() {
        CustomArray customArray = new CustomArray(new int[]{5, 6, 8, 3, 9});
        Optional<Integer> result = service.sum(customArray);
        assertTrue(result.isPresent());
        assertEquals(31, result.get());
    }

    @Test
    void averageOnEmptyArrayReturnsEmpty() {
        CustomArray customArray = new CustomArray(new int[0]);
        Optional<Double> result = service.averageValue(customArray);
        assertFalse(result.isPresent());
    }

    @Test
    void averageOnNonEmptyReturnsMin() {
        CustomArray customArray = new CustomArray(new int[]{5, 6, 8, 3, 9});
        Optional<Double> result = service.averageValue(customArray);
        assertTrue(result.isPresent());
        assertEquals(6.2, result.get());
    }
}
