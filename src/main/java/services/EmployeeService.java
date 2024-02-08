package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import dao.Dao;
import dto.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	Dao empdao;
	
	
	public String insert(Employee employee,ModelMap map)
	{
		empdao.save(employee);
		map.put("messge","data saved");
		return "home";
	}
	
	public String fetchAll(ModelMap map)
	{
		List<Employee> list=empdao.fetchAll();
		if(list.isEmpty())
		{
			map.put("message","data not found");
			return "home";
		}
		else
		{
			map.put("list", list);
			return "fetch";
		}
	
	}
	
	public String deleteEmp(int id,ModelMap map){
		Employee employee=empdao.fetchbyid(id);
		empdao.remove(employee);
		map.put("message","employee deleted succesfully");
		return "home";
	}
		    
	}

