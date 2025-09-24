package record;

public class Main {

    public static void main(String[] args) {
        Person person = new Person(123, "Aditya", "Bangalore");
        Person person2 = new Person(123, "Aditya", "Bangalore");
        System.out.println(person.equals(person2));
        System.out.println(person.hashCode());
    }

}
