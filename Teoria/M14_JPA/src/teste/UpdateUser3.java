package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.User;

public class UpdateUser3 {
  public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("M14_JPA");
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();

    User user = em.find(User.class, 1L);
    em.detach(user);
    user.setName("Nicolas Pereira");

    em.merge(user);

    em.getTransaction().commit();

    em.close();
    emf.close();
  }
}
