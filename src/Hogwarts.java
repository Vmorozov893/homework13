public abstract class Hogwarts {
    protected final String name;
    protected final String surname;
    protected final int powerOfMagic;
    protected final int transgressionDistance;

    public Hogwarts(String name, String surname, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String toHogwartsString() {
        return "Студент Хогвартса-" + name + ' ' + surname + ": " +
                ", сила магии = " + powerOfMagic +
                ", расстояние трансгрессии = " + transgressionDistance;
    }

    public void printHogwarts() {
        System.out.println(this.toHogwartsString());
    }

    public int studentHogwartsStrength() {
        int sum = this.powerOfMagic + this.transgressionDistance;
        return sum;
    }

    public void equalsHogwarts(Hogwarts hogwarts) {
        int sum1 = this.studentHogwartsStrength();
        int sum2 = hogwarts.studentHogwartsStrength();
        if (sum1 > sum2) {
            System.out.println(this.name + " обладает большей мощностью магии, чем " + hogwarts.name + '.');
        } else if (sum1 < sum2) {
            System.out.println(hogwarts.name + " обладает большей мощностью магии, чем " + this.name + '.');
        } else {
            System.out.println(this.name + " и " + hogwarts.name + "одинаково хороши в магии!");
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
}