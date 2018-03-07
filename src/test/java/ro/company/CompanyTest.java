package ro.company;

import org.junit.Test;

import java.util.*;

public class CompanyTest {
    @Test
    public void company_test() {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Pandele", 5, "Manager", true));
        employees.add(new Employee("Georgel", 3, "Software Developer", true));
        employees.add(new Employee("Geta", 20, "Assistent Manager", true));
        employees.add(new Employee("Ion", 1, "Software Developer", false));
        employees.add(new Employee("Maria", 4, "Software Developer", false));
        employees.add(new Employee("Gelu", 9, "Legal Advisor", false));
        employees.add(new Employee("Fane", 12, "Legal Advisor", false));
        employees.add(new Employee("Dan", 6, "Software Developer", false));

        List<Employee> wp = new ArrayList<Employee>();



        System.out.println("Lista de angajati fara loc de parcare este:");
        for (Employee e : employees) {
            if (e.isParkingSpace() == false) {
                wp.add(e);

            }
        }

        Comparator<Employee> seniority = new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                return o1.getSeniority().compareTo(o2.getSeniority());
            }
        };
        Collections.sort(wp, seniority);
        for (Employee e : wp) {
            System.out.println(e.getName() + " " + e.getSeniority());
        }

        System.out.println("____________________________");
        //Generating a list for software developers
        List<Employee> sd = new ArrayList<Employee>();
        System.out.println("Lista de software developeri este:");
        for (Employee e : employees) {
            if (e.getRoleIncompany().equals("Software Developer")) {
                sd.add(e);
                System.out.println(e.getName());
            }
        }
        System.out.println("___________________________");
        //Generating a list for legal advisors
        List<Employee> la = new ArrayList<Employee>();
        System.out.println("Lista de legal advisori este:");
        for (Employee e : employees) {
            if (e.getRoleIncompany().equals("Legal Advisor")) {
                la.add(e);
                System.out.println(e.getName());
            }
        }
        ;

        System.out.println("__________________");
        //Generating a list for the manager
        List<Employee> ma = new ArrayList<Employee>();
        System.out.println("Lista de manageri este:");
        for (Employee e : employees) {
            if (e.getRoleIncompany().equals("Manager")) {
                ma.add(e);
                System.out.println(e.getName());
            }
        }

        System.out.println("__________________");

        List<Employee> am = new ArrayList<Employee>();
        System.out.println("Lista de asitenti manageri:");
        for (Employee e : employees) {
            if (e.getRoleIncompany().equals("Assistent Manager"))
                am.add(e);
        }

        for(Employee e: am){
            System.out.println(e.getName());
    }
}}

