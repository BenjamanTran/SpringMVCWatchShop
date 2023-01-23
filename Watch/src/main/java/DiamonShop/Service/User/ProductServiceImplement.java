package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.ProductsDao;
import DiamonShop.Dto.ProductsDto;
@Service
public class ProductServiceImplement implements IProductService{
	@Autowired
	ProductsDao productsDao=new ProductsDao();
	public ProductsDto getProductById(long id) {
		// TODO Auto-generated method stub
		List<ProductsDto> list= productsDao.getProductById(id);
		
		return list.get(0);
	}
	public List<ProductsDto> getProductsByIdCategory(int id_category) {
		// TODO Auto-generated method stub
		List<ProductsDto> list=productsDao.getDataProductByIdCategory(id_category);
		
		return list;
	}
	public List<ProductsDto> searchProductsByName(String name) {
		// TODO Auto-generated method stub
		List<ProductsDto> list=productsDao.searchProductsByName(name);
		return list;
	}
	public List<ProductsDto> viewMoreByStyle(Boolean highlight_products, Boolean new_products, int page,
			int number_of_products) {
		// TODO Auto-generated method stub
		return productsDao.getProductOfPageInTypeDao(highlight_products, new_products, page, number_of_products);
	}

}
