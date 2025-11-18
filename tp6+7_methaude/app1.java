
import java.util.Scanner;

public class app1 {
    
    public static int lecteurN(){
        Scanner sc=new Scanner(System.in);
        int n;
        do { 
            System.out.println("donner la taille de tableau");
            n=sc.nextInt();
        } while(n<=0);
        return n;
    }public static void remplirTAB(int[]t,int n){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("t["+i+"]=");
            t[i]=sc.nextInt();
        }
    }
    public static void remplacer(int[]t, int n){
         Scanner sc=new Scanner(System.in);
        int x1,x2;
        System.out.println("donner les deux entier");
        x1=sc.nextInt();
        x2=sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (t[i]==x1){t[i]=x2;}

            
        }
    }
    public static void afficheTab(int[]t,int n){
        for (int i = 0; i < n; i++) {
            System.out.println(t[i]+"|");
            
        }

    }
    public static void main(String[] args) {
        int n;
        n=lecteurN();
        int[]t=new int[n];
        remplirTAB(t, n);
        remplacer(t, n);
        afficheTab(t, n);
    }
    
}
