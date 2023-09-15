public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public static void printSlytherinStudent(Slytherin student) {
        System.out.println("Факультет Слизерин " +
                " имя - " + student.getName() +
                " сила магии - " + student.getPowerOfMagic() +
                " расстояние трансгрессии - " + student.getTransgressionDistance() +
                " хитрость - " + student.getCunning() +
                " решительность - " + student.getDetermination() +
                " амбициозность - " + student.getAmbition() +
                " находчивость - " + student.getResourcefulness() +
                " жажда власти - " + student.getLustForPower());
    }

    public static void compareSlytherinStudents(Slytherin student1, Slytherin student2) {
        int studentScores1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getLustForPower();
        int studentScores2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getLustForPower();
        if (studentScores1 > studentScores2) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else if (studentScores2 > studentScores1) {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " имеют одинаковые баллы");
        }
    }
}
