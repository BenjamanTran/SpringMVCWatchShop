package DiamonShop.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductsDtoMapper implements RowMapper<ProductsDto>{

	public ProductsDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductsDto productsDto=new ProductsDto();
		productsDto.setId_product(rs.getLong("id_product"));
		productsDto.setId_category(rs.getInt("id_category"));
		productsDto.setSize(rs.getString("size"));
		productsDto.setName(rs.getString("name"));
		productsDto.setPrice(rs.getDouble("price"));
		productsDto.setSale(rs.getInt("sale"));
		productsDto.setTitle(rs.getString("title"));
		productsDto.setHighlight(rs.getBoolean("highlight"));
		productsDto.setNew_product(rs.getBoolean("new_product"));
		productsDto.setDetail(rs.getString("detail"));
		productsDto.setName_color(rs.getString("name_color"));
		productsDto.setCode_color(rs.getString("code_color"));
		productsDto.setImg(rs.getString("img"));
		productsDto.setCreate_at(rs.getDate("create_at"));
		productsDto.setUpdate_at(rs.getDate("update_at"));

		return productsDto;
	}

}
