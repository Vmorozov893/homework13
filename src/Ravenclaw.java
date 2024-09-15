public class Ravenclaw extends Hogwarts {
    private final int smart;
    private final int wisdom;
    private final int wit;
    private final int creation;

    public Ravenclaw(String name, String surname, int powerOfMagic, int transgressionDistance, int smart, int wisdom, int wit, int creation) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Студент Когтеврана-" + name + surname + ": " +
                "ум = " + smart +
                ", мудрость = " + wisdom +
                ", остроумие = " + wit +
                ", творчество = " + creation +
                ", сила магии = " + powerOfMagic +
                ", расстояние трансгрессии = " + transgressionDistance;
    }

    public void print(Ravenclaw ravenclaw){
        System.out.println(ravenclaw.toString());
    }

}
