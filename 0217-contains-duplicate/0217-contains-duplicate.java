import java.util.HashSet;
import java.util.Set;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> con=new HashSet<>();
        for(int x: nums){

            if(con.contains(x)){
                return true;
            }
            else{
                con.add(x);
            }
        }
        return false;
    }
}