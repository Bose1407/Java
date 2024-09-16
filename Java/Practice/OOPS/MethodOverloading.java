package Practice.OOPS;

// overloading is also knows as compile time polymorophism...

class Overload{
    void display(String name){
        System.out.println("name :" + name);
    }

    void display(int age){
        System.out.println("Age "+age);
    }

    boolean display(boolean age){
        return true;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.display("bose");
        obj.display(19);
        System.out.println(obj.display(false));
    }
}
