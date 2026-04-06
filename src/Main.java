
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(firstLast6(new Integer[]{1, 2, 6}));
        }
    //Task 1: firstLast6
    public static Boolean firstLast6 (Integer[] nums){
        return nums[0] == 6 || nums[nums.length-1] == 6;
    }




}
