package universityManagementSystem.version_1;

public class  University {
    Students students;
    private  String firstName;
    private  String lastName;
    private String name;
    public int count=0;

    public University(String unversityName){
        this.name=unversityName;
    }

    public String getName() {
        return name;
    }

    public void setRector(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    String getRector(){
        return firstName+" "+lastName;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public int enroll(String firstName, String lastName){
        this.students=new Students(firstName,lastName);
        return students.getId()+count++;
    }

    public String students(int s1) {
        return " ";
    }
}
