package DiamonShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperMenus implements RowMapper<Menus>{

	public Menus mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Menus menus=new Menus();
		menus.setId(rs.getInt(1));
		menus.setName(rs.getString(2));
		menus.setUrl(rs.getString(3));
		return menus;
	}

}
