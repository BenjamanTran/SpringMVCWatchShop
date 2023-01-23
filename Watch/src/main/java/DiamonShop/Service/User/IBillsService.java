package DiamonShop.Service.User;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import DiamonShop.Dto.CartDto;
import DiamonShop.Entity.Bills;
@Service
public interface IBillsService {
	public int addBills(Bills bill);
	public void addBillsDetail(HashMap<Long, CartDto> cart);
	public List<Bills> getBillsByIdUser(int id);
}
