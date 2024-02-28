package hafta3.dataAccess.concretes;

import hafta3.entities.Category;

import hafta3.dataAccess.abstracts.CategoryDao;

public class HibernateCategoryDao  implements CategoryDao{
	
	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile eklendi : " + category.getName());
		
	}

}
