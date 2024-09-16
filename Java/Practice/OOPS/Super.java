package Practice.OOPS;

class School{
    String name;

    School(String name){
        this.name = name;
    }
    void getName(){
        System.out.println("The Student name is "+this.name);
    }
}

class School_Marks extends School{
    String name;
    int engMarks;
    int matMarks;

    School_Marks(String name,int e,int m){
        super(name);
        this.engMarks = e;
        this.matMarks = m;
    }

    void getDetails(){
        super.getName();
        System.out.println("Your English MArks is :"+this.engMarks+" "+"Your Math marks is : "+this.matMarks);

    }

}

public class Super {
    public static void main(String[] args) {
        School_Marks obj = new School_Marks("Bose", 94, 67);
        obj.getDetails();
    }
}
