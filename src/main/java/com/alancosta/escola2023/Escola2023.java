/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.alancosta.escola2023;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alan
 */
public class Escola2023 {

    public static void main(String[] args) {
       String fotoString ="446546546546";
        byte[] teste = fotoString.getBytes();

        Aluno aluno = new Aluno(null,teste,"45646","alan","tste","teste","teste");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conectajpa");
        EntityManager em =  emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(aluno);
        em.getTransaction().commit();
        System.out.println("Hello World!");
        
    }
}
