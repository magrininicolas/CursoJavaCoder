package testes.testes_User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.User;

public class UpdateUser2 {
  public static void main(String[] args) {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("M14_JPA");
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();

    User user = em.find(User.class, 1L);
    user.setName("Nicolas Pereira");

    em.getTransaction().commit();

    em.close();
    emf.close();
  }
}
