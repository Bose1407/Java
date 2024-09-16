package Practice.OOPS;

public class ForEach {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        for(int value : a){
            System.out.print(value+" ");
        }
        System.out.println();

        int b[][] = {{1,2,3},{4,5,6}};
        for(int temp[]:b){
            for(int value : temp){
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
