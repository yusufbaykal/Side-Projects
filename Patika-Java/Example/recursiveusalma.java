import java.util.Scanner;
public class NewMain17 {
    static int power(int base,int exp){
        int result =1;
        for(int i = 1; i <= exp;i++){
            result*=base;
        }
        return result;
    }

    
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Taban Değerini giriniz:");
        int base = klavye.nextInt();
        System.out.println("Üst Değerini giriniz:");
        int exp = klavye.nextInt();
        System.out.println(power(base,exp));
    }
    
}
