import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Intefejs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie kota");
        String catName = scanner.nextLine();
        System.out.println("Podaj imie wlasciciela");
        String ownerName = scanner.nextLine();
        System.out.println("Podaj wage kota");
        double catWeight = scanner.nextDouble();

        Kot kot = new Kot();
        kot.setName(catName);
        kot.setOwnerName(ownerName);
        kot.setWeight(catWeight);
        kot.setDateTimeFormatter(DateTimeFormatter.ofPattern("1991-10-10"));


        System.out.println(kot.przedstawSie());

    }
}
