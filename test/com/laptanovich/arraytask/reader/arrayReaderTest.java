package test.com.laptanovich.arraytask.reader;

import com.laptanovich.arraytask.entity.CustomArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayReaderTest {
    @Test
    void getArrayReturnCopy() {
        CustomArray customArray = new CustomArray(new int[]{5,6});
        int[] firstCopy = customArray.getArray();
        int[] secondCopy = customArray.getArray();
        firstCopy[0] = 100;
        assertEquals(5, secondCopy[0]);
    }

    @Test
    void toStringReturnEmptyStringForEmptyArray() {
        CustomArray customArray = new CustomArray(new int[0]);
        assertEquals("", customArray.toString());
    }

    @Test
    void toStringShouldFormatSingleElement() {
        CustomArray single = new CustomArray(new int[]{42});
        assertEquals("42", single.toString());
    }

    @Test
    void toStringShouldFormatMultipleElements() {
        CustomArray multi = new CustomArray(new int[]{1, 2, 3});
        assertEquals("1 2 3", multi.toString());
    }
}
