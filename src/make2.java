public class make2 {
    public static Integer[] make2(Integer [] a, Integer [] b){
        Integer[] Result = new Integer[2];

        if (a.length >= 2) {
            Result[0] = a[0];
            Result[1] = a[1];
        } else if (a.length == 1) {
            Result[0] = a[0];
            Result[1] = b[0];
        } else {
            Result[0] = b[0];
            Result[1] = b[1];
        }

        return Result;

    }}
