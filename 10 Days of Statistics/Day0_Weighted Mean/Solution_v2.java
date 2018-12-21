import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        int size = scan.nextInt();
        int[] elements = new int[size];
        int[] weights = new int[size];

        for(int i = 0; i < size; i++){
            elements[i] = scan.nextInt();
        }
        for (int i = 0; i < size; i++) {
            weights[i] = scan.nextInt();
        }
        scan.close();

        int total = 0;
        int totalWeight = 0;

        for(int i =0; i < size; i++){
            total += elements[i] * weights[i];
            totalWeight += weights[i];
        }

        double weightMean = (double)total / totalWeight;
        
        System.out.printf("%.1f\n", weightedMean(elements, weights));
    
    }
    
    static double weightedMean(int[] x, int[] w) {
        return (double)IntStream.range(0, x.length).map(i -> x[i] * w[i]).sum() / Arrays.stream(w).sum();
    }
}

