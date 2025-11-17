import java.util.Scanner;

public class app3 {
    public static boolean rech_seq(int[]t, int x,int n){
        boolean test=false;
        for (int i = 0; i < n; i++) {
            if(t[i]==x){
                test=true;}
                break;
        }
        return test;

    }
    public static int nbocc(int[]t,int x,int n){
        int nb=0;
        for (int i = 0; i < n; i++) {
            if(t[i]==x){
                nb=nb+1;}

    }return  nb;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,x,b;
        System.out.println("donner x");
            x=sc.nextInt();
        do { 
            System.out.println("donner n");
            n=sc.nextInt();
         } while(n<=0);
         int[] t=new int[n];
         for(int i=0;i<n;i++){
                System.out.println("donner un entier");
                t[i]=sc.nextInt();}

    if(rech_seq(t,x,n)){
    b=nbocc(t,x,n);
    System.out.println(x+" est existe "+b+" est le nombre d occurance");}
    }
}
