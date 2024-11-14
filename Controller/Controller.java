package Controller;
import Model.*;
import java.util.*;

public class Controller {
    public static void makePayment(String idPass, String typePayment){
        int id = Dummy.id;
        for (Passenger pass : Dummy.passenger) {
            if (pass.getPassangerID().equalsIgnoreCase(idPass)) {
                Ticket tiket = pass.getTiket();
                Reservation reserve = tiket.getReservation();
                id++;

                reserve.reserveSeat(new Date(), id + ""); // manggil method di reservation

                tiket.getPayment().setPaymentGateway(typePayment);
                // System.out.println(tiket.getPayment().getPaymentGateway());
                tiket.getPayment().setTrancasctionID(id + ""); 
                // System.out.println(tiket.getPayment().getTrancasctionID());
                tiket.setStatus(TicketStatus_Enum.PAID);
                // System.out.println(tiket.getStatus());
                
                // tidak cek status payment apa karena payment dapat berlangsung dalam 3 payment
                tiket.setTotalPendapatan(+tiket.getPrice()); //nimpa??
                // System.out.println(tiket.getTotalPendapatan());
            }
            break;
        }
        System.out.println("Berhasil melakukan pembayaran !");
    }

    public static double calculateTotalRevenue(){
        double totalPendapatan = 0;

        for (Passenger pass : Dummy.passenger) {
            if (pass.getTiket().getStatus() == TicketStatus_Enum.PAID) {
                totalPendapatan += pass.getTiket().getPrice();
            }
            break;
        }

        return totalPendapatan;
    }

    public static void getUserInfo(String userId){
        for (Passenger pass : Dummy.passenger) {
            if (pass.getPassangerID().equalsIgnoreCase(userId)) {
                pass.getPassangerInfo();
            }
            break;
        }
    }
    
    public static void getTrainDetails(String userId){
        for (Passenger pass : Dummy.passenger) {
            if (pass.getPassangerID().equalsIgnoreCase(userId)) {
                pass.getTiket().getTrain().getTrainDetails();
            }
            break;
        }
    }
    
    public static void getInfoReservation(String userID){
        for (Passenger pass : Dummy.passenger) {
            if (pass.getPassangerID().equalsIgnoreCase(userID)) {
                Reservation reservation = pass.getTiket().getReservation();
                System.out.println("Reservation ID " + reservation.getReservationID());
                System.out.println("Reservation Date " + reservation.getReservationDate());
            }
            break;
        }
        
    }
}
