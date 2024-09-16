package Practice.InnerClass;

abstract class Abstract{
    abstract  void say();
}

class Diff{
    void create(){
        Abstract obj = new Abstract() {
            void say() {
                System.out.println("Hi from Anonymous Abstract class....");
            }
        };
        obj.say();
    }
}

public class AnonymousAbstractClass {

    public static void main(String[] args) {
        Diff obj1 = new Diff();
        obj1.create();
    }
    
}
