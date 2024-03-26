package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	EntityManagerFactory emf;

	public void saveEmployee(Employee emp) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(emp);
		et.commit();
	}

	public List<Employee> displayAllEmployee() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("select s from Employee s");
		return query.getResultList();
	}

	public void removeEmployee(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Employee emp = em.find(Employee.class, id);

		et.begin();
		em.remove(emp);
		et.commit();
	}

	public Employee updateEmployeeById(int id) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		return em.find(Employee.class, id);
		
	}
	public void updateEmployeeById(Employee emp) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.merge(emp);
		et.commit();
		
	}
	
	
}
