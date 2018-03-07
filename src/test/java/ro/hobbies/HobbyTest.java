package ro.hobbies;

import org.junit.Test;

import java.util.*;

public class HobbyTest {
    @Test
    public void hobby_test() {

        Map<Hobby, List<Adresses>> adresses = new HashMap<Hobby, List<Adresses>>();
        adresses.put(new Hobby("Fissing", 1), Arrays.asList(new Adresses("adress1"), new Adresses("adress2"), new Adresses("adress")));
        adresses.put(new Hobby("Bowling", 2), Arrays.asList(new Adresses("adress3"), new Adresses("adress4")));
        adresses.put(new Hobby("Snooker", 3), Arrays.asList(new Adresses("adress 4"), new Adresses("adress6")));
        adresses.put(new Hobby("Photography", 5), Arrays.asList(new Adresses("anywhere")));
        adresses.put(new Hobby("Chess", 4), Arrays.asList(new Adresses("adress 8")));


        Map<Person, List<Hobby>> people = new HashMap<Person, List<Hobby>>();
        people.put(new Person("Ion"), Arrays.asList(new Hobby("Fissing", 1), new Hobby("Snooker", 1), new Hobby("Photography", 4)));

        for(int i=0; i<people.size(); i++){
            System.out.println(people.keySet()+" "+people.values());
            System.out.println();
        }
    }}


