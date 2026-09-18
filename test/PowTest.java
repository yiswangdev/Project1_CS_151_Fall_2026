package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import Pow.Pow;

public class PowTest {
    //tested by Eric Wang
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


    //tests by: Isaac Guevarra
    @Test
    void bothPositive() {
        assertEquals(16, pow.myPow(2.0, 4));
    }

    @Test
    void negativeExponent() {
        assertEquals(0.0001, pow.myPow(10.0, -4));
    }

    @Test
    void bothNegative() {
        assertEquals(0.01, pow.myPow(-10.0, -2));
    }

    @Test
    void negativeBase() {
        assertEquals(-32, pow.myPow(-2.0, 5));
    }

    @Test
    void zeroBase() {
        assertEquals(0, pow.myPow(0.0, 2));
    }

    @Test
    void zeroExponent() {
        assertEquals(1, pow.myPow(2.0, 0));
    }

    @Test
    void negativesAndFractionBase() {
        assertEquals(-0.064, pow.myPow(-2.5, -3));
    }

}
