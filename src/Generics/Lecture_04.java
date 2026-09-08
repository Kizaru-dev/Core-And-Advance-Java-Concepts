package Generics;

public class Lecture_04 {
   public static void main(String[] args){
       Box1<Integer> b1 = new Box1<>();
       Box1<Float> box2 = new Box1<>();
   }



}
// Generices -> T can be anythings .

// Bounds in Generics ;
// Upper bond .
class Box1<T extends Number> {
    T value ;

    public void printDouble(){
        System.out.println(this.value.doubleValue());
    }
}