package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamonShop.Entity.MapperMenus;
import DiamonShop.Entity.Menus;
@Repository
public class MenusDao extends BaseDao{
	
	public List<Menus> getDataMenus() {
		List<Menus> list=new ArrayList<Menus>();
		String sqlString="select * from menus";
		list=_jdbcTemplate.query(sqlString, new MapperMenus());
		
		return list;
	}

}
