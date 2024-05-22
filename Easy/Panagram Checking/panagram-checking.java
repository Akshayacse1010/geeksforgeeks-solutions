//{ Driver Code Starts
//Initial template for JAVA

import java.lang.*;
import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        //65 - 90 A
        //97 - 122 a
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) <='z' && s.charAt(i) >= 'a')){
                arr[s.charAt(i)- 97] = 1;
            }
             if(s.charAt(i) <= 'Z' && s.charAt(i)>= 'A'){
                 arr[s.charAt(i)- 65] = 1;
             }
        }
        for(int i = 0; i < 26; i++){
            if(arr[i] == 0){
                return false;
            }
        }
        return true;
    }
}

//{ Driver Code Starts.

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new Solution().checkPangram (s)==true?1:0);
	  }
	  
	 }
}
// } Driver Code Ends