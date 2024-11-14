package Model;

public class Passenger {
    private String passangerID, passangerName;
    private int pasangerGender, passangerAge;
    private Ticket tiket;

    public Passenger(String passangerID, String passangerName, int pasangerGender, int passangerAge, Ticket tiket) {
        this.passangerID = passangerID;
        this.passangerName = passangerName;
        this.pasangerGender = pasangerGender;
        this.passangerAge = passangerAge;
        this.tiket = tiket;
    }

    public Ticket getTiket() {
        return tiket;
    }

    public void setTiket(Ticket tiket) {
        this.tiket = tiket;
    }

    public String getPassangerID() {
        return passangerID;
    }
    public void setPassangerID(String passangerID) {
        this.passangerID = passangerID;
    }
    public String getPassangerName() {
        return passangerName;
    }
    public void setPassangerName(String passangerName) {
        this.passangerName = passangerName;
    }
    public int getPasangerGender() {
        return pasangerGender;
    }
    public void setPasangerGender(int pasangerGender) {
        this.pasangerGender = pasangerGender;
    }
    public int getPassangerAge() {
        return passangerAge;
    }
    public void setPassangerAge(int passangerAge) {
        this.passangerAge = passangerAge;
    }

    public void getPassangerInfo(){
        System.out.println("ID: " + passangerID + 
        "\nName: " + passangerName + 
        "\nGender: " + (pasangerGender == 1? "Male" : "Female") + 
        "\nAge: " + passangerAge);
    }
}
