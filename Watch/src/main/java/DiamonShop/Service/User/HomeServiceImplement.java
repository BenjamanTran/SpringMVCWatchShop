package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.CategorysDao;
import DiamonShop.Dao.MenusDao;
import DiamonShop.Dao.ProductsDao;
import DiamonShop.Dao.SlidesDao;
import DiamonShop.Dto.ProductsDto;
import DiamonShop.Entity.Categorys;
import DiamonShop.Entity.Menus;
import DiamonShop.Entity.Slides;
@Service
public class HomeServiceImplement  implements IHomeService{
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategorysDao categorysDao;
	@Autowired
	private MenusDao menusDao;
	@Autowired
	private ProductsDao productsDao;

	public List<Slides> GetDataSlide() {
		// TODO Auto-generated method stub
		return slidesDao.GetDataSlide();
	}

	public List<Categorys> GetDataCategorys() {
		// TODO Auto-generated method stub
		return categorysDao.getDataCategorys();
	}

	public List<Menus> GetDataMenus() {
		// TODO Auto-generated method stub
		return menusDao.getDataMenus();
	}

	public List<ProductsDto> GetDataProducts() {
		// TODO Auto-generated method stub
		List<ProductsDto> list=productsDao.getDataProducts();
		
		return list;
	}

	public List<ProductsDto> GetData_Highlight_Products() {
		// TODO Auto-generated method stub
		List<ProductsDto> list=productsDao.getDataHighlightProducts();
		return list;
	}

	public Object GetData_New_Products() {
		// TODO Auto-generated method stub
		List<ProductsDto> list=productsDao.getDataNewProducts();
		return list;
	}

	public int getQuantityPageInViewMore(Boolean highlight_products, Boolean new_products,
			Boolean all_products, int numberOfProducts) {
		// TODO Auto-generated method stub
		return productsDao.getQuantityPageInViewMoreDao(highlight_products, new_products, all_products, numberOfProducts);
	}
	
	


}
