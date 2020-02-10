import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestEmp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Emp e=new Emp();
		e.setEname("Soumya");
		em.persist(e);
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("Inserted.........");

	}

}
