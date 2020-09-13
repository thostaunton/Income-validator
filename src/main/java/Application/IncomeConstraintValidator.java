package Application;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IncomeConstraintValidator implements ConstraintValidator<ValidIncome, RegularAmount> {

    @Override
    public boolean isValid(RegularAmount value, ConstraintValidatorContext context) {
        Double result = 0.00;
        switch(value.getFrequency()) {

            case WEEK:
                return true;
            case TWO_WEEK:
                result = Double.parseDouble(value.getAmount()) / 2;
                break;
            case FOUR_WEEK:
                result = Double.parseDouble(value.getAmount()) / 4;
                break;
            case QUARTER:
                result = Double.parseDouble(value.getAmount()) / 13;
                break;
            case YEAR:
                result = Double.parseDouble(value.getAmount()) / 52;
                break;

        }
        String paymentPerInterval = String.valueOf(result);
        if(paymentPerInterval.length() <= paymentPerInterval.indexOf(".") + 2){
            // If the length of the paymentPerInterval is more than two indexes after the decimal point (longer than 0.00)
            return true;
        }else {
            return false;
        }
    }
}

