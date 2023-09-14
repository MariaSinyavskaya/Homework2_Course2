public class StudentService {

    public void printGryffindorStudent(Gryffindor student) {
        System.out.println("Факультет Гриффиндор " +
                " имя - " + student.getName() +
                " сила магии - " + student.getPowerOfMagic() +
                " расстояние трансгрессии - " + student.getTransgressionDistance() +
                " благородство - " + student.getNobility() +
                " честь - " + student.getHonor() +
                " храбрость - " + student.getBravery());
    }

    public void printHufflepuffStudent(Hufflepuff student) {
        System.out.println("Факультет Пуффендуй " +
                " имя - " + student.getName() +
                " сила магии - " + student.getPowerOfMagic() +
                " расстояние трансгрессии - " + student.getTransgressionDistance() +
                " трудолюбие - " + student.getIndustriousness() +
                ", верность - " + student.getLoyalty() +
                ", честность - " + student.getHonesty());
    }

    public void printRavenclawStudent(Ravenclaw student) {
        System.out.println("Факультет Когтевран " +
                " имя - " + student.getName() +
                " сила магии - " + student.getPowerOfMagic() +
                " расстояние трансгрессии - " + student.getTransgressionDistance() +
                " ум - " + student.getIntelligence() +
                " мудрость - " + student.getWisdom() +
                " остроумие - " + student.getWit() +
                " творчество - " + student.getCreativity());
    }

    public void printSlytherinStudent(Slytherin student) {
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

    public void compareGryffindorStudents(Gryffindor student1, Gryffindor student2) {
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

    public void compareRavenclawStudents(Ravenclaw student1, Ravenclaw student2) {
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

    public void compareHufflepuffStudents(Hufflepuff student1, Hufflepuff student2) {
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

    public void compareSlytherinStudents(Slytherin student1, Slytherin student2) {
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

    public void compareAnyTwoStudents(Hogwarts student1, Hogwarts student2) {
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
