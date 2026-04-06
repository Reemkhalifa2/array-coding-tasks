
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(firstLast6.firstLast6(new Integer[]{1, 2, 6}));
        Integer[] array1 = {1,2,4};
        Integer[] array2 = {7,3};
        System.out.println(commonEnd.commonEnd(array1, array2));
        Integer [] Reslut = reverse3.reverse3(new Integer[]{1, 2, 6});
        for(Integer n : Reslut){
            System.out.println(n);
        }
        Integer [] middle = middleWay.middleWay(new Integer[]{1, 2, 6},new Integer[]{1,4,8});
        for(Integer n : middle){
            System.out.println(n);
        }
        System.out.println(no23.no23(new Integer[]{1,1}));
        Integer [] r = fix23.fix23(new Integer[]{1, 2, 3});
        for(Integer n : r){
            System.out.println(n);
        }

    }





}
