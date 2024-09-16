package Practice.InnerClass;

class Some{
    void bruh(){
        class MethodClass{
            String name;
            MethodClass(String n){
                this.name = n;
            }
            void saySomething(){
                System.out.println(this.name+"Bruh...");
            }
        }
        MethodClass obj = new MethodClass("Bose");
        obj.saySomething();
    }
}

public class MethodLocalInnerClass {
    public static void main(String[] args) {
        Some obj1 = new Some();
        obj1.bruh();
    }
}
