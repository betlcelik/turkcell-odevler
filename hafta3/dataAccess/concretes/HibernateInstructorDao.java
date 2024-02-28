package hafta3.dataAccess.concretes;

import hafta3.entities.Instructor;

import hafta3.dataAccess.abstracts.InstructorDao;

public class HibernateInstructorDao implements InstructorDao {
	
	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile eklendi : " + instructor.getFirstName() + " " + instructor.getLastName());
		
	}

}
