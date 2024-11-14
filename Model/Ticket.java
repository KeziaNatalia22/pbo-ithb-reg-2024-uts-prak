package Model;

public class Ticket {
    private String ticketID, seatNumber;
    private ClassType_Enum classType;
    private TicketStatus_Enum status;
    private double price;
    private OnlinePayment payment;
    private Train train;
    private Reservation reservation;
    private double totalPendapatan;

    public double getTotalPendapatan() {
        return totalPendapatan;
    }

    public void setTotalPendapatan(double totalPendapatan) {
        this.totalPendapatan = totalPendapatan;
    }

    public Ticket(String ticketID, String seatNumber, ClassType_Enum classType, TicketStatus_Enum status, double price,
            OnlinePayment payment, Train train, Reservation reservation) {
        this.ticketID = ticketID;
        this.seatNumber = seatNumber;
        this.classType = classType;
        this.status = status;
        this.price = price;
        this.payment = payment;
        this.train = train;
        this.reservation = reservation;
    }

    public String getTicketID() {
        return ticketID;
    }
    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public ClassType_Enum getClassType() {
        return classType;
    }
    public void setClassType(ClassType_Enum classType) {
        this.classType = classType;
    }
    public TicketStatus_Enum getStatus() {
        return status;
    }
    public void setStatus(TicketStatus_Enum status) {
        this.status = status;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public OnlinePayment getPayment() {
        return payment;
    }
    public void setPayment(OnlinePayment payment) {
        this.payment = payment;
    }
    public Train getTrain() {
        return train;
    }
    public void setTrain(Train train) {
        this.train = train;
    }
    public Reservation getReservation() {
        return reservation;
    }
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public void printTicket(){
        System.out.println("Ticket ID: " + ticketID +
        "\nSeat Number: " + seatNumber +
        "\nClass Type: " + classType +
        "\nStatus: " + status +
        "\nPrice: " + price + 
        "\nPayment: " + payment + 
        "\nTrain: " + train + 
        "\nReservation: " + reservation +
        "\nTotal Pendapatan: " + totalPendapatan);
    }
}
