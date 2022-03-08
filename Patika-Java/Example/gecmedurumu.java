import java.util.Scanner;
public class ilk28 {

    
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("1. Notunuzu Giriniz:");
        int not = klavye.nextInt();
        System.out.println("2. Notunuzu Giriniz:");
        int not1 = klavye.nextInt();
        float ortalama = (not+not1/2);
        if(ortalama<50){
            System.out.println("3.Notunuzu Giriniz:");
            int not2 = klavye.nextInt();
            float ortalama1 = (not+not1+not2/2);
        if(ortalama1<50){
                System.out.println("Kaldınız");
            }
        }
        else{
            System.out.println("Geçtiniz");
        }
        
        
    }
    
}
