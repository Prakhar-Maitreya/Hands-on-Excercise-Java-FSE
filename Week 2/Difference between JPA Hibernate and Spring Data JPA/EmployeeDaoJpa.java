package com.example;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmployeeDaoJpa {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void save(Employee e) {
        em.persist(e);
    }

    public Employee find(int id) {
        return em.find(Employee.class, id);
    }
}
