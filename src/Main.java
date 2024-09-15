//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void separator() {
        System.out.println("==================");
    }

    public static void main(String[] args) {
        Gryffindor harryPoter = new Gryffindor("Гарри", "Потер", 80, 70, 66, 34, 51);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона", "Грейнджер", 71, 90, 26, 25, 19);
        Gryffindor ronWeasley = new Gryffindor("Рон", "Уизли", 15, 35, 86, 71, 37);
        Hufflepuff zachariahSmith = new Hufflepuff("Захария", "Смит", 16, 56, 26, 36, 15);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик", "Диггори", 52, 76, 28, 38, 12);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин", "Финч-Флетчли", 45, 25, 63, 4, 24);
        Ravenclaw zhouChang = new Ravenclaw("Чжоу", "Чанг", 62, 25, 14, 63, 74, 58);
        Ravenclaw padmaPatil = new Ravenclaw("Падма", "Патил", 25, 64, 25, 47, 58, 24);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус", "Белби", 46, 57, 3, 64, 68, 3);
        Slytherin dracoMalfoy = new Slytherin("Драко", "Малфой", 56, 3, 35, 46, 71, 53, 82);
        Slytherin grahamMontague = new Slytherin("Грэхэм", "Монтегю", 34, 27, 54, 72, 68, 35, 13);
        Slytherin gregoryGoyle = new Slytherin("Грегори", "Гойл", 36, 5, 25, 82, 35, 36, 39);


        separator();
        padmaPatil.printHogwarts();
        separator();
        harryPoter.printGryffindor();
        separator();
        hermioneGranger.equalsGryffindor(ronWeasley);
        separator();
        dracoMalfoy.equalsHogwarts(harryPoter);
        separator();

    }
}