package record;

import java.util.Objects;

public record Person(int id, String name, String address) {

    public Person{
        id = 1;
        name = "Default";
        address = "Default";
    }

}
