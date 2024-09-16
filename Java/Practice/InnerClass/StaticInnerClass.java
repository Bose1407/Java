package Practice.InnerClass;

class Some{
    static class Inner{
        void sayHello(){
            System.out.println("This is a Static Inner Class");
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        Some obj = new Some();

        Some.Inner obj1 = new Some.Inner();

        obj1.sayHello();
    }
    
}
