import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IncomeConstraintValidator implements ConstraintValidator<ValidIncome, Object> {


    @Override
    public boolean isValid(Object regularAmount, ConstraintValidatorContext context) {
        return regularAmount != null;
    }
}

