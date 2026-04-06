//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(firstLast6(new Integer[]{1, 2, 6}));
        Integer[] array1 = {1,2,4};
        Integer[] array2 = {7,3};
        System.out.println(commonEnd(array1, array2));

        }


    //Task1
    public static Boolean firstLast6 (Integer[] nums){
        Boolean found = false;
        for(Integer num :nums){
            if (num == 6){
                found = true;
            }
        }
        return found;
    }

    //Task 2
    public static Boolean commonEnd(Integer[] array1, Integer[] array2){
        Boolean found = false;
        if(array1.length > 0 && array2.length > 0) {
            if(array1[0].equals(array2[0]) || array1[array1.length - 1].equals(array2[array2.length - 1])){
                found = true;
            }
        }
        return found;
    }

    }
