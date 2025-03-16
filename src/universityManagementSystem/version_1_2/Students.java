package universityManagementSystem.version_1_2;

public class Students {
    private String firstName;
    private String lastName;
    private int id=10000;
    private University university;

    public Students(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    Students(){
        this.id=getId();
    }

    public Students(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return  firstName + '\'' +
                lastName + '\'' +
                id;
    }
}
