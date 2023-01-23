package DiamonShop.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Entity.Feedbacks;
import DiamonShop.Service.User.ProductServiceImplement;

@Controller

public class HomeController extends BaseController{
	@Autowired
	ProductServiceImplement productService=new ProductServiceImplement();
	
	@RequestMapping(value = {"/","trang-chu"}/*method = RequestMethod.GET*/)
	public ModelAndView Index() {
		
		_mvShare.addObject("slides",_homeServiceImplement.GetDataSlide());
		_mvShare.addObject("categorys",_homeServiceImplement.GetDataCategorys());
		_mvShare.addObject("hightlight_products",_homeServiceImplement.GetData_Highlight_Products());
		_mvShare.addObject("new_products",_homeServiceImplement.GetData_New_Products());
		
		_mvShare.setViewName("user/index");
		return _mvShare;
	}
	@RequestMapping(value = {"/xem-them/{viewMore}"})
	public ModelAndView viewMore(@PathVariable(value = "viewMore") String nameView) {
		_mvShare.addObject("categorys",_homeServiceImplement.GetDataCategorys());
		_mvShare.addObject("styleProduct",nameView);
		if (nameView.equalsIgnoreCase("hightlightProducts")) {
			_mvShare.addObject("search_list_products",productService.viewMoreByStyle(true, false, 1, 6));
			_mvShare.addObject("quantyOfPages",_homeServiceImplement.getQuantityPageInViewMore(true, false, false, 6));

		}
		else if (nameView.equalsIgnoreCase("newProducts")) {
			_mvShare.addObject("search_list_products",productService.viewMoreByStyle(false, true, 1, 6));
			_mvShare.addObject("quantyOfPages",_homeServiceImplement.getQuantityPageInViewMore(false, true, false, 6));

		}
		_mvShare.setViewName("user/products/search-list-products");
		return _mvShare;
	}
	@RequestMapping(value = {"/xem-them/{viewMore}/{Page}"})
	public ModelAndView viewMoreInPage(@PathVariable(value = "viewMore") String nameView ,@PathVariable(value="Page") String Page) {
		_mvShare.addObject("categorys",_homeServiceImplement.GetDataCategorys());
		_mvShare.addObject("currentPage",Integer.parseInt(Page));
		_mvShare.addObject("styleProduct",nameView);
		if (nameView.equalsIgnoreCase("hightlightProducts")) {
			_mvShare.addObject("search_list_products",productService.viewMoreByStyle(true, false, Integer.parseInt(Page), 6));
			_mvShare.addObject("quantyOfPages",_homeServiceImplement.getQuantityPageInViewMore(true, false, false, 6));
		}
		else if (nameView.equalsIgnoreCase("newProducts")) {
			_mvShare.addObject("search_list_products",productService.viewMoreByStyle(false, true, Integer.parseInt(Page), 6));
			_mvShare.addObject("quantyOfPages",_homeServiceImplement.getQuantityPageInViewMore(false, true, false, 6));

		}
		_mvShare.setViewName("user/products/search-list-products");
		return _mvShare;
	}
	@RequestMapping(value = "/lien-he")
	public ModelAndView contactUs() {
		_mvShare.addObject("newFeedback",new Feedbacks());
		_mvShare.addObject("categorys", _homeServiceImplement.GetDataCategorys());
		_mvShare.setViewName("user/contact/contact-us");
		return _mvShare;
	}
	
	/*
	 * @RequestMapping(value = {"/product"}) public ModelAndView Products() {
	 * ModelAndView modelAndView=new ModelAndView("user/products/product"); return
	 * modelAndView; }
	 */
}
