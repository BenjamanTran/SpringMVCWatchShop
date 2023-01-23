package DiamonShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperBills implements RowMapper<Bills>{

	public Bills mapRow(ResultSet rs, int rowNum) throws SQLException {
		Bills bill=new Bills();
		bill.setId(rs.getLong("id"));
		bill.setId_user(rs.getInt("id_user"));
		bill.setEmail(rs.getString("email"));
		bill.setFullName(rs.getString("fullname"));
		bill.setAddress(rs.getString("address"));
		bill.setTotal(rs.getDouble("total"));
		bill.setPhone(rs.getString("phone"));
		bill.setNote(rs.getString("note"));
		bill.setCheckoutDate(rs.getDate("checkoutdate"));

		return bill;
	}

}
