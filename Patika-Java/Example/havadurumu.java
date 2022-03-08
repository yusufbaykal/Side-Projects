import java.util.Scanner;
public class ilk28 {

    
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Hava Sıcaklığını giriniz:");
        int hava = klavye.nextInt();
        if(hava<5){
            System.out.println("Kayak Yapınız");
        }
        else if(hava >=5 && hava <=15){
            System.out.println("Sinemaya Gidiniz");
        }
        else if(hava >=15 && hava <=25){
            System.out.println("Piknik Yapınız");
        }
        else if(hava>=25){
            System.out.println("Yüzmeye Gidiniz");
        }
        else{
            System.out.println("Yanlış Değer girişi yapıldı..");
        }
        
    }
    
}
