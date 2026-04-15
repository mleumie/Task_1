package test.com.laptanovich.arraytask.service;

import com.laptanovich.arraytask.entity.CustomArray;
import com.laptanovich.arraytask.service.impl.ArrayValueServiceImpl;
import org.junit.jupiter.api.Test;
import com.laptanovich.arraytask.service.ArrayValueService;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayValueTest {
    private ArrayValueService service = new ArrayValueServiceImpl();

    @Test
    void findMinOnEmptyArray() {
        CustomArray customArray = new CustomArray(new int[0]);
        Optional<Integer> result = service.findMin(customArray);
        assertFalse(result.isPresent());
    }

    @Test
    void findMinOnNonEmptyArray() {
        CustomArray customArray = new CustomArray(new int[]{5, 6, 8, 3, 9});
        Optional<Integer> result = service.findMin(customArray);
        assertTrue(result.isPresent());
        assertEquals(3, result.get());
    }

    @Test
    void findMaxOnEmptyArray() {
        CustomArray customArray = new CustomArray(new int[0]);
        Optional<Integer> result = service.findMax(customArray);
        assertFalse(result.isPresent());
    }

    @Test
    void findMaxOnNonEmptyArray() {
        CustomArray customArray = new CustomArray(new int[]{5, 6, 8, 3, 9});
        Optional<Integer> result = service.findMax(customArray);
        assertTrue(result.isPresent());
        assertEquals(9, result.get());
    }

    @Test
    void sumOnEmptyArray() {
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
    void averageOnEmptyArray() {
        CustomArray customArray = new CustomArray(new int[0]);
        Optional<Double> result = service.averageValue(customArray);
        assertFalse(result.isPresent());
    }

    @Test
    void averageOnNonEmptyArray() {
        CustomArray customArray = new CustomArray(new int[]{5, 6, 8, 3, 9});
        Optional<Double> result = service.averageValue(customArray);
        assertTrue(result.isPresent());
        assertEquals(6.2, result.get());
    }
}
