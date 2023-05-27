abstract class Parent{
    abstract void Greet();//we will have to override this function in the Child or derived class

    void Text()//We could also declare and define function in abstract classes
    {
        System.out.println("This is some random text");
    }
}
//extends is used for inheritance 
class Child extends Parent{
    void Greet() // We will have to override this function otherwise we will have to make it abstract class
    {
        System.out.println("Have a astonishing day ");
    }

}
public class AbstractClass {
    public static void main(String []args)
    {

        Child obj=new Child();
        obj.Greet();//This is abstract class method which we have to override in the Derived Class
        obj.Text();// This method exist in abstract class we have defined it 

    }
    
}
