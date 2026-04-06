public class double23 {
    public static Boolean double23(Integer [] nums){
        if(nums.length<2){
            return false;
        }
        return nums[0]==2&&nums[1]==2 || nums[0]==3&&nums[1]==3;
    }
}
