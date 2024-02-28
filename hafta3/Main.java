package hafta3;

import java.util.ArrayList;
import java.util.List;

import hafta3.business.concretes.CategoryManager;
import hafta3.business.concretes.CourseManager;
import hafta3.core.abstracts.Logger;
import hafta3.core.concretes.DatabaseLogger;
import hafta3.core.concretes.MailLogger;
import hafta3.dataAccess.concretes.HibernateCategoryDao;
import hafta3.dataAccess.concretes.JdbcCourseDao;
import hafta3.entities.Category;
import hafta3.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Category category1= new Category();
		category1.setId(1);
		category1.setName("Cat1");
		
		Category category2= new Category();
		category2.setId(1);
		category2.setName("Cat2");
		
		
		
		List<Logger > loggers = new ArrayList<Logger>();
		loggers.add(new MailLogger());
		loggers.add(new DatabaseLogger());
		
		CategoryManager categoryManager= new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		categoryManager.add(category2);
		
		Course course1= new Course();
		course1.setId(1);
		course1.setName("course1");
		course1.setPrice(500);
		
		Course course2= new Course();
		course2.setId(2);
		course2.setName("course2");
		
		
		CourseManager courseManager=new CourseManager(new JdbcCourseDao());
		courseManager.add(course1);
		courseManager.add(course2);
		
		
		

	}

}
