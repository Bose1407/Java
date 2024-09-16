package Practice.OOPS;

class Animal{
    static void sound(){
        System.out.println("WOWOWOWOWOWOWO");
    }
}

class Student{
    String name;
    int age;
    static String schoolName;

    Student(String name,int age){

        this.name = name;
        this.age = age;
    }
    static{
        schoolName = "Deku";
    }

    void printDetails(){
        System.out.println("Student Name : "+this.name+"\nStudent Age : "+age+"\n Student School name : "+schoolName);
    }
}



public class Static {
    public static void main(String[] args) {
        Animal.sound();

        Student s1 = new Student("Bose", 19);
        Student s2 = new Student("Madhu", 22);
        s1.printDetails();
        s2.printDetails();

        
    }
}
