public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;

    public Slytherin(String name, String surname, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Студент Слизерина-" + name + ' ' + surname + ": " +
                "хитрость = " + cunning +
                ", решительность = " + determination +
                ", амбициозность = " + ambition +
                ", находчивость = " + resourcefulness +
                ", жажда власти = " + lustForPower +
                ", сила магии = " + powerOfMagic +
                ", расстояние трансгрессии = " + transgressionDistance;
    }

    public void printSlytherin() {
        System.out.println(this.toString());
    }

    public int studentSlytherinStrength() {
        int sum = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        return sum;
    }

    public void equalsSlytherin(Slytherin slytherin) {
        int sum1 = this.studentSlytherinStrength();
        int sum2 = slytherin.studentSlytherinStrength();
        if (sum1 > sum2) {
            System.out.println(this.name + " лучший Слизеринец, чем " + slytherin.name);
        } else if (sum1 < sum2) {
            System.out.println(slytherin.name + " лучший Слизеринец, чем " + this.name);
        } else {
            System.out.println(this.name + " и " + slytherin.name + "одинаково хорошие Слизеринцы!");
        }
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
}
