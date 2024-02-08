package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.Dao;
import dto.Employee;
import services.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeservice;
	
	
	@GetMapping("/")
	public String Home()
	{
		return "home";
	}

	@GetMapping("/insert")
	public String loadInsert()
	{
		return "insert";
	}

	@PostMapping("/insert")
	public String Insertdata(ModelMap map,Employee emp)
	{
		//logic for storing data
		employeeservice.insert(emp, map);
	    map.put("message", "data added");
		return Home();
	}

	@GetMapping("/fetch")
	public String fetchAll(ModelMap map)
	{
		
		return employeeservice.fetchAll(map);
	}
	
	@GetMapping("/delete")
    public String deleteEmployee(@RequestParam int id,ModelMap map) {
		
        return (employeeservice.deleteEmp(id,map));
    }
	
}

