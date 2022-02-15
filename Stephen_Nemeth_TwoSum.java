class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap<>();
        
        int[] answer = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (set.containsKey(diff)) {
                answer[0] = set.get(diff);
                answer[1] = i;
                break;
            } else {
                set.put(nums[i], i);
            }
        }
        return answer;
    }
}
