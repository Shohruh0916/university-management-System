package universityManagementSystem.version_1_2;

public class  University {
    Students [] students=new Students[5];
    private  String firstName;
    private  String lastName;
    private String name;
    public int count=0;
    private int count1=0;
    private int count2=0;
    private Courses [] courses=new Courses[5];
    private CourseAttendance [] courseAttendances=new CourseAttendance[5];

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

    public int enroll(String firstName, String lastName){
        if(count>students.length){
            Students [] newStudents=new  Students[2*students.length];
            for(int i=0; i<students.length; i++){
                newStudents[i]=students[i];
            }
            students=newStudents;
        }
        this.students[count]=new Students(firstName,lastName);
        return students[count].getId()+count++;
    }

    public String students(int s1) {
        return s1+" "+students[s1-10000].getLastName()+" "+students[s1-10000].getFirstName();
    }

    public int activate(String subjectName,String  name){
        if(count1>courses.length){
            Courses [] newCourses=new Courses[2*courses.length];
            for(int i=0; i<students.length; i++){
                newCourses[i]=courses[i];
            }
            courses=newCourses;
        }
        this.courses[count1]=new Courses(subjectName,name);
        return courses[count1].getId1()+count1++;
    }

    public String course(int s1) {
        return s1+" "+courses[s1-10].getSubjectName()+" "+courses[s1-10].getName();
    }

    public  void register(int id,int id1){
        if(count2>courseAttendances.length){
            CourseAttendance [] newcourseAttendances=new CourseAttendance[2*courseAttendances.length];
            for(int i=0; i<courseAttendances.length; i++){
                newcourseAttendances[i]=courseAttendances[i];
            }
            courseAttendances=newcourseAttendances;
        }
        this.courseAttendances[count2]=new CourseAttendance(id,id1);
        count2++;
    }

    public String listAttendees(int id1) {
        String s="";
        for(int i=0; i<count2; i++){
            if(id1==courseAttendances[i].getId1()){
                s+=(courseAttendances[i].getId()+" "+students[courseAttendances[i].getId()-10000].getFirstName()+" "+students[courseAttendances[i].getId()-10000].getLastName()+"\n");
            }
        }
        return s;
    }

    public String  studyPlan(int id) {
        String s="";
        for(int i=0; i<count1; i++){
            if(courses[i].getId1()==courseAttendances[i].getId1()){
                s+=courses[i].getId1()+" "+courses[i].getSubjectName()+" "+courses[i].getName()+"\n";
            }
        }
        return s;
    }


}
