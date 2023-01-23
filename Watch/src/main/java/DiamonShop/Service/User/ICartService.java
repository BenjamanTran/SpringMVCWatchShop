package DiamonShop.Service.User;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dto.CartDto;

@Service
public interface ICartService {
	@Autowired
	public HashMap<Long, CartDto> addCart(long id, HashMap<Long, CartDto> cart);

	public HashMap<Long, CartDto> editCart(long id, HashMap<Long, CartDto> cart, int quanty);

	public HashMap<Long, CartDto> deleteCart(long id, HashMap<Long, CartDto> cart);

	public int totalQuanty(HashMap<Long, CartDto> cart);

	public double totalPrice(HashMap<Long, CartDto> cart);

}
