package DiamonShop.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Entity.Feedbacks;
import DiamonShop.Service.User.FeedbacksService;
@Controller
public class FeedbacksController extends BaseController{
	@Autowired
	FeedbacksService feedbackService=new FeedbacksService();
	
	@RequestMapping(value = "add-feedBack",method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView addFeedbacks(@ModelAttribute("newFeedback")Feedbacks feedback ) {
		int count=feedbackService.insertFeedbacksToData(feedback);
		_mvShare.addObject("categorys", _homeServiceImplement.GetDataCategorys());
		if (count>0) {
			_mvShare.addObject("alert","Gửi thông tin thành công");
			_mvShare.setViewName("redirect:lien-he");
			
			
		}
		else {
			_mvShare.addObject("alert","Gửi thông tin thất bại");
			_mvShare.setViewName("redirect:lien-he");
			
		}
		return _mvShare;
		
	}
	
}
