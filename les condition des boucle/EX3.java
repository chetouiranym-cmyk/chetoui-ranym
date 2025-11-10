import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        int nb,i,s;
        Scanner sc=new Scanner(System.in);
        do{
          System.out.println("donner le nombre");
        nb=sc.nextInt();
        } while((nb>10)|(nb<1));
        System.out.println("tableau de multiplication");
        for (i= 1; i<11; i++) {
            s=nb*i;
            System.out.println(nb+"*"+i+"="+s);
            
        }
        
    }
    
}
