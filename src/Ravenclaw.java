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
        return "Студент Когтеврана-" + name + ' ' + surname + ": " +
                "ум = " + smart +
                ", мудрость = " + wisdom +
                ", остроумие = " + wit +
                ", творчество = " + creation +
                ", сила магии = " + powerOfMagic +
                ", расстояние трансгрессии = " + transgressionDistance;
    }

    public void print() {
        System.out.println(this.toString());
    }

    public int studentRavenclawStrength() {
        int sum = this.smart + this.wisdom + this.wit + this.creation;
        return sum;
    }

    public void equalsRavenclaw(Ravenclaw ravenclaw) {
        int sum1 = this.studentRavenclawStrength();
        int sum2 = ravenclaw.studentRavenclawStrength();
        if (sum1 > sum2) {
            System.out.println(this.name + " лучший Когтевранец, чем " + ravenclaw.name);
        } else if (sum1 < sum2) {
            System.out.println(ravenclaw.name + " лучший Когтевранец, чем " + this.name);
        } else {
            System.out.println(this.name + " и " + ravenclaw.name + "одинаково хорошие Когтевранцы!");
        }
    }

    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }
}
