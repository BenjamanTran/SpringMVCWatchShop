package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamonShop.Dto.OrderDetailDto;
import DiamonShop.Dto.OrderDetailDtoMapper;

@Repository
public class OrderDetailDtoDao extends BaseDao{
	public String getSqlSringOrderDetail(long id) {
		StringBuffer sql=new StringBuffer();
		sql.append("select \r\n" + 
				"bd.id_bill as id,\r\n" + 
				"p.name as name,\r\n" + 
				"bd.price as price,\r\n" + 
				"bd.quanty as quantity,\r\n" + 
				"c.img as img\r\n" + 
				"from bill_detail bd inner join products p\r\n" + 
				"on bd.id_product=p.id\r\n" + 
				"inner join colors c on bd.id_product=c.id_product   ");
		sql.append("where bd.id_bill="+id+"   ");
		sql.append("group by c.id_product  ");
		return sql.toString();
	}
	public List<OrderDetailDto> getOrderDetailDtoDao(long id){
		List<OrderDetailDto> list=new ArrayList<OrderDetailDto>();
		list=_jdbcTemplate.query(getSqlSringOrderDetail(id),new OrderDetailDtoMapper());
		return list;
	}
	
}
