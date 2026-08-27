class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
         // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the number that appears once
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }
}