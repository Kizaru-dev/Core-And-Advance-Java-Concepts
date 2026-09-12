package Collections_Core.List_Class;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Introduction {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        System.out.println(list.get(1));
//          list.set(2,4);
        System.out.println(list);
        list.addAll(0,List.of(9,2,3));
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.indexOf(2));
        System.out.println(list.lastIndexOf(4));

//        ListIterator<Integer> iterator = list.listIterator();
//
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        List<Integer> list1 = List.of(1,2,3,4,5,6,7,8);
        System.out.println(list1);

        List<Integer> list2 = List.copyOf(list1);
    }
}
