/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         int m,ann,nbj;
         Scanner sc=new Scanner(System.in);
         do{
         System.out.println("de quel mois sa git il");
         m=sc.nextInt();}while((m<1)|(m>12));
         
         System.out.println("de quel annees sa git il");
         ann=sc.nextInt();
         if((m==1)|(m==3)|(m==5)|(m==7)|(m==8)|(m==10)|(m==12))
         {
            nbj=31;
            System.out.println("en"+ann+"le mois n°"+m+"a"+nbj);
            
         }
         else if((m==4)|(m==6)|(m==9)|(m==11)|(m==8)) {
            nbj=30;
            System.out.println("en"+ann+"le mois n°"+m+"a"+nbj);


         }else{
             if((((ann%4)==0)&((ann%100)!=0))|((ann%400)==0)){
                 nbj=29;}
             else{
                     nbj=28;
                 }
                 
             System.out.println("en"+ann+"le mois n°"+m+"a"+nbj);
     
         }
        
         
         

        
    }
}

