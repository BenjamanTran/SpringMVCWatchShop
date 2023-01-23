package DiamonShop.UserController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Service.User.IProductService;

@Controller
public class ProductController extends BaseController{
	@Autowired
	private IProductService _productService;
	
	@RequestMapping(value = {"chi-tiet-san-pham/{id}"})
	public ModelAndView Index(@PathVariable long id) {
		
		
		_mvShare.addObject("categorys",_homeServiceImplement.GetDataCategorys());
		int id_category=_productService.getProductById(id).getId_category();
		_mvShare.addObject("same_products",_productService.getProductsByIdCategory
				(id_category));
		_mvShare.addObject("product",_productService.getProductById(id));
		_mvShare.setViewName("user/products/product");
		
		return _mvShare;
	}
	
	@RequestMapping(value = {"tim-kiem-san-pham"})
	public ModelAndView Search(HttpServletRequest request) {
		String name=request.getParameter("searchString");
		_mvShare.addObject("categorys",_homeServiceImplement.GetDataCategorys());
		_mvShare.addObject("search_list_products",_productService.searchProductsByName(name));
		_mvShare.addObject("txtSearch",name);
		_mvShare.setViewName("user/products/search-list-products");
		return _mvShare;
	}
}
