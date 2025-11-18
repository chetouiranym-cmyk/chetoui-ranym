import java.util.Scanner;

public class app2 {
    public static int lecteurN(){
        Scanner sc=new Scanner(System.in);
        int n;
        do { 
            System.out.println("donner la taille de tableau");
            n=sc.nextInt();
        } while(n<10);
        return n;
    }public static void remplirTAB(double []t,int n){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            do{
            System.out.println("t["+i+"]=");
            t[i]=sc.nextDouble();} while((t[i] < 0 || t[i] > 20));
        }
    }public static double calcule_moy(double []t,int n){
        double s=0;
        for (int i = 0; i < n; i++) {
            s=s+t[i];
            
        }return (s/n);
    }public static int nombre_note(double []t,int n, double moy){
        int nb=0;
        for (int i = 0; i < n; i++) {
            if(t[i]<moy){nb=nb+1;}
            
        }return nb;
    }
    public static void main(String[] args) {
        int n;
        double moy;
        n=lecteurN();
        double[]t=new double[n];
        remplirTAB(t, n);
        moy=calcule_moy(t, n);
        System.out.println(" le nombre de note qui superieurs ala moyenne de classe"+nombre_note(t, n, moy));
    }}
