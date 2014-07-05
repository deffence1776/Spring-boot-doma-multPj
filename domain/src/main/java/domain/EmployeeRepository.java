package domain;

import java.util.List;

public interface EmployeeRepository {
	public List<Employee> findAll();
	public int save(Employee emp);
}
