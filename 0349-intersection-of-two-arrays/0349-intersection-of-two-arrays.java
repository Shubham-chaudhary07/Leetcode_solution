import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        
        // Mark all elements from nums1 as true (present)
        for (int num : nums1) {
            map.put(num, true);
        }
        
        // If element is in map, add to result and remove to avoid duplicates
        for (int num : nums2) {
            if (map.containsKey(num)) {
                resultList.add(num);
                map.remove(num); // Prevents adding duplicate intersections
            }
        }
        
        // Convert ArrayList<Integer> to primitive int[]
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}
