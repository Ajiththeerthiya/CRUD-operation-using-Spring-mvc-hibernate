package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.EmployeeDao;
import com.dto.Employee;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDao dao;

	@RequestMapping("/addemployee")
	public ModelAndView addEmploye() {
		Employee employee = new Employee();

		ModelAndView mav = new ModelAndView();
		mav.addObject("employeeobj", employee);
		mav.setViewName("employeejstlform");
		return mav;
	}

	@RequestMapping("/saveemployee")
	public ModelAndView savedata(@ModelAttribute("employeeobj") Employee employee) {
		dao.saveEmployee(employee);

		ModelAndView mav = new ModelAndView();
		mav.addObject("mesg", "Data Added successful");
		mav.setViewName("admin");
		return mav;

	}

	@RequestMapping("/viewEmployee")
	public ModelAndView listEmployee() {
		List<Employee> emp = dao.displayAllEmployee();
		ModelAndView mav = new ModelAndView();
		mav.addObject("empdata", emp);
		mav.setViewName("viewAllEmployee");
		return mav;
	}

	@RequestMapping("/deleteemp")
	public ModelAndView deleteEmp(@RequestParam("id") int id) {
		dao.removeEmployee(id);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect://listAllData");
		return mav;
	}

	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin");
		return mav;
	}

	@RequestMapping("/updateemp")
	public ModelAndView updateById(@RequestParam("id") int id) {
		Employee em = dao.updateEmployeeById(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("empdata", em);
		mav.setViewName("updatejstlform");
		return mav;
	}

	@RequestMapping("/todisplayupdated")
	public ModelAndView displayUpdated(@ModelAttribute("empdata") Employee employee) {
		dao.updateEmployeeById(employee);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect://viewEmployee");
		return mav;
	}

}
