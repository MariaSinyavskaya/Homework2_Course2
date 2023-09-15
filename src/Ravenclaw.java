public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int powerOfMagic, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, powerOfMagic, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public static void printRavenclawStudent(Ravenclaw student) {
        System.out.println("Факультет Когтевран " +
                " имя - " + student.getName() +
                " сила магии - " + student.getPowerOfMagic() +
                " расстояние трансгрессии - " + student.getTransgressionDistance() +
                " ум - " + student.getIntelligence() +
                " мудрость - " + student.getWisdom() +
                " остроумие - " + student.getWit() +
                " творчество - " + student.getCreativity());
    }

    public static void compareRavenclawStudents(Ravenclaw student1, Ravenclaw student2) {
        int studentScores1 = student1.getIntelligence() + student1.getWisdom() + student1.getWit() + student1.getCreativity();
        int studentScores2 = student2.getIntelligence() + student2.getWisdom() + student2.getWit() + student2.getCreativity();
        if (studentScores1 > studentScores2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else if (studentScores2 > studentScores1) {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " имеют одинаковые баллы");
        }
    }
}
