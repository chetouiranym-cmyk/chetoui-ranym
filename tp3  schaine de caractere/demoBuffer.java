public class demoBuffer{
    public static void main(String[]args){
        StringBuffer ch1=new StringBuffer("j");
        StringBuffer ch2=new StringBuffer();
        ch2=ch2.append("l");
        System.out.println("ch2="+ ch2);
        StringBuffer ch_sb=ch1;
        ch1.append("ava");
        ch_sb.append("est sensible a la case");
        System.out.println("contenu de ch_sb:"+ch_sb);
        System.out.println("cotenue de ch1:"+ch1);
         boolean test=(ch_sb ==ch1);
        if(test){
            System.out.println("ch_sp et ch1 poitenent sue la meme objet");}
        else{
            System.out.println("ch_sp et ch1 poitenent sur un objet different");
        }  
         ch2.append("angage");
        System.out.println("ch2= "+ch2);



        


    }
}