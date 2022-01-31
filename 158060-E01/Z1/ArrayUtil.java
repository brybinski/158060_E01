package Z1;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtil {

    //może implementować comparable, ale nie musi :)
    public static <T> ArrayList<T> removeRepeatedElements(ArrayList<T> arr){
        ArrayList<T> result = new ArrayList<>();
        for(T i: arr){
            boolean present = false;
            for(T j: result){
                if (j.equals(i)) {
                    present = true;
                    break;
                }
            }
            if(!present)
                result.add(i);

        }
        return result;
    }
    public static void main(String[] Args){
        ArrayList<Character> chr = new ArrayList(List.of(new Character[]{'f', 'f', 'g'}));
        ArrayList<LocalTime> lt = new ArrayList(List.of(new LocalTime[]
                            {LocalTime.of(12, 23),
                                    LocalTime.of(12, 23),
                                    LocalTime.of(12, 24)}));


        removeRepeatedElements(chr).forEach(System.out::println);
        removeRepeatedElements(lt).forEach(System.out::println);

    }
}
