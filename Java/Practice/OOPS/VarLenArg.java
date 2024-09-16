package Practice.OOPS;

class Add{
    int add(int ...i){

        int sum = 0;

        for(int value:i)
            sum = sum + value;
        return sum;
    }
}

public class VarLenArg {
    public static void main(String[] args) {
        Add Obj = new Add();
        System.out.println(Obj.add(1,2,3,4,5,6,7,8,9));
        
    }
}
