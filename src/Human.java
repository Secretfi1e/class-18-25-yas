import java.util.Scanner;

public class Human {
    String Name;
    String Surname;
    int Age;
    String City;

    public Human(String name, String surname, int age, String city) {
        Name = name;
        Surname = surname;
        Age = age;
        City = city;
    }

    public boolean isStudent() {
        if (Age > 18 && Age < 25) {
            return true;
        } else {
            return false;
        }


    }

}






