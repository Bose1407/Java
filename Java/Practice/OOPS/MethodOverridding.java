package Practice.OOPS;

//Overridding is also known as runtime plymorphism,it is achieved by inheritance....

class Some {
    void show(){
        System.out.println("Hello Its Super class");
    }
}

public class MethodOverridding extends Some {

    @Override
    void show() {
        System.out.println("Derivived ..");
    }
    public static void main(String[] args) {

        MethodOverridding obj = new MethodOverridding();

        obj.show();

    }
}
