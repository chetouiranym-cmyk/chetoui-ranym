
import java.util.Scanner;

public class app5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        do { 
            System.out.println("donner n");
            n=sc.nextInt();
         } while(n<=0);
         int[] t=new int[n];
         int[] t1=new int[100];
        int[] t2=new int[100];
         for(int i=0;i<n;i++){
                System.out.println("donner un entier");
                t[i]=sc.nextInt();}
                int j=0;
                int k=0;
        for (int i = 0; i < n; i++) {
            if (t[i]%2==0){
                t1[j]=t[i];
                j++;
                } 
           else{
                t2[k]=t[i];
                k=k+1;
            }
            
        }int n1=j;
        int n2=k;
        for (int i =0; i < n; i++) {
        System.out.println("|"+t[i]+"|");}
        System.out.println("le tab paire");
        for (int a =0; a<n1; a++) {
        System.out.println("|"+t1[j]+"|");}
        System.out.println("le tab impaire ");
        for (int s =0; s<n2; s++) {
        System.out.println("|"+t2[s]+"|");}
               
                      
    
}
}
