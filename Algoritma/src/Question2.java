
import java.util.Scanner;


public class Question2 {
    public static void main(String[] args) {
       
    	
        Scanner scanner = new Scanner(System.in);
        
        
        String islemler = "1. Toplama Ýþlemi\n"
                          +"2. Çýkarma Ýþlemi\n"
                          +"3. Çarpma Ýþlemi\n"
                          +"4. Bölme Ýþlemi";
        System.out.println(islemler);
        System.out.println("Ýþlemi Seçiniz:");
        String islem = scanner.nextLine();
        
        int a;
        int b;
        
        switch(islem){
            case "1":
                System.out.print("Birinci Sayý: ");
                a = scanner.nextInt();
                System.out.print("Ýkinci Sayý: ");
                b = scanner.nextInt();
                System.out.println("Girilen Deðerlerin Toplamlarý : " + (a+b));
                break;
            case "2":
                System.out.print("Birinci Sayý: ");
                a = scanner.nextInt();
                System.out.print("Ýkinci Sayý: ");
                b = scanner.nextInt();
                System.out.println("Girilen Deðerlerin Farklarý : " + (a-b));
                break;
            case "3":
                System.out.print("Birinci Sayý: ");
                a = scanner.nextInt();
                System.out.print("Ýkinci Sayý: ");
                b = scanner.nextInt();
                System.out.println("Girilen Deðerlerin Çarpýmlarý : " + (a * b));
                break;
            case "4":
                System.out.print("Birinci Sayý: ");
                a = scanner.nextInt();
                System.out.print("Ýkinci Sayý: ");
                b = scanner.nextInt();
                System.out.println("Girilen Deðerlerin Bölümü : " + ((double)a / b));
                break;
            default:
                System.out.println("Geçersiz Ýþlem");
                
        }
        scanner.close();
    }
}
