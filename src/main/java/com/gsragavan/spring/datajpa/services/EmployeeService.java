package com.gsragavan.spring.datajpa.services;

import com.gsragavan.spring.datajpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService {
    private EntityManagerFactory emf;
    @Autowired
    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public List<Employee> getEmployees() {
        EntityManager em = this.emf.createEntityManager();
        return em.createQuery("from Employee", Employee.class).getResultList();
    }

    public Employee createOrUpdateEmployee(Employee employee) {
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        Employee emp =  em.merge(employee);
        em.getTransaction().commit();
        return emp;
    }
}
