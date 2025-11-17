
import java.util.Scanner;

public class application1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        
        do { 
            System.out.println("donner n");
            n=sc.nextInt();
         } while(n<=0);
         int[] t=new int[n];
         for(int i=0;i<n;i++){
            do { 
                System.out.println("donner un entier de deux chifres");
                t[i]=sc.nextInt();
                
            } while((t[i]<10)||(t[i]>99));
            

         }
         
         for(int i=0;i<n;i++){
            System.out.println(" |"+t[i]+"|");
         }
             
         
       sc.close();
    } 
    
}
