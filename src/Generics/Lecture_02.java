package Generics;

import java.awt.geom.PathIterator;

public class Lecture_02 {
    public static void main(String[] args){

        Pair<Integer,String> pair = new Pair<>(23,"String");

    }
}

class Pair<T,U>{
    T first ;
    U second ;
    Pair(T first , U second){
        this.first = first ;
        this.second = second ;
    }
}
