public class ex2{
    public static void main(String[] args) {
        int n1=14;
        int n2=16;
        int n3=13;
        Double moy=(n1+n2+n3)/3.0;
        System.out.println("la moyen est"+moy);
        System.out.println("la moyen est:%.2f\n"+moy);
        if(moy>10)
        {System.out.println("admis");}
        else{
            System.out.println("ajourne");
        }
    }
    
}