public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 80, 78, 95, 100, 98);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 90, 85, 73, 60, 69);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 60, 50, 80, 90, 95);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 75, 86, 100, 50, 77, 70, 95);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 47, 36, 50, 63, 30, 27, 55);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 68, 88, 95, 67, 70, 80, 65);

        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", 56, 78, 77, 29, 44);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 80, 45, 89, 48, 90);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 73, 62, 55, 67, 66);

        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 40, 72, 74, 39, 28, 90);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 66, 48, 98, 56, 42, 24);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 79, 55, 40, 47, 55, 70);

        Gryffindor.printGryffindorStudent(ronWeasley);
        Hufflepuff.printHufflepuffStudent(justinFinchFletchley);
        Ravenclaw.printRavenclawStudent(padmaPatil);
        Slytherin.printSlytherinStudent(dracoMalfoy);
        System.out.println();

        Hufflepuff.compareHufflepuffStudents(zachariahSmith, cedricDiggory);
        Gryffindor.compareGryffindorStudents(hermioneGranger, harryPotter);
        Ravenclaw.compareRavenclawStudents(padmaPatil, marcusBelby);
        Slytherin.compareSlytherinStudents(grahamMontague, gregoryGoyle);
        System.out.println();

        Hogwarts.compareAnyTwoStudents(harryPotter, dracoMalfoy);
        Hogwarts.compareAnyTwoStudents(zhouChang, cedricDiggory);


    }
}