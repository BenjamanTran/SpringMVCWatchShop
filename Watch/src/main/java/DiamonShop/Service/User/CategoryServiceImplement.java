package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.ProductsDao;
import DiamonShop.Dto.ProductsDto;
@Service
public class CategoryServiceImplement implements ICategoryService{

	@Autowired
	ProductsDao productsDao;
	public List<ProductsDto> getDataProductsPaginate(int id,int start, int totalPage ) {
		// TODO Auto-generated method stub
		
		return productsDao.getDataProductPaginate(id,start, totalPage);
	}
	public List<ProductsDto> getDataProductByIdCategory(int id) {
		// TODO Auto-generated method stub
		return productsDao.getDataProductByIdCategory(id);
	}
	public List<ProductsDto> getDataProductsOfPageByIdCategory(int id_category, int page, int number_of_products) {
		// TODO Auto-generated method stub
		return productsDao.getProductsWithPageDao(id_category, page, number_of_products);
	}
	public int getQuantityPageInCategory(int id_category, int numberOfProducts) {
		// TODO Auto-generated method stub
		return productsDao.getQuantityPageInCategoryDAO(id_category, numberOfProducts);
	}

}
