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
        if(String.valueOf(result).indexOf(".") >= 0 && String.valueOf(result).indexOf(".") < String.valueOf(result).length() - 2){
            return true;
        }else {
            return false;
        }
    }
}

