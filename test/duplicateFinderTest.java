//testers: Margarita, Maria

package test;
import duplicate.duplicateFinder;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class duplicateFinderTest {
    //private class Test{
        //Margarita Sergienko
        private duplicateFinder finder = new duplicateFinder();
        @Test
        public void adjacent() {
            int[] arr = new int[]{1, 2, 2, 3};
            assertEquals(2, finder.findDuplicate(arr));
        }
        @Test
        public void firstAndLast() {
            int[] arr = new int[]{1, 2, 3, 1};
            assertEquals(1, finder.findDuplicate(arr));
        }
        @Test
        public void atEnd() {
            int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
            assertEquals(9, finder.findDuplicate(arr));
        }
        @Test
        public void negative() {
            int[] arr = new int[]{-5, -4, -3, -2, -5, -10};
            assertEquals(-5, finder.findDuplicate(arr));
        }
        @Test
        public void twoElements() {
            int[] arr = new int[]{1, 1};
            assertEquals(1, finder.findDuplicate(arr));
        }
}
