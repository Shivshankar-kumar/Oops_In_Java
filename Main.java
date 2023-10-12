
//Wap to achieve polymorphism in java with Abstraction

import java.util.Scanner;

abstract class Shape{
    Scanner sc=new Scanner(System.in);
    float Area;
    abstract public void input();
    abstract public void compute();
     public void display(){
        System.out.println("Total result of Area: "+Area);
        System.out.println("--------------------------------------------------");
    }
}

//child class
class Rectangle extends Shape{
    //Scanner sc=new Scanner(System.in);
    float len, width;
    public void input(){
        System.out.println("Enter the Length: ");
        len=sc.nextFloat();
        System.out.println("Enter the Width: ");
        width=sc.nextFloat();

    }
    public void compute(){
        Area=len * width;
    }
}

//child-2 class
class Square extends Shape{
    float len;
    public void input(){
        System.out.println("Enter the Length of Square: ");
        len=sc.nextFloat();
    }
    public void compute(){
        Area=len*len;
    }
}

//child-3 class
class circle extends Shape{
    float redius;
    public void input(){
        System.out.println("Enter the redius: ");
        redius=sc.nextFloat();
    }

    public void compute(){
        Area=(3.14f * redius * redius);
    }
}

//class to call all abstract method receiving reference of child class
class Geometery{
    //method , where its receiving reference
    public void polymorphism(Shape ref){
        ref.input();
        ref.compute();
        ref.display();
    }
}
public class Main{
    public static void main(String[] args) {
       //object of all Child class
       Rectangle r=new Rectangle();
       Square s=new Square();
       circle c=new circle();
       
       // object and calling to polymorphism method by passing reference
       Geometery g=new Geometery();
       g.polymorphism(r);
       g.polymorphism(s);
       g.polymorphism(c);
    }
}