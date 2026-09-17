package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import Pow.Pow;

public class PowTest {
    private final Pow pow = new Pow();

    @Test
    void raisesTwoToTen() {
        assertEquals(1024.0, pow.myPow(2.0, 10), 0.0000001);
    }

    @Test
    void handlesNegativeExponent() {
        assertEquals(0.25, pow.myPow(2.0, -2), 0.0000001);
    }

    @Test
    void returnsOneForZeroAndOneBase() {
        assertEquals(1.0, pow.myPow(1.0, 100), 0.0000001);
        assertEquals(1.0, pow.myPow(2.0, 0), 0.0000001);
    }

    @Test
    void handlesIntegerBaseWithPositiveExponent() {
        assertEquals(8.0, pow.myPow(2.0, 3), 0.0000001);
    }

    @Test
    void handlesNegativeBase() {
        assertEquals(0.0625, pow.myPow(-2.0, -4), 0.0000001);
    }
}
