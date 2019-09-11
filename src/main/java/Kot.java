import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Kot {


    private String name;
    private double weight;
    private String ownerName;
    private Date dataUrodzenia



    public void setDateTimeFormatter(DateTimeFormatter dateTimeFormatter) {
        this.dateTimeFormatter = dateTimeFormatter;
    }

    public String przedstawSie() {
        return "cześć mam na imie " + name +   " waze " + weight + " i moj opiekun ma na imie " + ownerName + " urodziłem sie w "+ dateTimeFormatter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

}
