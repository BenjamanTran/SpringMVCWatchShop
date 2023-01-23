package DiamonShop.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.FeedbacksDao;
import DiamonShop.Entity.Feedbacks;
@Service
public class FeedbacksService implements IFeedBacks{
	@Autowired
	FeedbacksDao feedbacksDao=new FeedbacksDao();
	public int insertFeedbacksToData(Feedbacks feedbacks) {
		// TODO Auto-generated method stub
		return feedbacksDao.addFeedBacksToData(feedbacks);
	}

}
