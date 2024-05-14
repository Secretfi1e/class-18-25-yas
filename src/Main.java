import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Human human = new Human("Emin", "Beyzade", 24, "Baku");

        System.out.println(human.isStudent());

        Human human1 = new Human("Nadir", "Beyzade", 57, "Ordubad");
        System.out.println(human1.isStudent());

        Human human2 = new Human("Isa", "Beyzade", 65, "Sederek");
        System.out.println(human2.isStudent());

        Human human3 = new Human("Azer", "Beyzade", 50, "Ordubad");
        System.out.println(human3.isStudent());

        Human human4 = new Human("Rza", "Beyzade", 67, "Sederek");
        System.out.println(human4.isStudent());

        Human human5 = new Human("Natiq", "Beyzade", 27, "Baku");

        Human human6 = new Human("Ramin", "Beyzade", 23, "Baku");

        Human human7 = new Human("Musa", "Beyzade", 100, "Sederek");

        Human human8 = new Human("Adil", "Beyzade", 58, "Ordubad");

        Human human9 = new Human("Rovsen", "Caniyev", 41, "Lenkeranski");

        System.out.println("Bir seher adi daxil edin: ");


        Human[] humans = new Human[]{human, human1, human2, human3, human4, human5, human6, human7, human8, human9};

        GetCity(humans);
    }


    public static void GetCity(Human[] humans) {
        String city = scanner.nextLine();
        for (var object : humans) {
            if (object.City.equals(city) && object.isStudent()) {
                System.out.println(object.Name);
            }
        }
    }

}




