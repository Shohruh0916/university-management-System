package universityManagementSystem.version_1_2;

public class Test {
    public static void main(String[] args) {
        String universityName = "Politecnico di Torino";

        University poli = new University(universityName);

        poli.setRector("Guido", "Saracco");

        System.out.println("Rector of " + poli.getName() + " : " + poli.getRector());

        int s1 = poli.enroll("Mario","Rossi");
        int s2 = poli.enroll("Giuseppe","Verdi");

        System.out.println("Enrolled students " + s1 + ", " + s2);
        System.out.println("s1="+poli.students(s1));

        int macro = poli.activate("Macro Economics", "Paul Krugman");
        int oop = poli.activate("Object Oriented Programming", "James Gosling");
        System.out.println("Activated courses " + macro + " and " + oop);

        System.out.println("macro="+poli.course(macro));

        poli.register(s1, macro);
        poli.register(s2, macro);
        poli.register(s2, oop);

        System.out.println(poli.listAttendees(macro));

        System.out.println(poli.studyPlan(s2));



    }
}
