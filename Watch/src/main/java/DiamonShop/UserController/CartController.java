package DiamonShop.UserController;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Dto.CartDto;
import DiamonShop.Entity.Accounts;
import DiamonShop.Entity.Bills;
import DiamonShop.Service.User.BillsServiceImplement;
import DiamonShop.Service.User.CartServiceImplement;

@Controller
public class CartController extends BaseController {
	@Autowired
	private CartServiceImplement cartService = new CartServiceImplement();
	@Autowired
	private BillsServiceImplement billService=new BillsServiceImplement();

	@RequestMapping(value = "ListCart")
	public ModelAndView Index() {

		_mvShare.addObject("categorys", _homeServiceImplement.GetDataCategorys());

		_mvShare.setViewName("user/cart/list_cart");
		return _mvShare;
	}

	@RequestMapping(value = "AddCart/{id}")
	public String addCart(HttpServletRequest request, HttpSession session, @PathVariable long id) {
		HashMap<Long, CartDto> cartHashMap = (HashMap<Long, CartDto>) session.getAttribute("Cart");
		if (cartHashMap == null) {
			cartHashMap = new HashMap<Long, CartDto>();
		}
		cartHashMap = cartService.addCart(id, cartHashMap);
		session.setAttribute("Cart", cartHashMap);
		session.setAttribute("TotalQuantyCart", cartService.totalQuanty(cartHashMap));
		session.setAttribute("TotalPriceCart", cartService.totalPrice(cartHashMap));
//		return "redirect:/chi-tiet-san-pham/"+id;
		return "redirect:" + request.getHeader("Referer");
	}

	@RequestMapping(value = "EditCart/{id}/{quanty}")
	public String editCart(HttpServletRequest request, HttpSession session, @PathVariable long id,
			@PathVariable int quanty) {
		HashMap<Long, CartDto> cartHashMap = (HashMap<Long, CartDto>) session.getAttribute("Cart");
		if (cartHashMap == null) {
			cartHashMap = new HashMap<Long, CartDto>();
		}
		cartHashMap = cartService.editCart(id, cartHashMap, quanty);
		session.setAttribute("Cart", cartHashMap);
		session.setAttribute("TotalQuantyCart", cartService.totalQuanty(cartHashMap));
		session.setAttribute("TotalPriceCart", cartService.totalPrice(cartHashMap));
//		return "redirect:/chi-tiet-san-pham/"+id;
		return "redirect:" + request.getHeader("Referer");
	}

	@RequestMapping(value = "DeleteCart/{id}")
	public String deleteCart(HttpServletRequest request, HttpSession session, @PathVariable long id) {
		HashMap<Long, CartDto> cartHashMap = (HashMap<Long, CartDto>) session.getAttribute("Cart");
		if (cartHashMap == null) {
			cartHashMap = new HashMap<Long, CartDto>();
		}
		cartHashMap = cartService.deleteCart(id, cartHashMap);
		session.setAttribute("Cart", cartHashMap);
		session.setAttribute("TotalQuantyCart", cartService.totalQuanty(cartHashMap));
		session.setAttribute("TotalPriceCart", cartService.totalPrice(cartHashMap));
		return "redirect:" + request.getHeader("Referer");
	}

	@RequestMapping(value = "thanh-toan", method = RequestMethod.GET)
	public ModelAndView checkOut(HttpServletRequest request, HttpSession session) {
		_mvShare.setViewName("user/bill/checkout");
		Bills bill = new Bills();
		Accounts acc = (Accounts) session.getAttribute("LoginInfo");
		if (acc != null) {
			bill.setEmail(acc.getUser());
			bill.setAddress(acc.getAddress());
			bill.setFullName(acc.getDisplayName());
			
			System.out.println(bill.toString());
		}
		_mvShare.addObject("bills", bill);
		return _mvShare;
	}

	@RequestMapping(value = "thanh-toan",method = RequestMethod.POST)
	public String doneCheckOut(HttpServletRequest request, HttpSession session,
			@ModelAttribute("bills") Bills bill) {
		Accounts acc = (Accounts) session.getAttribute("LoginInfo");
		
		HashMap<Long, CartDto> cartsHashMap=(HashMap<Long, CartDto>)session.getAttribute("Cart");
		java.sql.Date date = new java.sql.Date(System.currentTimeMillis());//lay ngay hien tai trong sql
		bill.setCheckoutDate(date);
		bill.setId_user(acc.getId());
		bill.setTotal(cartService.totalPrice(cartsHashMap));
		System.out.println(bill.toString());
		if (billService.addBills(bill)>0) {
			
			billService.addBillsDetail(cartsHashMap);
		}
		session.removeAttribute("Cart");
		session.removeAttribute("TotalQuantyCart");
		session.removeAttribute("TotalPriceCart");
		return "redirect:trang-chu";
	}
}
