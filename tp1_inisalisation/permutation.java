import java.util.Scanner;
public class permutation{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("donner a et b");
        a=sc.nextInt();
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+"b="+b);
    
    }
}