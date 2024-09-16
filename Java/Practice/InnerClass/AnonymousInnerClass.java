package Practice.InnerClass;

class Some1{
    void something(){
        System.out.println("Not Modified Method . . . .. ");
    }
}

public class AnonymousInnerClass {

    public static void main(String[] args) {
        Some1 obj1 = new Some1(){
            void something(){
                System.out.println("Modified Method . . . .. ");
            }
        };
        Some1 obj = new Some1();

        obj.something();

        obj1.something();
    }
    
}
