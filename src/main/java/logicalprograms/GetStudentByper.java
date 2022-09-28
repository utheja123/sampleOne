package logicalprograms;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class GetStudentByper {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		//System.out.println(emf);
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select s From Student s WHERE s.percentage=?1");
		List<Student> al=q.getResultList();
		q.setParameter(1,88.56 );
		for(Student s:al)
		{
			System.out.println("id:"+s.getRol());
			System.out.println("name:"+s.getName());
			System.out.println("percentage:"+s.getPercentage());
		}
	}

}
