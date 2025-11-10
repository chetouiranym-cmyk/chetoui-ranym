import java.util.Scanner;
public class ex4{

    public static void main(String[] args) {
        int x,i,fact;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("donner un entier");
        x=sc.nextInt();}
        while(x<0);
        fact=1;
        for (i=1;i < x; i++) {
            fact=fact*i;
            
        }System.out.println("fact est "+fact);
        
    





    
        
        
}}