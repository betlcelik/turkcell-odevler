package hafta3.business.concretes;

import java.util.ArrayList;

import java.util.List;

import hafta3.business.abstracts.CourseService;
import hafta3.entities.Course;
import hafta3.dataAccess.abstracts.CourseDao;

public class CourseManager implements CourseService {
	
	private CourseDao courseDao;
	List<Course> courses= new ArrayList<Course>();
	
	public CourseManager(CourseDao courseDao) {
		this.courseDao=courseDao;
	}

	@Override
	public void add(Course course) throws Exception {
		
		if(course.getPrice()< 0) {
			throw new Exception("Price of the course cant not be less than 0");
		}
		
		for(Course _course:courses) {
			if(course.getName() == _course.getName()) {
				throw new Exception("The course with "+_course.getName()+" name is already exist");
			}
		}
		
		
		courses.add(course);
		courseDao.add(course);
			
		
		
	}
	
	

}
