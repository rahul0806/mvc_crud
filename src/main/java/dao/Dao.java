package dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


@Repository
public class Dao {
	@Autowired
	EntityManager  manager;
	
	public void save(Employee emp)
	{
		manager.getTransaction().begin();
		manager.persist(emp);
		manager.getTransaction().commit();
		
	}
	
	public List<Employee> fetchAll(){
		return  manager.createQuery("select x from Employee x").getResultList();
	}
	
	

	

	public Employee fetchbyid(int id) {
		// TODO Auto-generated method stub
		
		List<Employee>list=manager.createQuery("select x from Employee x where id=?1").setParameter(1,id).getResultList();
		if(list.isEmpty())
			return null;
		else
			return list.get(0);
			
	}

	public void remove(Employee employee) {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.remove(employee);
		manager.getTransaction().commit();
	}
}
