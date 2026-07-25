class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> fre = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int count = fre.merge(nums[i], 1, Integer::sum);

            if(count > 1){
                return true;
            }
        }
        return false;   
    }
}