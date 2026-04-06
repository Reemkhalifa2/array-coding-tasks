public class front11 {
    public static Integer[] front11(Integer [] a, Integer [] b){
        if (a.length > 0 && b.length > 0) {
            return new Integer[] {a[0], b[0]};
        }
        else if (a.length > 0) {
            return new Integer[] {a[0]};
        }
        else if (b.length > 0) {
            return new Integer[] {b[0]};
        }
        else {
            return new Integer[0];
        }
    }
}
