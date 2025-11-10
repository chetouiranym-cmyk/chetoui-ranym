import java.util.Scanner;

public class ex4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String res="";
        char c;
        String ch;
        do{
        System.out.println(" donner ch");
         ch=sc.nextLine();}
        while(ch.length()>30);
        for (int i = 0; i <ch.length(); i++) {
            c=ch.charAt(i);
            if((c>='a')&&(c<='z')){
                c=(char)('a'+(c-'a'+ 3)%16);
                System.out.println('a');}
            else if((c>='A')&&(c<='Z')){
                c=(char)('A'+(c-'A'+ 3)%16);    

            } 
            res=res+c;  

        

            
        }
        System.out.println(res);
 }}