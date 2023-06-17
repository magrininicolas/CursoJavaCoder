package testes.testes_User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.User;

public class NewUser {
  public static void main(String[] args) {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("M14_JPA");
    EntityManager em = emf.createEntityManager();

    User newUser = new User("Lucas", "lucasmoreira@hotmail.com");

    em.getTransaction().begin();
    em.persist(newUser);
    em.getTransaction().commit();

    System.out.println("Generated ID: " + newUser.getId());

    em.close();
    emf.close();
  }
}
