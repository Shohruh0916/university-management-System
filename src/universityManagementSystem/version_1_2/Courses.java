package universityManagementSystem.version_1_2;

public class Courses {
    private  String name;
    private  String subjectName;
    private  int id1;


    public Courses(String name, String subjectName) {
        this.name = name;
        this.subjectName = subjectName;
        id1=10;
    }

    public int getId1() {
        return id1;
    }

    public String getName() {
        return name;
    }

    public String getSubjectName() {
        return subjectName;
    }

}
