import java.util.Scanner;
import java.util.StringTokenizer;
public class ex5{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String ch=sc.nextLine();
        StringTokenizer cht=new StringTokenizer(ch);
        int n= cht.countTokens();
        String voyel="auoyie";
          String mot2="";
       while(cht.hasMoreTokens()){
         String mot= cht.nextToken();
         int v=0;
         
         for (int i = 0; i < mot.length(); i++)
          {if(voyel.indexOf(mot.charAt(i))!=-1)
          {v=v+1;}}
          if(mot.length()>mot2.length())
          {mot2=mot;}
          System.out.println(mot+" le nombre de voyele" +v);
        
           
       } System.out.println("la plus laugue mot"+mot2);
       System.out.println( "les nombres de mot"+n);

        
        
        
        
        
        }}