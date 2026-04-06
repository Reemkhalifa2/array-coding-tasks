public class maxTriple {
    public static Integer maxTriple(Integer [] nums){
        Integer size =nums.length;
        if(nums[0]>nums[size-1] && nums[0]>nums[size/2]){
            return nums[0];}
        else if (nums[size/2]>nums[0] && nums[size/2]>nums[size-1]){
            return nums[size/2];
        }else{
            return nums[size-1];
        }
    }
}
