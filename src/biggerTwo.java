public class biggerTwo {
    public static Integer[] biggerTwo(Integer[]a, Integer[]b){
        if (a[0]+a[1] >= b[0]+b[1]){
            return a;
        }else {
            return b;
        }
    }
}
