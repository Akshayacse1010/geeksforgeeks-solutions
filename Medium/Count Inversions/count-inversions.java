//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    long merge(ArrayList<Long> temp, long[] arr, int low, int mid, int high) {
        long left = low;
        long right = mid + 1;
        long cnt = 0;
        while (left <= mid && right <= high) {
            if (arr[(int) left] <= arr[(int) right]) {
                temp.add(arr[(int) left]);
                left++;
            } else {
                temp.add(arr[(int) right]);
                cnt += (mid - left + 1L); // updated count
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[(int) left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[(int) right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return cnt;
    }

    long mergeSort(long[] arr, int low, int high) {
        long cnt = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;
            cnt += mergeSort(arr, low, mid);
            cnt += mergeSort(arr, mid + 1, high);
            ArrayList<Long> temp = new ArrayList<>();
            cnt += merge(temp, arr, low, mid, high);
        }
        return cnt;
    }

    static long inversionCount(long arr[], long N) {
        Solution solution = new Solution();
        return solution.mergeSort(arr, 0, (int) (N - 1));
    }
}
