package DiamonShop.Dao;

import org.springframework.stereotype.Repository;

import DiamonShop.Entity.Accounts;
import DiamonShop.Entity.MapperAccounts;

@Repository
public class AccountsDao extends BaseDao{
  public StringBuffer getSqlCreateAccount(Accounts acc) {
	  StringBuffer sqlBuffer=new StringBuffer();
	  sqlBuffer.append(" insert into accounts(user,password,display_name,address) value   ");
	  sqlBuffer.append("('"+acc.getUser()+"','"+acc.getPassword()+"','"+acc.getDisplayName()+"','"+acc.getAddress()+"')   ");
	  return sqlBuffer;
  }
  
  public StringBuffer getSqlCheckAccount(Accounts acc) {
	  StringBuffer sqlBuffer=new StringBuffer();
	  sqlBuffer.append("select *  ");
	  sqlBuffer.append("from accounts  ");
	  sqlBuffer.append("where user=    ");
	  sqlBuffer.append("'"+acc.getUser()+"'   ");
	
	
	  return sqlBuffer;
  }
  public int createAccount(Accounts acc) {
	  int account=_jdbcTemplate.update(getSqlCreateAccount(acc).toString());
	  return account;
  }
  public Accounts checkAccount(Accounts acc) {
	  try {
		Accounts account =_jdbcTemplate.queryForObject(getSqlCheckAccount(acc).toString(), new MapperAccounts() );
		System.out.println(account.toString());
		if (account!=null) {
			return account;
		}
	} catch (Exception e) {
		return null;
	}
	 return null;
	  
  }
}
