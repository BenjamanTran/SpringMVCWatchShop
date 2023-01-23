package DiamonShop.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OrderDetailDtoMapper implements RowMapper<OrderDetailDto>{

	public OrderDetailDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		OrderDetailDto orderDetailDto=new OrderDetailDto();
		orderDetailDto.setId(rs.getLong("id"));
		orderDetailDto.setName(rs.getString("name"));
		orderDetailDto.setPrice(rs.getDouble("price"));
		orderDetailDto.setQuantity(rs.getInt("quantity"));
		orderDetailDto.setImg(rs.getString("img"));

		return orderDetailDto;
	}
	
}
