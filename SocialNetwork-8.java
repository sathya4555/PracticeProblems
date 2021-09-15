
// import java.util.Scanner;
// class Mains2 {
// 	public static void main(String[] args) {
//         Scanner s= new Scanner (System.in);
//         System.out.println("enter no of Users");
//         int n = s.nextInt();
//         int count=0;
//         int group=0;
//         for(int i=2;i<n+1;i++){
//             for(int j=2;j<i/2;++j){
//                 if(i%j==0){
//                     count+=1;
//                 }
//                 if(count>=1 && j != 3){
//                     group+=1;
//                 }
              
//             }
//             count=0;
//         }
//         System.out.println("group = "+ (group));
//     }
// }

public class  {

    public static void main(String[] args) {
  
      int num = 29;
      boolean flag = false;
      for (int i = 2; i <= num / 2; ++i) {
        // condition for nonprime number
        if (num % i == 0) {
          flag = true;
          break;
        }
      }
  
      if (!flag)
        System.out.println(num + " is a prime number.");
      else
        System.out.println(num + " is not a prime number.");
    }
  }