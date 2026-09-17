package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import slices.ArithmeticSlices;

public class ArithmeticSlicesTest {
    // tested by Eric Wang
    private final ArithmeticSlices arithmeticSlices = new ArithmeticSlices();

    @Test
    void countsArithmeticSlicesWithDifferenceOne() {
        assertEquals(3, arithmeticSlices.numberOfArithmeticSlices(new int[] {1, 2, 3, 4}));
    }

    @Test
    void countsArithmeticSlicesWithDifferenceTwo() {
        assertEquals(3, arithmeticSlices.numberOfArithmeticSlices(new int[] {1, 3, 5, 7}));
    }

    @Test
    void returnsZeroWhenThereAreFewerThanThreeNumbers() {
        assertEquals(0, arithmeticSlices.numberOfArithmeticSlices(new int[] {1, 2}));
    }

    @Test
    void returnsZeroWhenThereAreNoArithmeticSlices() {
        assertEquals(0, arithmeticSlices.numberOfArithmeticSlices(new int[] {1, 2, 4, 5}));
    }

    @Test 
    void countsArithmeticSlicesWithNegativeNumbers() {
        assertEquals(3, arithmeticSlices.numberOfArithmeticSlices(new int[] {-1, -2, -3, -4}));
    }

}
