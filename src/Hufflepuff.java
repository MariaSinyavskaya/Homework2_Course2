public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerOfMagic, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, powerOfMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public static void printHufflepuffStudent(Hufflepuff student) {
        System.out.println("Факультет Пуффендуй " +
                " имя - " + student.getName() +
                " сила магии - " + student.getPowerOfMagic() +
                " расстояние трансгрессии - " + student.getTransgressionDistance() +
                " трудолюбие - " + student.getIndustriousness() +
                ", верность - " + student.getLoyalty() +
                ", честность - " + student.getHonesty());
    }

    public static void compareHufflepuffStudents(Hufflepuff student1, Hufflepuff student2) {
        int studentScores1 = student1.getIndustriousness() + student1.getHonesty() + student1.getLoyalty();
        int studentScores2 = student2.getIndustriousness() + student2.getHonesty() + student2.getLoyalty();
        if (studentScores1 > studentScores2) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else if (studentScores2 > studentScores1) {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " имеют одинаковые баллы");
        }
    }
}
