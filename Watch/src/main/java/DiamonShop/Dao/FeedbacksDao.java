package DiamonShop.Dao;

import org.springframework.stereotype.Repository;

import DiamonShop.Entity.Feedbacks;
@Repository
public class FeedbacksDao extends BaseDao {
	public String getSqlInsertFeedbacks(Feedbacks feedbacks) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into feedbacks\r\n" + "values('" + feedbacks.getName() + "','" + feedbacks.getEmail() + "','"
				+ feedbacks.getTitle() + "','" + feedbacks.getText() + "')   ");
		return sql.toString();
	}

	public int addFeedBacksToData(Feedbacks feedbacks) {
		int resuilt=_jdbcTemplate.update(getSqlInsertFeedbacks(feedbacks));
		return resuilt;
	}
}
