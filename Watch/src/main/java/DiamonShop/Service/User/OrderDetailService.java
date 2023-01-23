package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.OrderDetailDtoDao;
import DiamonShop.Dto.OrderDetailDto;

@Service
public class OrderDetailService implements IOrderDetailDto {

	@Autowired
	OrderDetailDtoDao detailDtoDao = new OrderDetailDtoDao();

	public List<OrderDetailDto> getOrderDetailDtoService(long id) {
		// TODO Auto-generated method stub
		return detailDtoDao.getOrderDetailDtoDao(id);
	}

}
