public class commonEnd {

    public static Boolean  commonEnd(Integer[] array1, Integer[] array2){
        return (array1[0].equals(array2[0]) || array1[array1.length - 1].equals(array2[array2.length - 1]));
    }

    }
