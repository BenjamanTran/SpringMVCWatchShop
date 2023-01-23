package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamonShop.Entity.BillDetail;
import DiamonShop.Entity.Bills;
import DiamonShop.Entity.MapperBills;
@Repository
public class BillsDao extends BaseDao {
	public String getSqlBillsByIdUser(int id) {
		StringBuffer sql =new StringBuffer();
		sql.append("SELECT * ");
		sql.append("from bills  ");
		sql.append("where id_user="+id+"   ;");
		return sql.toString();
	}
	public int addBills(Bills bill) {
		// TODO Auto-generated method stub

		StringBuffer sqlBuffer = new StringBuffer();
		sqlBuffer.append("insert into bills(id_user,email,fullName,address,total,phone,note,checkoutDate) values   ");
		sqlBuffer.append("('" + bill.getId_user() + "','" +bill.getEmail()+"','"+ bill.getFullName() + "','" + bill.getAddress() + "','"
				+ bill.getTotal() + "','" + bill.getPhone() + "','" + bill.getNote() + "','" + bill.getCheckoutDate()
				+ "');     ");

		int insert = _jdbcTemplate.update(sqlBuffer.toString());
		return insert;
	}

	public long getIdLastBills() {
		StringBuffer sqlBuffer = new StringBuffer();
		sqlBuffer.append("select max(id) from bills   ");
		long id = _jdbcTemplate.queryForObject(sqlBuffer.toString(), new Object[] {}, Long.class);
		return id;
	}

	public int addBillsDetail(BillDetail billDetail) {
		StringBuffer sqlBuffer = new StringBuffer();
		sqlBuffer.append("insert into bill_detail(id_bill,id_product,quanty,price) values   ");
		sqlBuffer.append("('" + billDetail.getId() + "','" + billDetail.getId_product() + "','" + billDetail.getQuanty()
				+ "','" + billDetail.getPrice()+"');     ");
		int insert=_jdbcTemplate.update(sqlBuffer.toString());

		return insert;
	}
	public List<Bills> getBillsByIdUser(int id){
		List<Bills> list=new ArrayList<Bills>();
		list=_jdbcTemplate.query(getSqlBillsByIdUser(id), new MapperBills());
		return list;
	}

}
