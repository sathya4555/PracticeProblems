
//1.05H
import java.util.Scanner;
class Mains {
	public static void main(String[] args) {


        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int m =s.nextInt();
        int start[]=new int[m];
        int end[]=new int[m];
        int flag[]=new int[m];
        int flag1[]=new int[m];
        int busFlag=0;
        int ringFlag=0;
        int count=0;
        int count1 =0;
        for(int i=0;i<m;i++){
            System.out.println("enter starting point");
                start[i]=s.nextInt();
            System.out.println("enter ending point");
                end[i]=s.nextInt();
                flag[i]=0;
                flag1[i]=0;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
               if(start[i] == end[j]){
                    flag[i]=1;
                }
            }
        }
        for(int i=0;i<m;i++){
            if(flag[i] == 0){
                busFlag=1;
            }
        }
        if(busFlag == 0){
            System.out.println("Ring topology");
        }else{
            for(int i=0;i<m-1;i++){
                if(end[i]==start[i+1]){
                    flag1[i]=1;
                }
            }
            for(int i=0;i<m;i++){
                if(flag1[i] == 1){
                    count1=count1+1;
                }
                if(count1==m-1){
                    System.out.println("Bus Topology");
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(start[i] == end[j] || start[i] == start[j]){
                    count=count+1;
                }
            }
            if(count >= m){
                System.out.println("Star topology");
                break;
            }
        }

      



       


    }
}