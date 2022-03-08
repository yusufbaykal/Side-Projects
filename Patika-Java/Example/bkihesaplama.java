import java.util.Scanner;
public class ilk20 {

    
    public static void main(String[] args) {
            Scanner klavye = new Scanner(System.in);
            System.out.println("Boyunuzu Giriniz:");
            float boy = klavye.nextFloat();
            System.out.println("Kilonuzu Giriniz:");
            float kilo = klavye.nextFloat();
            float bki = kilo/(boy*boy);
            System.out.println("Beden Kitle Endeksiniz:"+bki);
            
   
            if(bki<18){
                System.out.println("İyi durumdasınız");
               }
            else if(bki<20){
                System.out.println("Orta durumdasınız");
            }
            else if(bki<25){
                System.out.println("Yüksek durumdasınız");
            }
            else if(bki<30){
                System.out.println("Çok Yüksek Durumdasınız");
            }
            else{
                System.out.println("Obezsiniz");
            }

            
    }
    
    
}
