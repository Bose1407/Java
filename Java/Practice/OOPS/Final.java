package Practice.OOPS;

/*
 * In Java Final keyword is used to Declare Variables , methods and class
 * variables declared as final act  as constants..
 * methods declared as final cannot be overridden...
 * classes declared as Final cannot be inherited...
 */

class Some{
    final int a =10;
    final void display(){
        System.out.println("HElllo Mf");
    }



}




public class Final extends Some {
    public static void main(String[] args) {
        Final obj = new Final();
        try {
           System.out.println("Poda ");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
