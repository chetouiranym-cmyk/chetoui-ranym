import java.util.Scanner;

public class app2 {
    public static  boolean paire(int x){
        if(x%2==0)
        {return true;}
        else{
            return false;
        }

    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n;
        
        do { 
            System.out.println("donner n");
            n=sc.nextInt();
         } while(n<=0);
         int[] t=new int[n];
         for(int i=0;i<n;i++){
                System.out.println("donner un entier");
                t[i]=sc.nextInt();}
            int s=0;    
         for (int i = 0; i < n; i++) {
            if(paire(t[i])==false){
                s=s+t[i];
            }
             
         }System.out.println(s);       
            
            
    }
}
