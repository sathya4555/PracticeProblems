//0.37H

import java.util.Scanner;
class Mains1 {
	public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        System.out.println("enter no of bus stops");
        int n = s.nextInt();
        int arr[]=new int[n];
        int resarr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter starting point");
                arr[i]=s.nextInt();
                resarr[i]=arr[i];
        }
        for(int i=1;i<n;i++){
            resarr[i]=resarr[i]-resarr[0];
        }
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j++){
                if(i%j==0){
                    if(i!=j)
                    resarr[j]=arr[j]-arr[i];
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("array output"+ resarr[i]);
        }
        

    }
}