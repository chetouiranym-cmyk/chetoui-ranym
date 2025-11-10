
import java.util.Scanner;

public class saisiebuffer{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("saisir une pharase");
        String ch2=sc.nextLine();
        StringBuffer ch=new StringBuffer(ch2);
         System.out.println("le contenue de sting buffer est: "+ch);
        
    } }
