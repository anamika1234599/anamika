import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.onlineexam.entity.Users;

import javax.persistence.EntityManager;

public class UsersTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Users user1 = new Users();
		user1.setEmail("anamika1397@gmail.com");
		user1.setFullname("Anamika");
		user1.setPassword("Helloworld");
        
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OnlineExaminationSystem");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(user1);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		
		System.out.println("A Users object was persisted");

	}

}
