/** This comment block should contain your name and the names of your 2 partners
 * Name:
 * Isaac Guevarra
 * 
 * Partners:
 * Eric Wang
 * Maria Fediakina
 * Margarita Sergienko
 */

package rectangle;

public class RectangleArea {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, 
                           int bx1, int by1, int bx2, int by2) {
        
        //calculate area for both rectangles
        int aArea = (ax2 - ax1) * (ay2 - ay1);
        int bArea = (bx2 - bx1) * (by2 - by1);

        //width and height of the overlapping area
        int sectionHeight = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int sectionWidth = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));

        //multiply to get the rectangle inside of both a and b
        // then subtract from total area
        return (aArea + bArea) - (sectionHeight * sectionWidth);
    }
}