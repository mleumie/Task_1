package test.com.laptanovich.arraytask.parser;

import com.laptanovich.arraytask.exception.CustomException;
import org.junit.jupiter.api.Test;
import com.laptanovich.arraytask.parser.ArrayParser;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayParserTest {
    private ArrayParser parser;
    private static final String SEMICOLON_SEPARATED = "1; 2; 3";
    private static final String COMMA_SEPARATED = "1, 2, 3";
    private static final String SPACE_SEPARATED = "1 2 3";
    private static final String DASH_SEPARATED = "1 - 2 - 3";
    private static final String MIXED_SEPARATED = "1; 2, 3 - 4";
    private static final String INVALID = "1y1 21 32 6..5";

    @Test
    void parseSemicolonSeparated() throws CustomException {
        int[] result = parser.parse(SEMICOLON_SEPARATED);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    void parseCommaSeparated() throws CustomException {
        int[] result = parser.parse(COMMA_SEPARATED);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    void parseSpaceSeparated() throws CustomException {
        int[] result = parser.parse(SPACE_SEPARATED);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    void parseDashSeparated() throws CustomException {
        int[] result = parser.parse(DASH_SEPARATED);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    void parseMixedSeparated() throws CustomException {
        int[] result = parser.parse(MIXED_SEPARATED);
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

    @Test
    void parseInvalidSeparated() {
        assertThrows(CustomException.class, ()->parser.parse(INVALID));
    }
}
