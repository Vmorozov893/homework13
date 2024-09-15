public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, String surname, int powerOfMaggic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, surname, powerOfMaggic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Студент Гриффиндора-" + name + surname + ": " +
                "благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery +
                ", сила магии = " + powerOfMagic +
                ", расстояние трансгрессии = " + transgressionDistance;
    }
    public void print(Gryffindor gryffindor){
        System.out.println(gryffindor.toString());
    }

}
