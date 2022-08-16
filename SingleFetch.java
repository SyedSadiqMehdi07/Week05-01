package com.fetch;

import javax.persistence.*;

import javax.persistence.criteria.*;
import com.sadiq.jpa.com.week5.Employee;

import java.util.*;

public class SingleFetch{

  public static void main( String args[]) {

     EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp");
     EntityManager em=emf.createEntityManager();
     em.getTransaction().begin();
     Employee s=new Employee();
     s.setEmpno(1);
     s.setEname("sadiq");
     s.setDesignation("cse");
     s.setSalary(50000.0);
     em.getTransaction().commit();
     Query q=em.createQuery("from Employee");
     List<Employee>list=q.getResultList();
     for(Employee e:list)
     {
    	 System.out.println(e.getEmpno()+e.getEname()+e.getDesignation()+e.getSalary());
    	 
     }
}
}