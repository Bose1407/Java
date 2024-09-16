package Practice.OOPS;

abstract class Some {
    abstract void show();

    void hello(){
        System.out.println("Its another function");
    }
}

class Abstract extends Some{
    void show(){
        System.out.println("Hello its abstract class implemented");
    }
}

public class AbstractMain{
    public static void main(String[] args) {
        Abstract obj = new Abstract();
        obj.show();
        obj.hello();
    }
}




