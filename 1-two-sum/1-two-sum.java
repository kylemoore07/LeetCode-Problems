
class Solution {
    public int[] twoSum(int[] nums, int target) {
    
        int[] answer = new int[2];
        for(int i = 0; i < nums.length; i++){
           for(int second = i+1; second < nums.length; second++){
               if(nums[i]+ nums[second] == target){
                  answer[0] = i;
                  answer[1] = second;
               }
           }
       } 
        return answer; 
}
   
}