package ro.hobbies;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String nameOfHobby;
    private int frequencyPerWeek;

    public Hobby(String nameOfHobby, int frequencyPerWeek) {
        this.nameOfHobby = nameOfHobby;
        this.frequencyPerWeek = frequencyPerWeek;

    }

    public String getNameOfHobby() {
        return nameOfHobby;
    }
}
