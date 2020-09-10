public class Main {
    @ValidIncome
    RegularAmount regularAmount;
    public static void main(String[] args) {

        System.out.println("Hello World");

        RegularAmount regularAmount = new RegularAmount();
        regularAmount.setFrequency(RegularAmount.Frequency.WEEK);
        regularAmount.setAmount("12");

    }
}
