//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
    
private:
    // Define a depth-first search (DFS) function
    void dfs(vector<vector<char>>& grid, int i, int j, int m, int n) {
        // Check for out-of-bounds or water cells
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';  // Mark the current cell as visited
        
        // Explore neighbors using DFS
        dfs(grid, i - 1, j, m, n);
        dfs(grid, i + 1, j, m, n);
        dfs(grid, i, j - 1, m, n);
        dfs(grid, i, j + 1, m, n);
        dfs(grid, i - 1, j-1, m, n);
        dfs(grid, i + 1, j+1, m, n);
        dfs(grid, i+1, j - 1, m, n);
        dfs(grid, i-1, j + 1, m, n);
    }
  public:
    // Function to find the number of islands.
    int numIslands(vector<vector<char>>& grid) {
        // Code here
        int m = grid.size();  // Get the number of rows
        int n = grid[0].size();  // Get the number of columns
        
        int res = 0;  // Initialize the count of islands
        
        // Iterate through each cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the cell contains land
                if (grid[i][j] == '1') {
                    dfs(grid, i, j, m, n);  // Explore the island using DFS
                    res++;  // Increment the island count
                }
            }
        }
        
        return res;
    }
};

//{ Driver Code Starts.
int main() {
    int tc;
    cin >> tc;
    while (tc--) {
        int n, m;
        cin >> n >> m;
        vector<vector<char>> grid(n, vector<char>(m, '#'));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cin >> grid[i][j];
            }
        }
        Solution obj;
        int ans = obj.numIslands(grid);
        cout << ans << '\n';
    }
    return 0;
}
// } Driver Code Ends