package DiamonShop.Service.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.BillsDao;
import DiamonShop.Dto.CartDto;
import DiamonShop.Entity.BillDetail;
import DiamonShop.Entity.Bills;
@Service
public class BillsServiceImplement implements IBillsService{
	@Autowired
	private BillsDao billsDao=new BillsDao();
	public int addBills(Bills bill) {
		
		return billsDao.addBills(bill);
	}

	public void addBillsDetail(HashMap<Long, CartDto> cart) {
		long idBill=billsDao.getIdLastBills();
		for(Map.Entry<Long, CartDto>itemCart:cart.entrySet()) {
			BillDetail billDetail=new BillDetail();
			billDetail.setId(idBill);
			billDetail.setId_product(itemCart.getValue().getProduct().getId_product());
			billDetail.setQuanty(itemCart.getValue().getQuanty());
			billDetail.setPrice(itemCart.getValue().getTotalPrice());
			billsDao.addBillsDetail(billDetail);
		}
		
		
	}

	public List<Bills> getBillsByIdUser(int id) {
		
		return billsDao.getBillsByIdUser(id);
	}
	
}
