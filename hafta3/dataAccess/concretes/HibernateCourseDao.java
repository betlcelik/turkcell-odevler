
package hafta3.dataAccess.concretes;

import hafta3.entities.Course;

import hafta3.dataAccess.abstracts.CourseDao;

public class HibernateCourseDao implements CourseDao{
	
	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile eklendi : " + course.getName() );
		
	}


}
