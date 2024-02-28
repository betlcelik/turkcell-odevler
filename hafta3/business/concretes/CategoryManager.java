package hafta3.business.concretes;

import java.util.ArrayList;


import java.util.List;

import hafta3.business.abstracts.CategoryService;
import hafta3.core.abstracts.Logger;
import hafta3.entities.Category;
import hafta3.dataAccess.abstracts.CategoryDao;

public class CategoryManager implements CategoryService {
	
	private CategoryDao categoryDao;
	List<Category> categories= new ArrayList<Category>();
	List<Logger> loggers;

	public CategoryManager(CategoryDao categoryDao,List<Logger> loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers=loggers;
	}

	@Override
	public void add(Category category) throws Exception {
		for (Category _category : categories) {
			if(_category.getName() == category.getName()) {
				
				throw new Exception("The category with "+_category.getName()+" name is already exist");
			}
		}
		
		categoryDao.add(category);
		categories.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
		
		
		
	}

}
