package teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import modelo.User;

public class GetUsers {
  public static void main(String[] args) {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("M14_JPA");
    EntityManager em = emf.createEntityManager();

    List<User> users = em
    .createQuery("SELECT u FROM User u", User.class)
    .setMaxResults(5)
    .getResultList();

    for(User us : users) {
      System.out.println("ID: " + us.getId() + "\nName: " + us.getName() + "\nEmail: " + us.getEmail());
    }

    em.close();
    emf.close();
  }
}
