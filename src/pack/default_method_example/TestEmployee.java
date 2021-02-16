package pack.default_method_example;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new DefaultEmployee("100", "Mike", "IT", new BigDecimal(5322)),
				new DefaultEmployee("200", "Jane", "Admin", new BigDecimal(6754)));
		System.out.println(Employee.getEmployeeInfo(employees));
	}
}
