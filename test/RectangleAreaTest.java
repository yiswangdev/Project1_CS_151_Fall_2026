//testers: Margarita, Maria

package test;
import rectangle.RectangleArea;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RectangleAreaTest {
    //private class Test{
        //Margarita Sergienko
        private RectangleArea areaCalculator = new RectangleArea();
        @Test
        public void negativeCoordinates() {
            assertEquals(19, areaCalculator.computeArea(-3, -3, -1, -1, -2, -2, 2, 2));
        }
        
        @Test
        public void zeroAreaRectangle() {
            assertEquals(4, areaCalculator.computeArea(0, 0, 0, 4, 0, 0, 2, 2));
        }
        @Test
        public void adjacent() {
            assertEquals(8, areaCalculator.computeArea(0, 0, 2, 2, 2, 0, 4, 2));
        }
        @Test
        public void equal() {
            assertEquals(16, areaCalculator.computeArea(0, 0, 4, 4, 0, 0, 4, 4));
        }
        @Test
        public void overlap() {
            assertEquals(17, areaCalculator.computeArea(0, 0, 3, 3, 2, 2, 5, 5));
        }
    //}
}


