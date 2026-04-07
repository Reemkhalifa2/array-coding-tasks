public class fix23 {
    public static Integer[] fix23(Integer[] nums){
        if (nums[0] == 2 && nums[1] == 3)
            nums[1] = 0;
        if (nums[1] == 2 && nums[2] == 3)
            nums[2] = 0;
        return new Integer[] {nums[0],nums[1],nums[2]};
    }
}
