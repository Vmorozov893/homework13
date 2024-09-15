public class Hufflepuff extends Hogwarts {
    private final int hardWork;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, String surname, int powerOfMagic, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Студент Пуффендуя-" + name + ' ' + surname + ": " +
                "трудолюбие = " + hardWork +
                ", верность = " + loyalty +
                ", честность = " + honesty +
                ", сила магии = " + powerOfMagic +
                ", расстояние трансгрессии = " + transgressionDistance;
    }

    public void print(Hufflepuff hufflepuff) {
        System.out.println(hufflepuff.toString());
    }
    public int studentStrength() {
        int sum = this.hardWork + this.loyalty + this.honesty;
        return sum;
    }

    public void equals(Hufflepuff hufflepuff) {
        int sum1 = this.studentStrength();
        int sum2 = hufflepuff.studentStrength();
        if (sum1 > sum2) {
            System.out.println(this.name + " лучший Пуффендуец, чем " + hufflepuff.name);
        } else if (sum1 < sum2) {
            System.out.println( hufflepuff.name + " лучший Пуффендуец, чем " + this.name);
        } else {
            System.out.println(this.name + " и " + hufflepuff.name + "одинаково хорошие Пуффендуйцы!");
        }
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
}
