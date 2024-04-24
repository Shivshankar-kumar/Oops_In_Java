
//Wap to an example of Anonymous class--
//functional interface are those interface which have only one abstract method
@FunctionalInterface
interface Car{
    void drive();
}
public class anonymousClass {
    public static void main(String[] args) {
        //Here we can't instanciate of an Interface
        //So, This is an Anonymous class
        Car cr=new Car() {
            public void drive(){
                System.out.println("People can drive a car..");
            }
        };

        //calling drive method which is declared inside an interface
        cr.drive();
    }
}
