import java.util.Scanner;

public class Document09Array {
    public static void main(String []args){
        String str;
        String tempStr="";
        Scanner s = new Scanner(System.in);
        System.out.println("enter String");
        str=s.nextLine();
        for(int i=0;i<=str.length()-4;i++){
            if(str.charAt(i) == '-' && str.charAt(i+3)!='-'){
                for(int j=0;j<=3;j++){
                    tempStr=String.valueOf(str.charAt(i))+String.valueOf(str.charAt(i+1));
                }
            }
        }
        System.out.println(tempStr);
    }
}
