package Generics;

public class Lecture_03 {
    public static void main(String[] args){
        String y = getResult("Hello");
        System.out.println(y);

        printPair("11" , "Second");
    }
    public static<T>  T getResult(T x){  // <T> type parameter .
        return x ;
    }

    public static<T,U> void  printPair(T first , U second){
        System.out.println(first + "  " + second);
    }
}

// Generic Method .
