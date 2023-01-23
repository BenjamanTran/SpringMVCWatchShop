package DiamonShop.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Dto.PaginateDto;
import DiamonShop.Service.User.CategoryServiceImplement;
import DiamonShop.Service.User.PaginatesServiceImplement;

@Controller
@RequestMapping(value = "/san-pham/")
public class CategoryController extends BaseController {
	
	private int totalProductsInPage=9;
	@Autowired
	private CategoryServiceImplement categoryServiceImp;
	
	
	@RequestMapping(value = "{id}")
	public ModelAndView ProductsOfCategory(@PathVariable String id) {
		
		_mvShare.addObject("categorys",_homeServiceImplement.GetDataCategorys());
		_mvShare.addObject("quantyOfPages",categoryServiceImp.getQuantityPageInCategory(Integer.parseInt(id), totalProductsInPage));
		_mvShare.addObject("ProductsOfPage",categoryServiceImp.getDataProductsOfPageByIdCategory(Integer.parseInt(id), 1, totalProductsInPage));
		_mvShare.addObject("currentPage",1);
		_mvShare.addObject("idCategory",Integer.parseInt(id));
		_mvShare.setViewName("user/products/category");
		return _mvShare;
	}
	@RequestMapping(value = "{id}/{currentPage}")
	public ModelAndView ProductsOfPageInCategory(@PathVariable String id,@PathVariable String currentPage) {
		_mvShare.addObject("categorys",_homeServiceImplement.GetDataCategorys());
		_mvShare.addObject("quantyOfPages",categoryServiceImp.getQuantityPageInCategory(Integer.parseInt(id), totalProductsInPage));
		_mvShare.addObject("ProductsOfPage",categoryServiceImp.getDataProductsOfPageByIdCategory(Integer.parseInt(id), Integer.parseInt(currentPage), totalProductsInPage));
		_mvShare.addObject("currentPage",Integer.parseInt(currentPage));
		_mvShare.addObject("idCategory",Integer.parseInt(id));
		_mvShare.setViewName("user/products/category");
		return _mvShare;
	}
	//	this is siviCode coding 
//	@RequestMapping(value = "{id}")
//	public ModelAndView Product(@PathVariable String id) {
//		_mvShare.addObject("categorys",_homeServiceImplement.GetDataCategorys());
//		_mvShare.setViewName("user/products/category");
//		_mvShare.addObject("allProductsByIdCategory",
//				categoryServiceImp.getDataProductByIdCategory(Integer.parseInt(id)));
//		int totalData = categoryServiceImp.getDataProductByIdCategory(Integer.parseInt(id)).size();
//		PaginateDto paginateDto = paginatesServiceImp.GetInfoPaginates(totalData, totalProductsInPage, 1);
//
//		_mvShare.addObject("productsPaginate", categoryServiceImp.getDataProductsPaginate(Integer.parseInt(id),
//				paginateDto.getStart(), totalProductsInPage));
//		_mvShare.addObject("paginateInfo", paginateDto);
//		_mvShare.addObject("idCategory", id);
//		return _mvShare;
//	}
//	
//	@RequestMapping(value = "{id}/{currentPage}")
//	public ModelAndView Product(@PathVariable String id,@PathVariable String currentPage) {
//		_mvShare.setViewName("user/products/category");
//		_mvShare.addObject("allProductsByIdCategory",
//				categoryServiceImp.getDataProductByIdCategory(Integer.parseInt(id)));
//		int totalData = categoryServiceImp.getDataProductByIdCategory(Integer.parseInt(id)).size();
//		PaginateDto paginateDto = paginatesServiceImp.GetInfoPaginates(totalData, totalProductsInPage, Integer.parseInt(currentPage));
//
//		_mvShare.addObject("productsPaginate", categoryServiceImp.getDataProductsPaginate(Integer.parseInt(id),
//				paginateDto.getStart(), totalProductsInPage));
//		_mvShare.addObject("paginateInfo", paginateDto);
//		_mvShare.addObject("idCategory", id);
//		return _mvShare;
//	}  

	
	
}
