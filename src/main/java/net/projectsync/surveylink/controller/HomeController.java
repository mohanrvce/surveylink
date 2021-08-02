package net.projectsync.surveylink.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import net.projectsync.surveylink.model.Employee;
import net.projectsync.surveylink.repo.EmployeeRepo;

@RestController
public class HomeController {

	@Autowired
	EmployeeRepo employeeRepo;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main() {
		return "hello, world";
	}

	@RequestMapping(value = "/add-employee", method = RequestMethod.GET)
	public String addEmplyee() {
		int num = (int) employeeRepo.count() + 1;
		Employee employee = new Employee("mohan " + num);
		employeeRepo.save(employee);
		return "mohan " + num;
	}

	@RequestMapping(value = "/get-employees", method = RequestMethod.GET)
	public List<Employee> getEmployees() {
		return employeeRepo.findAll();
	}
	
	
	
}

