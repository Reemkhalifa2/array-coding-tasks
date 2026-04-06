public class fix23 {
    public static Integer[] fix23(Integer[] nums){
        for(Integer num : nums){
            if(nums[num]==2 && nums[num+1]==3){
                nums[2] = 0;
            }
        }
        return nums;
    }
}
