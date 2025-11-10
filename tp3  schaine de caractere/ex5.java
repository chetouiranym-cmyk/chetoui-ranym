import java.util.Scanner;

public class ex5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int nb=0;
        char c;
        String ch;
        do{
        System.out.println(" donner ch");
         ch=sc.nextLine();}
        while(ch.length()>50);
        for (int i = 0; i <ch.length(); i++) {
            c=ch.charAt(i);
            if((c>='a')&&(c<='z')){
                nb=nb+1;
            }}
        System.out.println("le nombre de lettre muniscule est "+nb);    
    
    
    
    
    
    
    
    
    
    }}