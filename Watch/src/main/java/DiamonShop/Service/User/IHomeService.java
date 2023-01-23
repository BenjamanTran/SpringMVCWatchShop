package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dto.ProductsDto;
import DiamonShop.Entity.Categorys;
import DiamonShop.Entity.Menus;
import DiamonShop.Entity.Slides;
@Service
public interface IHomeService {
	
	@Autowired
	public List<Slides> GetDataSlide();
	public List<Categorys> GetDataCategorys();
	public List<Menus> GetDataMenus();
	public List<ProductsDto> GetDataProducts();
	public List<ProductsDto> GetData_Highlight_Products();
	public int getQuantityPageInViewMore(Boolean highlight_products, Boolean new_products, Boolean all_products,
			int numberOfProducts);
	public Object GetData_New_Products() ;
}
