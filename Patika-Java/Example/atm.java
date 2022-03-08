import java.util.Scanner;
public class NewMain7 {

     
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int bakiye = 1500;
        int para = 0;
        int hak = 0;
        int islem = 0;
        String kullanıcı,sifre;
        System.out.println("Kullanıcı Adınızı giriniz:");
        kullanıcı = klavye.next();
        System.out.println("Şifrenizi Giriniz:");
        sifre = klavye.next();
        if(kullanıcı.equals("Yusuf Baykaloğlu")&&sifre.equals("ybs19")){
            System.out.println("Merhaba"+kullanıcı+"Bankamıza Hoşgeldiniz");
            do{
                System.out.println("1. Para Çekme\n"
                        + "2. Para Yatırma\n"
                        + "3. Bakiye Sorgulama\n"
                        + "4. Çıkış Yapma\n");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
                islem = klavye.nextInt();
                switch (islem) {
                    case 1:
                        System.out.println("Çekilecek Para Miktarı:");
                        if(para>bakiye){
                            System.out.println("Bakiye Yetersiz..");
                            
                        }else{
                            bakiye-=para;
                        }   break;
                    case 2:
                        System.out.println("Yatırılacak Para Miktarı:");
                        bakiye+=para;
                        break;
                    case 3:
                        System.out.println("Bakiyeniz:"+bakiye);
                        break;
                     
                        
                }
            }while(islem!=4);
            System.out.println("Tekrar Görüşmek üzere");
           
                    
            
        }else{
            hak--;
            System.out.println("Hatalı Bilgiler girdiniz tekrar deneyiniz.");
            if(hak==0){
                System.out.println("Hesap bloke banka ile görüşünüz.");
            }else{
                System.out.println("Kalan Hakkınız:"+hak);
            }
        }
        
    }
    
}

