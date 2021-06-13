
package dsaseries;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows == 0) return list;
        
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        list.add(first_row);
        
        for(int i =1; i < numRows; i++){
            List<Integer> prev = list.get(i-1);
            List<Integer> curr = new ArrayList<>();
            
            curr.add(1);
            
            //Here only interate for the previious row length it will be i+1 and so j =1  it will do that
            for(int j = 1; j < prev.size(); j++){
                curr.add(prev.get(j-1) + prev.get(j));
            }
            curr.add(1);
            list.add(curr);
        }
        return list;
    }
}
