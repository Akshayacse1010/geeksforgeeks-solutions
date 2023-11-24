//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            ArrayList<Long> ans = new Solution().nthRowOfPascalTriangle(n);
            printAns(ans);
        }
    }
    public static void printAns(ArrayList<Long> ans) {
        for (Long x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

// } Driver Code Ends


class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        ArrayList<Long> ansi = new ArrayList<>();
        long ans = 1;
        long MOD = 1000000007;
        ansi.add(ans);
        for (long i = 1; i < n; i++) {
            ans = (ans * (n - i)) % MOD; // Multiply and take modulo
            ans = (ans * modInverse(i, MOD)) % MOD; // Multiply by modular inverse and take modulo
            ansi.add(ans);
        }
        return ansi;
    }

    // Function to calculate modular inverse using extended Euclidean algorithm
    long modInverse(long a, long m) {
        long m0 = m;
        long y = 0, x = 1;

        if (m == 1) return 0;

        while (a > 1) {
            long q = a / m;
            long t = m;
            m = a % m;
            a = t;
            t = y;
            y = x - q * y;
            x = t;
        }

        if (x < 0) x += m0;

        return x;
    }
}
