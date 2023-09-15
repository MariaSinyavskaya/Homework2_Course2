public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public static void printGryffindorStudent(Gryffindor student) {
        System.out.println("Факультет Гриффиндор " +
                " имя - " + student.getName() +
                " сила магии - " + student.getPowerOfMagic() +
                " расстояние трансгрессии - " + student.getTransgressionDistance() +
                " благородство - " + student.getNobility() +
                " честь - " + student.getHonor() +
                " храбрость - " + student.getBravery());
    }

    public static void compareGryffindorStudents(Gryffindor student1, Gryffindor student2) {
        int studentScores1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int studentScores2 = student2.getNobility() + student2.getHonor() + student2.getBravery();
        if (studentScores1 > studentScores2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else if (studentScores2 > studentScores1) {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " имеют одинаковые баллы");
        }
    }
}
