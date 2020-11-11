package com.stackroute.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.stackroute.model.Employee;
import com.stackroute.repo.EmployeeRepository;

@Controller
public class EmployeeController {

	private ApplicationContext appCtx = new ClassPathXmlApplicationContext("Spring-Beans.xml");
	Employee emp = (Employee) appCtx.getBean("empBean");
	EmployeeRepository empRepo = (EmployeeRepository) appCtx.getBean("empRepo");
	
	@GetMapping("/")
	public String indexPage(ModelMap model) {
		model.addAttribute("employees", empRepo.getEmployees());
		return "index";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee")Employee emp, BindingResult bindingResult, ModelMap model) {
		empRepo.addEmployee(emp);
		model.addAttribute("employees", empRepo.getEmployees());
		for(Employee e : empRepo.getEmployees()) {
			System.out.println(e);
		}
		return "index";
	}
}
