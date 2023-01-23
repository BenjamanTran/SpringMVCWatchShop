package DiamonShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperFeedbacks implements RowMapper<Feedbacks>{

	public Feedbacks mapRow(ResultSet rs, int rowNum) throws SQLException {
		Feedbacks feedbacks=new Feedbacks();
		feedbacks.setName(rs.getString("name"));
		feedbacks.setEmail(rs.getString("email"));
		feedbacks.setTitle(rs.getString("title"));
		feedbacks.setText(rs.getString("text"));

		return feedbacks;
	}
	
}
