package Collections_Core.Iterable_Explaination;

import java.util.Iterator;

public class Custom_Iterator_Build {
    public static void main(String[] args) {
        String names[] = {"Priya","Vinay","Sonu","Priyanshu"};
        NameContainer container = new NameContainer(names);

        Iterator<String> iterator = container.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Enhanced For Loops.
        for(String name : container){
            System.out.println(name);
        }
    }
}

class NameContainer implements Iterable<String>{
    private String[] names ;
    private int size ;

    NameContainer(String[] names ){
        this.names=names ;
        this.size = this.names.length;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int pos = 0 ;

            @Override
            public boolean hasNext() {
                return pos < size ;
            }

            @Override
            public String next() {
                return names[pos++];
            }
        };
    }

}
