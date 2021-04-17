public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha Gçkçen Havalimanına Hoş Geldiniz");

         String sartlar= "Yurtdışı Çıkış kuralları...\n"
                       + "Herhangi bir yasağınızın bulunmaması gerekiyor...\n"
                       + "15 TL harç bedelinizi tam olarak yatırmanız gerekiyor...\n"
                       + "Gideceğiniz ülkeye vizeniz bulunması gerekiyor...";


         String message= ("Yurtdışı şartlarından hepsini sağlamanız gerekiyor");

         while(true){
             System.out.println("*************");
             System.out.println(sartlar);
             System.out.println("*************");


             Yolcu yolcu = new Yolcu();
             System.out.println("Harç bedeli kontrol ediliyor...");

             //3 saniye bekleyip öyle çalışacak.
              Thread.sleep(3000);

              if(yolcu.yurtdisiHarciKontrol() == false){
                  System.out.println(message);
                  continue;

              }

              System.out.println("Yasağınız var mı kontrol ediliyor");
              Thread.sleep(3000);

              if(yolcu.yasakKontrol() == false){
                  System.out.println(message);
                  continue;
              }
             System.out.println("Vize durumu kontrol ediliyor...");
             Thread.sleep(3000);

             if(yolcu.vizeDurumuKontrol() == false){
                 System.out.println(message);
                 continue;
             }
             System.out.println("İşlemleriniz tamam yutdışına çıkabilirsiniz");
             break;

         }








    }
}
