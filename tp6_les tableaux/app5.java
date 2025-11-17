
import java.util.Scanner;

public class app5 {
    public static  boolean paire(int x){
        if(x%2==0)
        {return true;}
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        int[]t1=new int[t1.length];
        int[]t2=new int[t2.length];
        do { 
            System.out.println("donner n");
            n=sc.nextInt();
         } while(n<=0);
         int[] t=new int[n];
         
         for(int i=0;i<n;i++){
                System.out.println("donner un entier");
                t[i]=sc.nextInt();}
        for (int i = 0; i < n; i++) {
            if (paire(t[i])){
                for (int j = 0; j < n; j++)
                 {t1[j]=t[i];
                    
                }
            }else{
                for (int k = 0; k < n; k++) {
                    t2[k]=t[i];
                }
            }
            
        }
        for (int i = 0; i < n; i++) {
        System.out.println("|"+t[i]+"|");}
        System.out.println("le tab paire");
        for (int i = 0; i < t1.length; i++) {
        System.out.println("|"+t1[i]+"|");}
        System.out.println("le tab impaire ");
        for (int i = 0; i < t2.length; i++) {
        System.out.println("|"+t2[i]+"|");}
               
                      
    
}
}
