package Collections_Core.Iterable_Explaination;


import java.util.*;

public class Introduction {
    public static void main(String[] args){
        Collection<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
