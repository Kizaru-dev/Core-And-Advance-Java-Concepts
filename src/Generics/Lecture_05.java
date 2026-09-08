package Generics;

public class Lecture_05 {
    public static void main(String[] args){

    }
}

class Box3<T extends Animal & Swimmable>{
    T value ;

}


class Animal {
    void display(){
        System.out.println("Display Animal");
    }
}

interface  Swimmable{
    void swim();
}

class Dog extends Animal{

}

class Fish extends Animal implements  Swimmable{
    public void swim(){
        System.out.println("Display Swim");
    }

}
