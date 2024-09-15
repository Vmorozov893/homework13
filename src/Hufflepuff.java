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
        return "Студент Пуффендуя-" + name + surname + ": " +
                "трудолюбие = " + hardWork +
                ", верность = " + loyalty +
                ", честность = " + honesty +
                ", сила магии = " + powerOfMagic +
                ", расстояние трансгрессии = " + transgressionDistance;
    }
    public void print(Hufflepuff hufflepuff){
        System.out.println(hufflepuff.toString());
    }
}
