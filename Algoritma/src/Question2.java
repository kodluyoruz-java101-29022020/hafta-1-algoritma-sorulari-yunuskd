
import java.util.Scanner;


public class Question2 {
    public static void main(String[] args) {
       
    	
        Scanner scanner = new Scanner(System.in);
        
        
        String islemler = "1. Toplama ��lemi\n"
                          +"2. ��karma ��lemi\n"
                          +"3. �arpma ��lemi\n"
                          +"4. B�lme ��lemi";
        System.out.println(islemler);
        System.out.println("��lemi Se�iniz:");
        String islem = scanner.nextLine();
        
        int a;
        int b;
        
        switch(islem){
            case "1":
                System.out.print("Birinci Say�: ");
                a = scanner.nextInt();
                System.out.print("�kinci Say�: ");
                b = scanner.nextInt();
                System.out.println("Girilen De�erlerin Toplamlar� : " + (a+b));
                break;
            case "2":
                System.out.print("Birinci Say�: ");
                a = scanner.nextInt();
                System.out.print("�kinci Say�: ");
                b = scanner.nextInt();
                System.out.println("Girilen De�erlerin Farklar� : " + (a-b));
                break;
            case "3":
                System.out.print("Birinci Say�: ");
                a = scanner.nextInt();
                System.out.print("�kinci Say�: ");
                b = scanner.nextInt();
                System.out.println("Girilen De�erlerin �arp�mlar� : " + (a * b));
                break;
            case "4":
                System.out.print("Birinci Say�: ");
                a = scanner.nextInt();
                System.out.print("�kinci Say�: ");
                b = scanner.nextInt();
                System.out.println("Girilen De�erlerin B�l�m� : " + ((double)a / b));
                break;
            default:
                System.out.println("Ge�ersiz ��lem");
                
        }
        scanner.close();
    }
}
