import java.util.Scanner;
public class ÜslüSayı {
    public static void main(String[] args) {
        int a,b;
        Scanner inp=new Scanner(System.in);
        System.out.print("BİR SAYI GİRİNİZ:");
        a= inp.nextInt();
        System.out.print("üst sayısını giriniz:");
        b= inp.nextInt();
        int total=1;

        for (int i=1;a>=i;i++){
            total*=a;









        }
        System.out.print("CEVAP:" +total);


    }
}
