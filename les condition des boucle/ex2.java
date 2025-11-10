import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        int m;
        Scanner Sc=new Scanner(System.in);
        do{
        System.out.println("doner le numero du mois");
        m=Sc.nextInt();}
        while((m<1)|(m>12));
        if(( m==12)|(m==1)|(m==2)){
            System.out.println("saison hiver");}
        else if(( m==3)|(m==4)|(m==5)){
            System.out.println("printemps");

         }else if(( m==6)|(m==7)|(m==8)){
            System.out.println("ete");
        
         }else{
             System.out.println("automne");

         }  
            
            
        
    }}
