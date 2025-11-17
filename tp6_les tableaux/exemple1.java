import java.util.Scanner;

public class exemple1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int t[]=new int[20];
       int n;
       do{
        System.out.println("donner la taille de tableaux");
        n=sc.nextInt();
       }while (n<0);
       for(int i=0;i<n;i++){
        t[i]=sc.nextInt();
       }
       int s=0;
    for(int i=0;i<n;i++){
        s=s+t[i];

    }
    System.out.println("la somme = "+s);
}
}