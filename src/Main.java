//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(firstLast6(new Integer[]{1, 2, 6}));

        }

    //Q1
    public static Boolean firstLast6 (Integer[] nums){
        Boolean found = false;
        for(Integer num :nums){
            if (num == 6){
                found = true;
            }
        }
        return found;
    }

    }
