public class frontPiece {
    public static Integer[] frontPiece(Integer[] nums){
        if(nums.length==0){
            return new Integer[]{};}
        else if(nums.length<2){
            return new Integer[]{nums[0]};
        }else{
            return new Integer[]{nums[0], nums[1]};
        }
    }
}
