
import java.util.Scanner;

public  class ex4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("donner un entier");
        int n=sc.nextInt();
        int s=0;
        for (int i = 0; i < n; i++) 
        {s=s+i;
            
        }System.out.println("la somme des entiers de 1 a "+n+"est:"+s);
    }
}