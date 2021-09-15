//17Min
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CodingMarathon10 {
    public static void main(String[] args) {
    
        int n=0,k=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter length of an array and K");
        n=s.nextInt();
        k=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter array value "+i);
                arr[i]=s.nextInt();
        }   
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
        System.out.println("Sorted array= "+arr[i]);
        }

        int sum=0;
        int last=n-1;
        for(int i=1;i<=k;i++){
            sum=sum+arr[last];
            last+=-1;
        }
        System.out.println("Sum= "+sum);

    }
}
