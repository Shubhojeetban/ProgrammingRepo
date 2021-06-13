/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsaseries;

/**
 *
 * @author ACER
 */
public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int positive_pointer = 0;
        while (positive_pointer < n && nums[positive_pointer] < 0) {
            positive_pointer++;
        }
        int negative_pointer = positive_pointer - 1;
        int[] sorted_squares = new int[n];
        int counter = 0;

        while (negative_pointer >= 0 && positive_pointer < n) {
            if (nums[negative_pointer] * nums[negative_pointer] < nums[positive_pointer] * nums[positive_pointer]) {
                sorted_squares[counter] = nums[negative_pointer] * nums[negative_pointer];
                counter++;
                negative_pointer--;
            } else {
                sorted_squares[counter] = nums[positive_pointer] * nums[positive_pointer];
                positive_pointer++;
                counter++;
            }
        }

        while (positive_pointer < n) {
            sorted_squares[counter] = nums[positive_pointer] * nums[positive_pointer];
            positive_pointer++;
            counter++;
        }
        while (negative_pointer >= 0) {
            sorted_squares[counter] = nums[negative_pointer] * nums[negative_pointer];
            counter++;
            negative_pointer--;
        }
        
        return sorted_squares;
    }
}
