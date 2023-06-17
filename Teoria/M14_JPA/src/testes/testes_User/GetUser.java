package testes.testes_User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.User;

public class GetUser {
  public static void main(String[] args) {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("M14_JPA");
    EntityManager em = emf.createEntityManager();

    User user = em.find(User.class, 7L);
    System.out.println(user.getName()); 
    
    em.close();
    emf.close();
  }
}
