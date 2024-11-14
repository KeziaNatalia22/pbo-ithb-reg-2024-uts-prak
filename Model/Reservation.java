package Model;
import java.util.Date;

public class Reservation {
    private String reservationID;
    private Date reservationDate;
    
    public Reservation(String reservationID, Date reservationDate) {
        this.reservationID = reservationID;
        this.reservationDate = reservationDate;
    }
    public String getReservationID() {
        return reservationID;
    }
    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }
    public Date getReservationDate() {
        return reservationDate;
    }
    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void reserveSeat(Date Date, String id){
        setReservationDate(Date);
        setReservationID(id);
    }
    
    public void cancelReservation(){
        setReservationDate(null);
        setReservationID(null);
    }

}
