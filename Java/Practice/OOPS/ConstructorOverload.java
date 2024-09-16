package Practice.OOPS;

public class ConstructorOverload {

    int regNo;
    String name;

    ConstructorOverload(int r,String n){
        regNo = r;
        name = n;
    }
    ConstructorOverload(){
        System.out.println("Default constructor here ");
    }

    ConstructorOverload(int a){
        System.out.println("One parameter Constructor here");
    }


    void printDetails(){
        System.out.println("Hello "+this.name+" "+"Your Register Number is "+this.regNo);
    }
    public static void main(String[] args) {
        ConstructorOverload obj1 = new ConstructorOverload(8283, "Bose");
        obj1.printDetails();
        ConstructorOverload obj2 = new ConstructorOverload();
        ConstructorOverload obj3 = new ConstructorOverload(8283);
    }
}
