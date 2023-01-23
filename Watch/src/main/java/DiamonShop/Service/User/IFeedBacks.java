package DiamonShop.Service.User;

import org.springframework.stereotype.Service;

import DiamonShop.Entity.Feedbacks;
@Service
public interface IFeedBacks {
	public int insertFeedbacksToData(Feedbacks feedbacks);
}
