package Practice.Matrix;



public class Sumofdiagonal {
    public static void main(String[] args) {
        int a[][] ={
            {1,2,3},
            {4,5,6},
            {8,8,9}
        };
        int primarydiagonal = 0 ;
        int secondarydiagnol = 0;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(i==j){
                    primarydiagonal = primarydiagonal + a[i][j];
                }
            
                if((i+j)==a.length-1){
                    secondarydiagnol = secondarydiagnol + a[i][j];
                }
            }
        }
        int result = primarydiagonal + secondarydiagnol;
        System.out.println("The value of Primary Diagonal is "+primarydiagonal);
        System.out.println("The value of Secondary Diagonal is " + secondarydiagnol);
        System.out.println("The Sum Of Diagonal Elemrnt is  " + result);
    }

}
