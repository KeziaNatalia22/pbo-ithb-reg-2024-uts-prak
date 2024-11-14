package Model;

import java.util.Date;

public class GroupReservation extends Reservation {
    private String groupName;
    private int numberOfPassangers;
    public GroupReservation(String reservationID, Date reservationDate, String groupName, int numberOfPassangers) {
        super(reservationID, reservationDate);
        this.groupName = groupName;
        this.numberOfPassangers = numberOfPassangers;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public int getNumberOfPassangers() {
        return numberOfPassangers;
    }
    public void setNumberOfPassangers(int numberOfPassangers) {
        this.numberOfPassangers = numberOfPassangers;
    }
    
}
