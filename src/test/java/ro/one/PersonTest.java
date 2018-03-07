package ro.one;

import org.junit.Test;

import java.util.*;

public class PersonTest {
    @Test
    public void treeset_test(){

        Set<Person> persons = new TreeSet<Person>(new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        persons.add(new Person("Adrian", 18));
        persons.add(new Person("Ion", 31));
        persons.add(new Person("Valentin", 29));
        persons.add(new Person("George", 30));
        persons.add(new Person("Paul", 15));

       for (Person person: persons){
            System.out.println(person.getName());
        }
        System.out.println("____________________");
        Set<Person> persons1 = new TreeSet<Person>(new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });

       persons1.addAll(persons);
       for (Person person: persons1){
           System.out.println(person.getName());
       }
    }
}
