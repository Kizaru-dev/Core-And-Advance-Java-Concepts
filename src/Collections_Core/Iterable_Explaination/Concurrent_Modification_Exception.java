package Collections_Core.Iterable_Explaination;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Concurrent_Modification_Exception {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//        for (int value : list) {
//            if (value == 3) {
//                list.remove(value);
//            }
//            System.out.println(value);
//        }

    }

}
