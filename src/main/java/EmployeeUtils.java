import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeUtils {

    public String getFullName(Employee employee) {
        Function<Employee, String> fullName = null;
        return fullName.apply(employee);
    }

    public String getManagerLastName(Employee employee) {
        Function<Employee, String> managerLastName = null;
        return managerLastName.apply(employee);
    }

    public boolean hasBeenEmployedLongerThanFiveYears(Employee employee) {
        Predicate<Employee> employedLongerThanFiveYears = null;
        return employedLongerThanFiveYears.test(employee);
    }
}
