package Model;

import java.util.ArrayList;

public class Dummy {
    public static int id = 000;
    public static ArrayList<Passenger> passenger = new ArrayList<Passenger>();
    public static ArrayList<Ticket> tiket = new ArrayList<Ticket>();

    public static void createDummy(){
        Train trainStandard = new Train(1, "standard banget", TrainType_Enum.STANDARD);
        Train trainFast = new Train(2, "fast train nih", TrainType_Enum.FASTTRAIN);
        
        OnlinePayment payment = new OnlinePayment("000", "");

        Reservation reserve = new Reservation("a", null);
        Reservation reserve2 = new Reservation("b", null);
        Reservation reserve3 = new Reservation("c", null);
        Reservation reserve4 = new Reservation("d", null);
        Reservation reserve5 = new Reservation("e", null);
        Reservation reserve6 = new Reservation("f", null);

        tiket.add(new Ticket("T1", "01", ClassType_Enum.FIRST_CLASS, TicketStatus_Enum.AWAITING_PAYMENT, 350000, payment, trainStandard, reserve));
        tiket.add(new Ticket("T2", "02", ClassType_Enum.BUSINESS_CLASS, TicketStatus_Enum.AWAITING_PAYMENT, 250000, payment, trainStandard, reserve2));
        tiket.add(new Ticket("T3", "03", ClassType_Enum.ECONOMY_CLASS, TicketStatus_Enum.AWAITING_PAYMENT, 175000, payment, trainStandard, reserve3));

        tiket.add(new Ticket("T4", "04", ClassType_Enum.FIRST_CLASS, TicketStatus_Enum.AWAITING_PAYMENT, 600000, payment, trainFast, reserve4));
        tiket.add(new Ticket("T5", "05", ClassType_Enum.BUSINESS_CLASS, TicketStatus_Enum.AWAITING_PAYMENT, 500000, payment, trainFast, reserve5));
        tiket.add(new Ticket("T6", "06", ClassType_Enum.ECONOMY_CLASS, TicketStatus_Enum.AWAITING_PAYMENT, 400000, payment, trainFast, reserve6));

        passenger.add(new Passenger("A", "Amanda", 0, 25, tiket.get(0)));
        passenger.add(new Passenger("K", "Kezia", 0, 19, tiket.get(1)));
        passenger.add(new Passenger("B", "Bella", 1, 30, tiket.get(2)));
        passenger.add(new Passenger("C", "Cindy", 1, 28, tiket.get(3)));
        passenger.add(new Passenger("D", "Diana", 1, 32, tiket.get(4)));
        passenger.add(new Passenger("E", "Ella", 0, 22, tiket.get(5)));
    }
}
