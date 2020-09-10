package Application;

public class Citizen {
    @ValidIncome
    RegularAmount regularAmount;

    public Citizen(RegularAmount regularAmount) {
        this.regularAmount = regularAmount;
    }

    public Citizen() {
    }

    public RegularAmount getRegularAmount() {
        return regularAmount;
    }

    public void setRegularAmount(RegularAmount regularAmount) {
        this.regularAmount = regularAmount;
    }
}
