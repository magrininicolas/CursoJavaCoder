package infra;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {

  private static final Logger logger = LogManager.getLogger(DAO.class);
  private static EntityManagerFactory emf;
  private EntityManager em;
  private Class<E> clazz;

  static {
    try {
      emf = Persistence.createEntityManagerFactory("M14_JPA");
    } catch (Exception e) {
      logger.error("Ocorreu um erro ao criar o Entity Manager Factory: ", e);
    }
  }

  public DAO() {
    this(null);
  }

  public DAO(Class<E> clazz) {
    this.clazz = clazz;
    em = emf.createEntityManager();
  }

  public DAO<E> openTransaction() {
    em.getTransaction().begin();
    return this;
  }

  public DAO<E> closeTransaction() {
    em.getTransaction().commit();
    return this;
  }

  public DAO<E> include(E entity) {
    em.persist(entity);
    return this;
  }

  public E getByID(Long id) {
    return em.find(clazz, id);
  }

  public List<E> obtainAll() {
    return this.obtainAll(10, 0);
  }

  public List<E> obtainAll(Integer quantity, Integer displacement) {
    if (clazz == null) {
      throw new UnsupportedOperationException("Null class");
    }

    String jpql = "SELECT e FROM " + clazz.getName() + " e";
    TypedQuery<E> query = em.createQuery(jpql, clazz);
    query.setMaxResults(quantity);
    query.setFirstResult(displacement);
    return query.getResultList();
  }

  public List<E> consult(String consultName, Object... params) {
    TypedQuery<E> query = em.createNamedQuery(consultName, clazz);
    for (int i = 0; i < params.length; i += 2) {
      query.setParameter(params[i].toString(), params[i + 1]);
    }

    return query.getResultList();
  }

  public void close() {
    em.close();
  }
}
