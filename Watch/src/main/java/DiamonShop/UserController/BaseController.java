package DiamonShop.UserController;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Service.User.HomeServiceImplement;
@Controller
public class BaseController {
	@Autowired
	HomeServiceImplement _homeServiceImplement;
	public ModelAndView _mvShare =new ModelAndView();
	
	@PostConstruct
	public ModelAndView Init() {
		_mvShare.addObject("menus",_homeServiceImplement.GetDataMenus());
		return _mvShare;
	}
}
