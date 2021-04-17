import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari{

    private int harc;
    private boolean yasak;
    private boolean vizeDurumu;

    public Yolcu(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Yatırdığınız harç bedeli: ");
        this.harc= scanner.nextInt();
        scanner.nextLine();

        System.out.println("Herhangi bir yasağınız bulunuyor mu?");
        String cevap= scanner.nextLine();
        if(cevap.equals("evet")){

            this.yasak=true;
        }
        else{

            this.yasak=false;
        }
        System.out.println("Vizeniz bulunuyor mu ? (evet ya da hayır) ");
        String cevap2= scanner.nextLine();

        if(cevap2.equals("evet")){

            this.vizeDurumu=true;
        }
        else {
            this.vizeDurumu=false;
        }


    }


    @Override
    public boolean yurtdisiHarciKontrol() {
        if(this.harc < 15){
            System.out.println("Lütfen yurtdışı çıkış harcını tam atırın...");
            return false;
        }
        else {
            System.out.println("Yurtdışı harcı işlemi tamam.");
            return true;

        }
    }

    @Override
    public boolean yasakKontrol() {

        if(this.yasak==true){
            System.out.println("Yurtdışına çıkamassınız...");
            return false;
        }
        else{
            System.out.println("Yasağınız bulunmuyor.");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
       if(this.vizeDurumu==true){
           System.out.println("Vize işlemleri tamam");
           return true;
       }
       else{
           System.out.println("Vizeniz gideceğiniz ülkeye bulunmamaktadır.");
           return false;
       }
    }
}
