package webapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import domain.Employee;
import domain.EmployeeRepository;

@Controller
public class EmployeeController {

	@Autowired
	protected EmployeeRepository repository;

	@RequestMapping("/emps")
	public String show(Model model) {

		List<Employee> emps = repository.findAll();
		model.addAttribute("emps", emps);

		return "emps";
	}

	@RequestMapping("/add")
	public String add(
			@RequestParam(value = "empId", required = true) String empId,
			@RequestParam(value = "empName", required = true) String empName,
			Model model) {

		Employee emp = new Employee(empId, empName);

		repository.save(emp);
		List<Employee> list = repository.findAll();
		
		model.addAttribute("emps", list);

		return "emps";
	}

	@RequestMapping("/form")
	public String form() {

		return "form";
	}
}
