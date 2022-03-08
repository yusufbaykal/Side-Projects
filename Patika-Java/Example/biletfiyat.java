import java.util.Scanner;
public class ilk28 {

    
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int mesafe,yas,yolculuktıp;
        double normaltutar,yolcutıpındırım=0.20,yolculuktıpıfıyat,yasındırımı,toplam,kmfıyat = 0.10;
        double ındırımlıtutar;
        System.out.println("Mesafeyi giriniz:");
        mesafe = klavye.nextInt();
        System.out.println("Yaşınızı Giriniz:");
        yas = klavye.nextInt();
        System.out.println("Yolculuk Tipini Giriniz: 1- Tek Yön, 2- Gidiş - Dönüş");
        yolculuktıp = klavye.nextInt();
        if(yas<12){
            normaltutar = mesafe*kmfıyat;
            yasındırımı = normaltutar*0.5;
            ındırımlıtutar = normaltutar-yasındırımı;
            yolculuktıpıfıyat = ındırımlıtutar*yolcutıpındırım;
            toplam = (normaltutar-yolculuktıpıfıyat-yasındırımı)*2;
            System.out.println(toplam);
            
        }
        else if(yas>=12 && yas<=24){
            normaltutar = mesafe*kmfıyat;
            yasındırımı = normaltutar*0.10;
            ındırımlıtutar = normaltutar-yasındırımı;
            yolculuktıpıfıyat = ındırımlıtutar*yolcutıpındırım;
            toplam = (normaltutar-yolculuktıpıfıyat-yasındırımı)*2;
            System.out.println(toplam);
        }
        else if(yas>=65){
            normaltutar = mesafe*kmfıyat;
            yasındırımı = normaltutar*0.3;
            ındırımlıtutar = normaltutar-yasındırımı;
            yolculuktıpıfıyat = ındırımlıtutar*yolcutıpındırım;
            toplam = (normaltutar-yolculuktıpıfıyat-yasındırımı)*2;
            System.out.println(toplam);
        }
        else if(yas>=24 && yas<=64){
            normaltutar = mesafe*kmfıyat;
            System.out.println(normaltutar);
        }
        
        
    }
    
}
