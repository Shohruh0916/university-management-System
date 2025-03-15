package universityManagementSystem.version_1;

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

    }
}
