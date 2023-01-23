package DiamonShop.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Service.User.BillsServiceImplement;
import DiamonShop.Service.User.OrderDetailService;

@Controller
@RequestMapping(value = "order")
public class BillsController extends BaseController{
	@Autowired
	BillsServiceImplement billsService =new BillsServiceImplement();
	@Autowired
	OrderDetailService orderService=new OrderDetailService();
	
	@RequestMapping(value ="/{id}")
	public ModelAndView orderDetail(@PathVariable int id) {
		_mvShare.addObject("categorys",_homeServiceImplement.GetDataCategorys());
		_mvShare.addObject("listOrder",billsService.getBillsByIdUser(id));
		_mvShare.setViewName("/user/bill/order");
		return _mvShare;
	}
	@RequestMapping(value = "/{id}/chi-tiet")
	public ModelAndView orderDetailDto(@PathVariable int id) {
		
		  _mvShare.addObject("categorys",_homeServiceImplement.GetDataCategorys());
		  _mvShare.addObject("listOrder",billsService.getBillsByIdUser(id));
		
		  _mvShare.addObject("orderDetail",orderService.getOrderDetailDtoService(Long.
		  parseLong(id+"")));
		 
		_mvShare.setViewName("/user/bill/orderDetail");
		return _mvShare;
	}

}
