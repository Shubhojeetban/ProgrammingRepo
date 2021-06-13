/*
 Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). 
Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

Notice that you may not slant the container.
 */
package dsaseries;

/**
 *
 * @author ACER
 */
public class ContainerWithMostWater {
    public int maxArea(int[] ar) {
        int i =0, j = ar.length-1, global_area =Integer.MIN_VALUE;
        
        while(i < j)
        {
            int length = Math.min(ar[i], ar[j]);
            int breadth = j-i;
            int area = length * breadth;
            
            if(area > global_area)
                global_area = area;
            
            if(ar[i] < ar[j])
                i++;
            else
                j--;
        }
        return global_area;
    }
}
