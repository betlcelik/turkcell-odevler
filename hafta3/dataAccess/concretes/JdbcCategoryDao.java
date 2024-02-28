package hafta3.dataAccess.concretes;

import hafta3.entities.Category;

import hafta3.dataAccess.abstracts.CategoryDao;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile eklendi : " + category.getName());
		
	}

}
