package DiamonShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperSlides implements RowMapper<Slides>{

	public Slides mapRow(ResultSet rs, int rowNum) throws SQLException {
		Slides slides=new Slides();
		slides.setId(rs.getInt("id"));
		slides.setImgString(rs.getString("img"));
		slides.setCaptionString(rs.getString("caption"));
		slides.setContentString(rs.getString("content"));
		return slides;
	}
	
}
