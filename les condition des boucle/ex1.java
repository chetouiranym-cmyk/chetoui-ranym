import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Double t;
        Scanner sc=new Scanner(System.in);
        System.out.println("donner la tempurature d eau");
        t=sc.nextDouble();
        if(t<=0){
            System.out.println("glace");

        }else if((t>0)&(t<=100)){
            System.out.println("eau");

        }
        else{
            System.out.println("vapeur");
        }

    }
    
}
