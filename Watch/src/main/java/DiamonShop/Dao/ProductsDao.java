package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamonShop.Dto.ProductsDto;
import DiamonShop.Dto.ProductsDtoMapper;

@Repository
public class ProductsDao extends BaseDao {
	private String SqlString(Boolean highlight_products, Boolean new_products, Boolean all_products) {
		StringBuffer sql = new StringBuffer();
		sql.append("select ");
		sql.append("p.id as id_product ");
		sql.append(",p.id_category ");
		sql.append(",p.size ");
		sql.append(",p.name ");
		sql.append(",p.price ");
		sql.append(",p.sale ");
		sql.append(",p.title ");
		sql.append(",p.highlight ");
		sql.append(",p.new_product ");
		sql.append(",p.detail ");
		sql.append(",c.name as name_color ");
		sql.append(",c.code as code_color ");
		sql.append(",c.img ");
		sql.append(",p.create_at ");
		sql.append(",p.update_at ");
		sql.append("from products as p ");
		sql.append("inner join ");
		sql.append("colors as c ");
		sql.append("on p.id=c.id_product ");
		if (highlight_products == true && new_products == true && all_products == false) {
			sql.append("where p.highlight=1 and p.new_product=1 ");
		} else if (highlight_products == true && new_products == false && all_products == false) {
			sql.append("where p.highlight=1 and p.new_product=0 ");
		} else if (highlight_products == false && new_products == true && all_products == false) {
			sql.append("where p.highlight=0 and p.new_product=1 ");
		}
		sql.append("group by c.id_product ");
		if (all_products == false) {
			sql.append("order by rand() ");
			sql.append("limit 12 ");
		}

		return sql.toString();
	}

	private String getSqlProductOfPageInType(Boolean highlight_products, Boolean new_products, int page,
			int number_of_products) {
		StringBuffer sql = new StringBuffer();

		sql.append("select ");
		sql.append("p.id as id_product ");
		sql.append(",p.id_category ");
		sql.append(",p.size ");
		sql.append(",p.name ");
		sql.append(",p.price ");
		sql.append(",p.sale ");
		sql.append(",p.title ");
		sql.append(",p.highlight ");
		sql.append(",p.new_product ");
		sql.append(",p.detail ");
		sql.append(",c.name as name_color ");
		sql.append(",c.code as code_color ");
		sql.append(",c.img ");
		sql.append(",p.create_at ");
		sql.append(",p.update_at ");
		sql.append("from products as p ");
		sql.append("inner join ");
		sql.append("colors as c ");
		sql.append("on p.id=c.id_product ");
		if (highlight_products == true && new_products == true) {
			sql.append("where p.highlight=1 and p.new_product=1 ");
		} else if (highlight_products == true && new_products == false) {
			sql.append("where p.highlight=1 and p.new_product=0 ");
		} else if (highlight_products == false && new_products == true) {
			sql.append("where p.highlight=0 and p.new_product=1 ");
		}
		sql.append("group by c.id_product ");
		sql.append("limit " + (page - 1) * number_of_products + "," + number_of_products + ";   ");
		return sql.toString();
	}

	private String getProductsOfPageInCategory(int id_category, int page, int number_of_products) {
		StringBuffer sql = new StringBuffer();
		sql.append("select ");
		sql.append("p.id as id_product ");
		sql.append(",p.id_category ");
		sql.append(",p.size ");
		sql.append(",p.name ");
		sql.append(",p.price ");
		sql.append(",p.sale ");
		sql.append(",p.title ");
		sql.append(",p.highlight ");
		sql.append(",p.new_product ");
		sql.append(",p.detail ");
		sql.append(",c.name as name_color ");
		sql.append(",c.code as code_color ");
		sql.append(",c.img ");
		sql.append(",p.create_at ");
		sql.append(",p.update_at ");
		sql.append("from products as p ");
		sql.append("inner join ");
		sql.append("colors as c ");
		sql.append("on p.id=c.id_product ");
		sql.append("where p.id_category=" + id_category + " ");
		sql.append("group by  c.id_product 	");
		sql.append("limit " + (page - 1) * number_of_products + "," + number_of_products + ";   ");
		return sql.toString();
	}

	private String getStringSqlProductsByIdCategory(int id) {
		StringBuffer sql = new StringBuffer();
		sql.append("select ");
		sql.append("p.id as id_product ");
		sql.append(",p.id_category ");
		sql.append(",p.size ");
		sql.append(",p.name ");
		sql.append(",p.price ");
		sql.append(",p.sale ");
		sql.append(",p.title ");
		sql.append(",p.highlight ");
		sql.append(",p.new_product ");
		sql.append(",p.detail ");
		sql.append(",c.name as name_color ");
		sql.append(",c.code as code_color ");
		sql.append(",c.img ");
		sql.append(",p.create_at ");
		sql.append(",p.update_at ");
		sql.append("from products as p ");
		sql.append("inner join ");
		sql.append("colors as c ");
		sql.append("on p.id=c.id_product ");
		sql.append("where p.id_category=" + id + " ");
		sql.append("group by  c.id_product 	");

		return sql.toString();
	}

	private String getProductsById(long id) {
		StringBuffer sql = new StringBuffer();
		sql.append("select ");
		sql.append("p.id as id_product ");
		sql.append(",p.id_category ");
		sql.append(",p.size ");
		sql.append(",p.name ");
		sql.append(",p.price ");
		sql.append(",p.sale ");
		sql.append(",p.title ");
		sql.append(",p.highlight ");
		sql.append(",p.new_product ");
		sql.append(",p.detail ");
		sql.append(",c.name as name_color ");
		sql.append(",c.code as code_color ");
		sql.append(",c.img ");
		sql.append(",p.create_at ");
		sql.append(",p.update_at ");
		sql.append("from products as p ");
		sql.append("inner join ");
		sql.append("colors as c ");
		sql.append("on p.id=c.id_product ");
		sql.append("where p.id=" + id + " ");
		sql.append("limit 1  ");
		return sql.toString();
	}

	public String getSqlProductPaginate(int id, int start, int totalPage) {
		StringBuffer sql = new StringBuffer();
		sql.append("select ");
		sql.append("p.id as id_product ");
		sql.append(",p.id_category ");
		sql.append(",p.size ");
		sql.append(",p.name ");
		sql.append(",p.price ");
		sql.append(",p.sale ");
		sql.append(",p.title ");
		sql.append(",p.highlight ");
		sql.append(",p.new_product ");
		sql.append(",p.detail ");
		sql.append(",c.name as name_color ");
		sql.append(",c.code as code_color ");
		sql.append(",c.img ");
		sql.append(",p.create_at ");
		sql.append(",p.update_at ");
		sql.append("from products as p ");
		sql.append("inner join ");
		sql.append("colors as c ");
		sql.append("on p.id=c.id_product ");
		sql.append("where p.id_category=" + id + " ");
		sql.append("limit " + start + ", " + totalPage + " ");
		return sql.toString();
	}

	public String getSqlSearchProductsByName(String name) {
		StringBuffer sql = new StringBuffer();
		sql.append("select ");
		sql.append("p.id as id_product ");
		sql.append(",p.id_category ");
		sql.append(",p.size ");
		sql.append(",p.name ");
		sql.append(",p.price ");
		sql.append(",p.sale ");
		sql.append(",p.title ");
		sql.append(",p.highlight ");
		sql.append(",p.new_product ");
		sql.append(",p.detail ");
		sql.append(",c.name as name_color ");
		sql.append(",c.code as code_color ");
		sql.append(",c.img ");
		sql.append(",p.create_at ");
		sql.append(",p.update_at ");
		sql.append("from products as p ");
		sql.append("inner join ");
		sql.append("colors as c ");
		sql.append("on p.id=c.id_product ");
		sql.append("where p.name like " + "'" + "%" + name + "%" + "'   ");
		sql.append("group by  p.id,c.id_product ");

		return sql.toString();
	}

	private String getStringSqlQuantityOfPage(int id_category, int numberOfProducts) {
		StringBuffer sql = new StringBuffer();
		sql.append("select ceiling(count(kq)/" + numberOfProducts + "   ");
		sql.append(")  as quantityOfPage  ");
		sql.append("from (select count(id_product) as kq   ");
		sql.append("from colors c inner join products p on c.id_product=p.id     ");
		sql.append("where p.id_category=" + id_category + "   ");
		sql.append("group by id_product) as a   ");
		return sql.toString();
	}

	private String getSqlQuantityOfPageViewMore(Boolean highlight_products, Boolean new_products, Boolean all_products,
			int numberOfProducts) {
		StringBuffer sql = new StringBuffer();
		sql.append("select ceiling(count(kq)/" + numberOfProducts + "   ");
		sql.append(")  as quantityOfPage  ");
		sql.append("from (select count(id_product) as kq   ");
		sql.append("from colors c inner join products p on c.id_product=p.id     ");
		if (highlight_products == true && new_products == true) {
			sql.append("where p.highlight=1 and p.new_product=1 ");
		} else if (highlight_products == true && new_products == false) {
			sql.append("where p.highlight=1 and p.new_product=0 ");
		} else if (highlight_products == false && new_products == true) {
			sql.append("where p.highlight=0 and p.new_product=1 ");
		}
		sql.append("group by id_product) as a   ");
		return sql.toString();
	}

	public List<ProductsDto> getDataProducts() {
		// TODO Auto-generated method stub
		String sql = SqlString(false, false, true);
		List<ProductsDto> list = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return list;
	}

	public List<ProductsDto> getDataHighlightProducts() {
		// TODO Auto-generated method stub
		String sql = SqlString(true, false, false);
		List<ProductsDto> list = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return list;
	}

	public List<ProductsDto> getDataNewProducts() {
		// TODO Auto-generated method stub
		String sql = SqlString(false, true, false);
		List<ProductsDto> list = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return list;
	}

	public List<ProductsDto> getDataProductByIdCategory(int id) {
		String sql = getStringSqlProductsByIdCategory(id);
		List<ProductsDto> list = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return list;
	}

	public List<ProductsDto> getDataProductPaginate(int id, int start, int totalPage) {
		String sqlGetDataByIdCategory = getStringSqlProductsByIdCategory(id);

		List<ProductsDto> list = _jdbcTemplate.query(sqlGetDataByIdCategory, new ProductsDtoMapper());
		List<ProductsDto> list2 = new ArrayList<ProductsDto>();
		if (list.size() > 0) {
			String sql = getSqlProductPaginate(id, start, totalPage);
			list2 = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		}
		return list2;
	}

	public List<ProductsDto> getProductById(long id) {

		List<ProductsDto> list = _jdbcTemplate.query(getProductsById(id), new ProductsDtoMapper());
		return list;
	}

	public ProductsDto findProductById(long id) {

		ProductsDto productsDto = _jdbcTemplate.queryForObject(getProductsById(id), new ProductsDtoMapper());
		return productsDto;
	}

	public List<ProductsDto> searchProductsByName(String name) {
		List<ProductsDto> list = _jdbcTemplate.query(getSqlSearchProductsByName(name), new ProductsDtoMapper());
		return list;
	}

	public List<ProductsDto> getProductsWithPageDao(int id_category, int page, int number_of_products) {
		List<ProductsDto> list = _jdbcTemplate.query(getProductsOfPageInCategory(id_category, page, number_of_products),
				new ProductsDtoMapper());
		return list;
	}

	public int getQuantityPageInCategoryDAO(int id_category, int numberOfProducts) {
		int result = _jdbcTemplate.queryForObject(getStringSqlQuantityOfPage(id_category, numberOfProducts),
				new Object[] {}, Integer.class);
		return result;
	}

	public int getQuantityPageInViewMoreDao(Boolean highlight_products, Boolean new_products, Boolean all_products,
			int numberOfProducts) {
		int result = _jdbcTemplate.queryForObject(
				getSqlQuantityOfPageViewMore(highlight_products, new_products, all_products, numberOfProducts),
				new Object[] {}, Integer.class);
		return result;
	}

	public List<ProductsDto> getProductOfPageInTypeDao(Boolean highlight_products, Boolean new_products, int page,
			int number_of_products) {
		List<ProductsDto> list = new ArrayList<ProductsDto>();
		list = _jdbcTemplate.query(
				getSqlProductOfPageInType(highlight_products, new_products, page, number_of_products),
				new ProductsDtoMapper());
		return list;
	}

}
