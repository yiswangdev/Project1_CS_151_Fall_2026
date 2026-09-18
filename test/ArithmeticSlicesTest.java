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


    //tests by: Isaac Guevarra

    @Test 
    void emptyArray() {
        assertEquals(0, arithmeticSlices.numberOfArithmeticSlices(new int[] {}));
    }

    @Test 
    void lessThan3InArray() {
        assertEquals(0, arithmeticSlices.numberOfArithmeticSlices(new int[] {0, 2}));
    }

    @Test 
    void allSameValuesInArray() {
        assertEquals(1, arithmeticSlices.numberOfArithmeticSlices(new int[] {1, 1, 1}));
    }

    @Test 
    void decreasingOrderInArray() {
        assertEquals(1, arithmeticSlices.numberOfArithmeticSlices(new int[] {5, 3, 1}));
    }

    @Test 
    void noArithmeticSequenceIn3Values() {
        assertEquals(0, arithmeticSlices.numberOfArithmeticSlices(new int[] {1, 2, 4}));
    }

    @Test 
    void arithmeticBeginsLater() {
        assertEquals(4, arithmeticSlices.numberOfArithmeticSlices(new int[] {1, 2, 3, 4, 6, 8}));
    }
}
