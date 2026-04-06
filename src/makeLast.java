public class makeLast {
    public static Integer[] makeLast(Integer [] nums){
        Integer[] result = new Integer[nums.length*2];
        for(int i=0;i< result.length-1;i++){
            result[i]=0;
        }
        result[result.length-1]= nums[nums.length-1];
        return  result;
    }
}
