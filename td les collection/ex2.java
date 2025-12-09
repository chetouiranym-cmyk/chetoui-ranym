
import java.util.*;


public class ex2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("doner n");
        int n=sc.nextInt();
        ArrayList<String>employe=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("doner les employee");
            String ep=sc.next();
           employe.add(ep);} 
         System.out.println("donner un employe"); 
         String ep2=sc.next();
        Iterator<String>it=employe.iterator();
        while(it.hasNext()) {
           String ch= it.next();
           StringTokenizer ch1=new StringTokenizer(ch,"_");
            while(ch1.hasMoreTokens()){
         String nom=ch1.nextToken();
         String salair=ch1.nextToken();
         if(nom.equals(ep2)){
            System.out.println("empoloyee trouvee");

         }
         if(nom.equalsIgnoreCase("ali")){
          double nb = Double.parseDouble(salair);
          nb=nb+200.00;
           String nouveau = nom + "_" + nb;
        int index = employe.indexOf(ch);
        employe.set(index, nouveau);
        }
        
         
        }
            
        }
        for (int i = 0; i < n; i++) {
            System.out.println(employe.get(i));
            }
         int cop=0;
         for (int i =0 ; i <n; i++){
            StringTokenizer chn=new StringTokenizer(employe.get(i),"_");
            while(chn.hasMoreTokens()){
               String n1=chn.nextToken();
              Double s1=Double.parseDouble(chn.nextToken());
              if(s1<200.000){
               cop=cop+1;
              }
              

            }
            
         }System.out.println("le nombre de employe(<200)"+cop);
             
           

        
        
    }}
    

