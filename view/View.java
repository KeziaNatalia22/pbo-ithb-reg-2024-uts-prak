package View;
import Model.*;
import Controller.*;
import java.util.*;

public class View {
    static Scanner scan = new Scanner(System.in);

    public static void mainMenu(){
        Dummy.createDummy();

        int x = -1;
        while (x != 0) {
            String menu = "\n1.Buat Payment \n2.Hitung total pendapatan \n3.Lihat Info pengguna \n4.Lihat Detail Kereta \n5.Lihat reservasi";
            System.out.println("\nPilih menu " + menu + " ");
            x = scan.nextInt();
            switch (x) {
                case 1:
                scan.nextLine();
                System.out.println("Masukkan id passanger : ");
                String id = scan.nextLine();
                System.out.println("Masukkan type payment :");
                String type = scan.nextLine();

                Controller.makePayment(id, type);
                break;

                case 2:
                double pendapatan = Controller.calculateTotalRevenue();
                System.out.println("Total revenue : " + pendapatan);
                break;

                case 3:
                scan.nextLine();
                System.out.println("Masukkan id pengguna : " );
                String idUser1 = scan.nextLine();
                Controller.getUserInfo(idUser1);
                break;

                case 4:
                scan.nextLine();
                System.out.println("Masukkan id pengguna : " );
                String idUser2 = scan.nextLine();
                Controller.getTrainDetails(idUser2);
                break;
                
                case 5:
                scan.nextLine();
                System.out.println("Masukkan id pengguna : " );
                String idUser3 = scan.nextLine();
                Controller.getInfoReservation(idUser3);
                break;

                case 0:
                System.exit(0);
                break;
            }
        }
    }
}