package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dto.OrderDetailDto;

@Service
public interface IOrderDetailDto {
	@Autowired
	public List<OrderDetailDto> getOrderDetailDtoService(long id);
}
