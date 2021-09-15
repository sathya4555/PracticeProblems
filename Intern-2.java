// Time 0.5H
import java.util.Scanner;
class Main {
	public static void main(String[] args) {

        Scanner s= new Scanner (System.in);
        System.out.println("enter no of interns");
        int number_of_interns= s.nextInt();
        System.out.println("enter password");
        int password= s.nextInt();
        int sum=5000;
       for(int i=1;i<=number_of_interns;i++){
            sum=sum*i;
            if(sum==password){
           
                System.out.println("match found = "+sum+"and the day is"+ i);
            }
            for(int j=0;j<=10;j++){
                sum=sum+5000+j;
                if(sum==password){
                    // flag = 1;
                    System.out.println("match found = "+sum+"and the day is"+ j+"intern number is "+(i+1));
                }
            }
            sum=5000;
     }
        



    }
}
