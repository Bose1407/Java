package Practice.InnerClass;



class Outer{

    int age = 5;

    class Inner{
        void sayHello(){
            System.out.println("Hello from Inner class of Outer Class");
        }
    }
}

public class InnerClass1 {

    public static void main(String[] args) {
        Outer obj = new Outer();

        System.out.println(obj.age);

        Outer.Inner obj1 = obj.new Inner();

        obj1.sayHello();

    }
    
}
