import java.util.Scanner;

public class app4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        
        do { 
            System.out.println("donner n");
            n=sc.nextInt();
         } while(n<=5);
         double[] t=new double[n];
         for(int i=0;i<n;i++){
                System.out.println("donner un entier");
                t[i]=sc.nextDouble();}
                double premier = t[0];

        for (int i = 0; i < t.length - 1; i++) {
            t[i] = t[i + 1];
        }

        t[t.length - 1] = premier;
     for (int i = 0; i < n; i++) {
        System.out.println("|"+t[i]+"|");
         
     }  
    }
}
