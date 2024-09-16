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
        return "Студент Гриффиндора-" + name + ' ' + surname + ": " +
                "благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery +
                ", сила магии = " + powerOfMagic +
                ", расстояние трансгрессии = " + transgressionDistance;
    }

    public void printGryffindor() {
        System.out.println(this.toString());
    }

    public int studentGryffindorStrength() {
        int sum = this.nobility + this.honor + this.bravery;
        return sum;
    }

    public void equalsGryffindor(Gryffindor gryffindor) {
        int sum1 = this.studentGryffindorStrength();
        int sum2 = gryffindor.studentGryffindorStrength();
        if (sum1 > sum2) {
            System.out.println(this.name + " лучший Гриффиндорец, чем " + gryffindor.name);
        } else if (sum1 < sum2) {
            System.out.println(gryffindor.name + " лучший Гриффиндорец, чем " + this.name);
        } else {
            System.out.println(this.name + " и " + gryffindor.name + "одинаково хорошие Гриффиндорцы!");
        }
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
}
