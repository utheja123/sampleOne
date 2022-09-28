package logicalprograms;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Getteacherbyemailandpassword {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select t From Teacher t WHERE t.email=:email AND t.password=:pass");
	    q.setParameter("email","vennela@gmail.com" );
	    q.setParameter("pass", "234");
	    List<Teacher> al=q.getResultList();
	    for(Teacher t:al)
	    {
	    	System.out.println("teacher name:"+t.getName());
	    	System.out.println("teacher email:"+t.getEmail());
	    	System.out.println("teacher password:"+t.getPassword());
	    	System.out.println("subject taken by teacher:"+t.getSubject());
	    	
	    	
	    }
	}

}
