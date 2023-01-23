package DiamonShop.Service.User;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.AccountsDao;
import DiamonShop.Entity.Accounts;
@Service
public class AccountServiceImplement  implements IAccountService{
	@Autowired
	AccountsDao accountsDao;
	public int createAccount(Accounts account) {
		account.setPassword(BCrypt.hashpw(account.getPassword(), BCrypt.gensalt(12)));
		return accountsDao.createAccount(account);
	}

	public Accounts checkAccount(Accounts acc) {
		String pass =acc.getPassword();
		acc=accountsDao.checkAccount(acc);
		if (acc!=null) {
			if(BCrypt.checkpw(pass, acc.getPassword())) {
				System.out.println(acc.toString());
				return acc;
			}
			else {
				return null;
			}
		}
		return null;
	}

}
