package persistence.repositoryimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import persistence.dao.EmpDao;
import persistence.entity.Emp;

import com.google.common.collect.Lists;

import domain.Employee;
import domain.EmployeeRepository;

@Repository
public class EmpRepositoryImpl implements EmployeeRepository {

	@Autowired
	protected EmpDao empDao;

	@Override
	public List<Employee> findAll() {
		List<Employee> employeeList = Lists.newArrayList();
		empDao.find().forEach(e ->
			employeeList.add(new Employee(e.getEmpId(), e.getEmpName()))
		);
		List<java.sql.Date> l = Lists.newArrayList();
		List<java.util.Date> l2 = Lists.newArrayList();
		

		return employeeList;
		
	}

	@Override
	public int save(Employee emp) {
		return empDao.save(new Emp(emp.getId(),emp.getName())).getCount();
	}
}
