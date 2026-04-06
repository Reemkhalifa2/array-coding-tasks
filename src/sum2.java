public class sum2 {
    public static Integer sum2(Integer[] nums){
        if(nums.length==0){
            return 0;}
        else if(nums.length<2){
            return nums[0];
        }else{
            return nums[0]+nums[1];
        }

    }
}
