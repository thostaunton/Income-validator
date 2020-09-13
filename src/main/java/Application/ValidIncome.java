package Application;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;

@Documented
@Constraint(validatedBy = IncomeConstraintValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({FIELD})
@ReportAsSingleViolation
public @interface ValidIncome {

    String message() default "Invalid Income";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}