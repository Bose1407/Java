package Practice.OOPS;

class Demo{
    private int age = 15;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        obj1.setAge(19);
        System.out.println("Age is = " + obj1.getAge());

    }
}
