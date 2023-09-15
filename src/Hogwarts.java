public class Hogwarts {
    private final String name;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public static void compareAnyTwoStudents(Hogwarts student1, Hogwarts student2) {
        if (student1.getPowerOfMagic() > student2.getPowerOfMagic()) {
            System.out.println(student1.getName() + " обладает бОльшей мощностью магии, чем " + student2.getName());
        } else if (student1.getPowerOfMagic() < student2.getPowerOfMagic()) {
            System.out.println(student2.getName() + " обладает бОльшей мощностью магии, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " имеют одинаковую мощность магии");
        }
        if (student1.getTransgressionDistance() > student2.getTransgressionDistance()) {
            System.out.println(student1.getName() + " трансгрессируется дальше, чем " + student2.getName());
        } else if (student1.getTransgressionDistance() < student2.getTransgressionDistance()) {
            System.out.println(student2.getName() + " трансгрессируется дальше, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " трансгрессируются на одинаковое расстояние");
        }
    }
}
