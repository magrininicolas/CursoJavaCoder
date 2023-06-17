package testes.testes_User;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.User;

public class GetUsers {
  public static void main(String[] args) {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("M14_JPA");
    EntityManager em = emf.createEntityManager();

    // String jpql = "SELECT u FROM User u";
    // TypedQuery<User> query = em.createQuery(jpql, User.class);
    // query.setMaxResults(5);

    List<User> users = em
    .createQuery("SELECT u FROM User u", User.class)
    .setMaxResults(5)
    .getResultList();

    for(User us : users) {
      System.out.println("ID: " + us.getId() + " - Name: " + us.getName() + " - Email: " + us.getEmail());
    }

    em.close();
    emf.close();
  }
}
