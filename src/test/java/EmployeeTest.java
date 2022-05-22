import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private EmployeeUtils employeeUtils = new EmployeeUtils();

    @Test
    void employeeFullName() {
        Employee employee = new Employee();
        employee.setFirstName("Jerome");
        employee.setLastName("Donaldson");

        String actual = employeeUtils.getFullName(employee);

        assertEquals(actual, "Jerome Donaldson");
    }

    @Test
    void EmployeeManagersLastName() {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee2.setLastName("Westbay");
        employee1.setManager(employee2);

        String actual = employeeUtils.getManagerLastName(employee1);

        assertEquals(actual, "Westbay");
    }

    @Test
    void EmployedLongerThanFiveYears() {
        Employee employee1 = new Employee();
        employee1.setYearsOfService(7);
        Employee employee2 = new Employee();
        employee2.setYearsOfService(3);

        boolean actual1 = employeeUtils.hasBeenEmployedLongerThanFiveYears(employee1);
        boolean actual2 = employeeUtils.hasBeenEmployedLongerThanFiveYears(employee2);

        assertTrue(actual1);
        assertFalse(actual2);
    }

    @Test
    void EmployeeMoreThanThreeReports() {
        Employee employee1 = new Employee();
        employee1.setNumberOfDirectReports(5);
        Employee employee2 = new Employee();
        employee2.setYearsOfService(2);

        boolean actual1 = employeeUtils.hasMoreThanThreeDirectReports(employee1);
        boolean actual2 = employeeUtils.hasMoreThanThreeDirectReports(employee2);

        assertTrue(actual1);
        assertFalse(actual2);
    }

    @Test
    void employeeHasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports() {
        Employee employee = new Employee();
        employee.setYearsOfService(5);
        employee.setNumberOfDirectReports(1);

        boolean actual = employeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee);

        assertTrue(actual);
    }

}