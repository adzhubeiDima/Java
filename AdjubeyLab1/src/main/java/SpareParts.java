import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

public class SpareParts  {

    @NotBlank(message = "Навза не має бути пустою")
    private String name;

    @Min(value = 1, message = "Вартість має бути > 0")
    private int cost;

    @NotBlank(message = "Країна виробник не має бути пустою")
    private String countryDevelop;

    public SpareParts(String name, int cost, String countryDevelop) {
        this.name = name;
        this.cost = cost;
        this.countryDevelop = countryDevelop;

        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<SpareParts>> constraintViolations = validator.validate(this);

        for(ConstraintViolation constraintViolation : constraintViolations) {
            String fieldName = constraintViolation.getPropertyPath().toString().toUpperCase();
            System.out.println(fieldName + " " + constraintViolation.getMessage());
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCountryDevelop() {
        return countryDevelop;
    }

    public void setCountryDevelop(String countryDevelop) {
        this.countryDevelop = countryDevelop;
    }

    @Override
    public String toString() {
        return
                name + " ; " +
                countryDevelop + " ; " +
                cost + " $" +
                " \n"
            ;
    }
}
