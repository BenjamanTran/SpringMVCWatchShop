package DiamonShop.Dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DiamonShop.Dto.CartDto;
import DiamonShop.Dto.ProductsDto;
@Repository
public class CartDao extends BaseDao {
	@Autowired
	ProductsDao productsDao = new ProductsDao();

	public HashMap<Long, CartDto> addCart(long id, HashMap<Long, CartDto> cart) {
		CartDto itemCartDto = new CartDto();
		ProductsDto productsDto = productsDao.findProductById(id);
		if (productsDto != null && cart.containsKey(id)) {
			itemCartDto=cart.get(id);
			itemCartDto.setQuanty(itemCartDto.getQuanty()+1);
			itemCartDto.setTotalPrice(itemCartDto.getQuanty()*itemCartDto.getProduct().getPrice());
			
		}
		else {
			itemCartDto.setProduct(productsDto);
			itemCartDto.setQuanty(1);
			itemCartDto.setTotalPrice(productsDto.getPrice());
			
		}
		cart.put(id, itemCartDto);
		return cart;
	}

	public HashMap<Long, CartDto> editCart(long id, HashMap<Long, CartDto> cart, int quanty) {
		if (cart==null) {
			return cart;
		}
		CartDto itemCartDto = new CartDto();
		if (cart.containsKey(id)) {// kiem tra co san pham hay khong
			itemCartDto = cart.get(id);
			itemCartDto.setQuanty(quanty);
			itemCartDto.setTotalPrice(quanty * itemCartDto.getProduct().getPrice());
		}

		cart.put(id, itemCartDto);
		return cart;
	}

	public HashMap<Long, CartDto> deleteCart(long id, HashMap<Long, CartDto> cart) {
		if (cart==null) {
			return cart;
		}
		if (cart.containsKey(id)) {
			cart.remove(id);
		}

		return cart;
	}
	public int totalQuanty(HashMap<Long, CartDto> cart) {
		int total=0;
		for(Map.Entry<Long, CartDto> itemCart:cart.entrySet()) {
			total+=itemCart.getValue().getQuanty();
		}
		return total;
	}
	public double totalPrice(HashMap<Long, CartDto> cart) {
		double totalPrice=0;
		for(Map.Entry<Long, CartDto> itemCart:cart.entrySet()) {
			totalPrice+=itemCart.getValue().getTotalPrice();
		}
		return totalPrice;
		
	}
}
