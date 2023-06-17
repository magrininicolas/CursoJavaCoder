package testes.testes_User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.User;

public class DeleteUser {
  public static void main(String[] args) {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("M14_JPA");
    EntityManager em = emf.createEntityManager();

    User user = em.find(User.class, 5L);

    if(user != null) {
      em.getTransaction().begin();
      em.remove(user);
      em.getTransaction().commit();
    }

    em.close();
    emf.close();
  }
}
