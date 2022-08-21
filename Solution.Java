class Solution {
    public int minimumOperations(int[] nums) {
            Set<Integer> hash = new HashSet<>();
            for(int i: nums){
                if( i != 0)
                    hash.add(i);
            }
            return hash.size();
        }
}