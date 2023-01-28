import java.io.*;

public class sum {

    // Function to return sum of
    // 1/1 + 1/2 + 1/3 + ..+ 1/n
    static double sum(int n) {
        double i, s = 0.0;
        for (i = 1; i <= n; i++)
            s = s + 1 / i;
        return s;
    }

    // Driven Program
    public static void main(String args[]) {
        int n = 5;
        System.out.printf("Sum is %f", sum(n));

    }
}
