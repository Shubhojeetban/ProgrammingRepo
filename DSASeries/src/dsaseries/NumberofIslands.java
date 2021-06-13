/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsaseries;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ACER
 */

public class NumberofIslands {
    private void callDfs(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        
        callDfs(grid, i+1, j); //up
        callDfs(grid, i-1, j); //down
        callDfs(grid, i, j-1); //left
        callDfs(grid, i, j+1); //right
        
    }
    public int numIslands(char[][] grid) {
        int count =0;
        for(int i =0; i < grid.length; i++){
            for(int j =0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    callDfs(grid, i, j);
                }
            }
        }
        return count;
    }
    
}
