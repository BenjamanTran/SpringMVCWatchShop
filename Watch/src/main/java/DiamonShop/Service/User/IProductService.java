package DiamonShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import DiamonShop.Dto.ProductsDto;

@Service
public interface IProductService {
	public ProductsDto getProductById(long id);

	public List<ProductsDto> getProductsByIdCategory(int id_category);

	public List<ProductsDto> searchProductsByName(String name);

	public List<ProductsDto> viewMoreByStyle(Boolean highlight_products, Boolean new_products, int page,
			int number_of_products);
}
