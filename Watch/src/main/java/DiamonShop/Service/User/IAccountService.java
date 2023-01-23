package DiamonShop.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Entity.Accounts;
@Service
public interface IAccountService {
	@Autowired
	public int createAccount(Accounts account);
	public Accounts checkAccount(Accounts acc);
}
