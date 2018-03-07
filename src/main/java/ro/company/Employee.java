package ro.company;

public class Employee{
    private String name;
    private Integer seniority;
    private String roleIncompany;
    private boolean parkingSpace;

    public Employee(String name, Integer seniority, String roleIncompany, boolean parkingSpace) {
        this.name = name;
        this.seniority = seniority;
        this.roleIncompany = roleIncompany;
        this.parkingSpace = parkingSpace;
    }

    public String getName() {
        return name;
    }

    public Integer getSeniority() {
        return seniority;
    }

    public String getRoleIncompany() {
        return roleIncompany;
    }

    public boolean isParkingSpace() {
        return parkingSpace;
    }
}
