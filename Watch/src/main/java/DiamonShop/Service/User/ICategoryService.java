package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dto.ProductsDto;
@Service
public interface ICategoryService {
	@Autowired
	public List<ProductsDto> getDataProductsPaginate(int id, int start,int totalPage);
	public List<ProductsDto> getDataProductByIdCategory(int id);
	public List<ProductsDto> getDataProductsOfPageByIdCategory(int id_category,int page,int number_of_products);
	public int getQuantityPageInCategory(int id_category,int numberOfProducts);
}
