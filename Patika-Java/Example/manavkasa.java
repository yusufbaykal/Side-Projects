import java.util.Scanner;
public class NewMain1 {

     
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int armut,elma,domates,muz,patlıcan;
        System.out.println("Armut kaç kilo");
        armut = klavye.nextInt();
        System.out.println("Elma kaç kilo");
        elma = klavye.nextInt();
        System.out.println("Domates kaç kilo");
        domates = klavye.nextInt();
        System.out.println("Muz kaç kilo");
        muz = klavye.nextInt();
        System.out.println("Patlıcan kaç kilo");
        patlıcan = klavye.nextInt();
        
        double tutar =  armut*2.14;
        double tutar1 = elma*3.67;
        double tutar2 = muz*0.95;
        double tutar3 = domates*1.11;
        double tutar4 = patlıcan*5;
        double toplam = tutar+tutar1+tutar2+tutar3+tutar4;
        
        
                
        System.out.println("Alınan tüm ürünlerin toplam tutarı:"+toplam);
        
        
        
        
    }
    
}
