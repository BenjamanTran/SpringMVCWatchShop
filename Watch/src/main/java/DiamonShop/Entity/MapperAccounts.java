package DiamonShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperAccounts implements RowMapper<Accounts>{

	public Accounts mapRow(ResultSet rs, int rowNum) throws SQLException {
		Accounts accounts= new Accounts();
		accounts.setId(rs.getInt("id"));
		accounts.setUser(rs.getString("user"));
		accounts.setPassword(rs.getString("password"));
		accounts.setDisplayName(rs.getString("display_name"));
		accounts.setAddress(rs.getString("address"));
		accounts.setIsAdmin(rs.getBoolean("isAdmin"));

		return accounts;
	}
	
}
