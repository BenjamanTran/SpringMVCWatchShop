package DiamonShop.UserController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Entity.Accounts;
import DiamonShop.Service.User.AccountServiceImplement;

@Controller
public class AccountController extends BaseController {
	@Autowired
	AccountServiceImplement accountService = new AccountServiceImplement();

	@RequestMapping(value = { "dang-ky" }, method = RequestMethod.GET)
	public ModelAndView register() {

		_mvShare.addObject("categorys", _homeServiceImplement.GetDataCategorys());

		_mvShare.addObject("account", new Accounts());
		_mvShare.setViewName("user/account/register");
		return _mvShare;
	}

	@RequestMapping(value = {
			"dang-ky" }, method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView createAccount(@ModelAttribute("user") Accounts account) {

		int count = accountService.createAccount(account);
		if (count > 0) {
			_mvShare.addObject("status", "Đăng ký thành công !!!");
		} else {
			_mvShare.addObject("status", "Đăng ký thất bại !!!");
		}
		_mvShare.addObject("categorys", _homeServiceImplement.GetDataCategorys());

		_mvShare.setViewName("user/account/register");
		return _mvShare;
	}

	@RequestMapping(value = { "dang-nhap" }, method = RequestMethod.GET)
	public ModelAndView login() {
		_mvShare.addObject("account", new Accounts());
		_mvShare.setViewName("user/account/login");
		return _mvShare;
	}

	@RequestMapping(value = { "dang-nhap" }, method = RequestMethod.POST)
	public ModelAndView submitLogin(@ModelAttribute("user") Accounts acc, HttpSession session) {
		acc = accountService.checkAccount(acc);
		if (acc != null) {
			_mvShare.setViewName("redirect:trang-chu");
			session.setAttribute("LoginInfo", acc);
		} else {
			_mvShare.addObject("status", "Đăng nhập thất bại !!!");
		}

		return _mvShare;
	}

	@RequestMapping(value = "dang-xuat", method = RequestMethod.GET)
	public ModelAndView logout(HttpSession session, HttpServletRequest request) {
		session.removeAttribute("LoginInfo");
		session.removeAttribute("listOrder");
		_mvShare.setViewName("redirect:trang-chu");
		return _mvShare;

	}
}
