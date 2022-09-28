package logicalprograms;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetstudentbyPercentage {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select s From Student s where s.percentage>:myper");
	    q.setParameter("myper", 75.00);
		List<Student> al=q.getResultList();

		for(Student s:al)
		{
			System.out.println("id:"+s.getRol());
			System.out.println("name:"+s.getName());
			System.out.println("percentage:"+s.getPercentage());
			System.out.println("---------------");

		}
	}

}
