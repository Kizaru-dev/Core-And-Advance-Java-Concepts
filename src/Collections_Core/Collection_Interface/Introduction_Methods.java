package Collections_Core.Collection_Interface;


import java.util.*;

public class Introduction_Methods {
    public static void main(String[] args){

        Collection<Integer> c = new HashSet<>();

        c.add(1);
        c.add(2);
        c.add(3);

        // Size .
//        int n = c.size();
//        System.out.println(c.size());
//
//        System.out.println(c.isEmpty());
//
//        // boolean contains(Object o);
//        System.out.println(c.contains(2));

        // iterate() -> Iterator

        // Object toArray();
//
//        Object[] array = c.toArray();
//
////        for(Object object : array){
////            System.out.println(object);
////        }
//
        Integer[] arr = c.toArray(new Integer[0]);

        // boolean add(E e);
        boolean b = c.add(3);
        System.out.println(b);

        // boolean remove (Object obj) ;

        System.out.println(c.remove(4));


//        // boolean addAll(Collection<? extends E> c)
//        c.addAll(List.of(4,3,3,3,2,3,2,3,3));
//        System.out.println(c);

        //  boolean containsAll(Collection<?> c);
        System.out.println(c.containsAll(List.of(1,2,3)));

        // boolean removeAll(Collections<?> c);

        // boolean retainAll() ---> Intersection .

        c.retainAll((List.of(2,1)));
        System.out.println(c);

        c.clear();
        System.out.println(c);

        // equals()  , hashCode() , toString() , getClassName()

    }
}



// add , remove , addAll , removeAll , retainAll, contains , containsAll , toArray , toArray, iterator , size , isEmpty