//{ Driver Code Starts
//Initial template for C++

#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function template for C++

class Solution{
  public:
     // Function to find majority element in the array
    // a: input array
    // size: size of input array
    int majorityElement(int a[], int n)
    {

unordered_map<int,int>mp;
for(int i =0;i<n;i++){
    mp[a[i]]++;
    
}
long long vl = 0;
long long sum = 0;
 for (auto i : mp)
        if(sum<i.second){
            sum = i.second;
            vl = i.first;
        }
if(sum > n/2){
  return vl;
}
return -1;


// optimised soln

}
};

//{ Driver Code Starts.

int main(){

    int t;
    cin >> t;

    while(t--){
        int n;
        cin >> n;
        int arr[n];
        
        for(int i = 0;i<n;i++){
            cin >> arr[i];
        }
        Solution obj;
        cout << obj.majorityElement(arr, n) << endl;
    }

    return 0;
}

// } Driver Code Ends