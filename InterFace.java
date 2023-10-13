
//WAP to implement the concept Interface
interface Computer{
   void gotDevice();
}

class Developer{
    public void DeveloperWork(Computer obj){
        System.out.println("Now, We are eligible to work with a company");
        obj.gotDevice();
    }
}
class Laptop implements Computer{
    public void gotDevice(){
        System.out.println("Because We got Laptop");
    }
}
class Desktop implements Computer{
    public void gotDevice(){
        System.out.println("Because We got Desktop");
    }
}
public class InterFace{
    public static void main(String[] args) {
       Developer dev=new Developer();
       Desktop dtp=new Desktop();
       dev.DeveloperWork(dtp);
    }
}