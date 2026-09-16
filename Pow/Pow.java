package Pow;
//Team Members:
// Eric Wang
// Maria Fediakina
// Margarita Sergienko
// Isaac Guevarra

public class Pow {
    public double myPow(double x, int n) {
        long exp = Math.abs((long) n); 
        double result = 1;
        if (x != 1) {
            for (long i = 0; i < exp; i++) {
                result *= x;
            } if (n < 0) {
                return (1 / result);
            } 
        }
        return result;
    }
}
