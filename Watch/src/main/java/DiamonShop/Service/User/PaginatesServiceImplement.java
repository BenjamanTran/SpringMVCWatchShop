package DiamonShop.Service.User;

import org.springframework.stereotype.Service;

import DiamonShop.Dto.PaginateDto;

@Service
public class PaginatesServiceImplement implements IPaginatesService {

	public PaginateDto GetInfoPaginates(int totalData, int limit, int currentPage) {
		PaginateDto paginateDto = new PaginateDto();

		paginateDto.setLimit(limit);
		int total = setInfoTotalPage(totalData, limit);
		paginateDto.setTotalPage(total);
		paginateDto.setCurrentPage(checkCurrentPage(currentPage, total));
		int start = findStart(paginateDto.getCurrentPage(), limit);
		paginateDto.setStart(start);
		int end = findEnd(paginateDto.getStart(), limit, totalData);
		paginateDto.setEnd(end);
		return paginateDto;
	}

	private int findEnd(int start, int limit, int totalData) {
		// TODO Auto-generated method stub
		return start + limit > totalData ? totalData : (start + limit) - 1 ;
	}

	private int findStart(int currentPage, int limit) {
		// TODO Auto-generated method stub
		return ((currentPage - 1) * limit) + 1;
	}

	private int setInfoTotalPage(int totalData, int limit) {
		// TODO Auto-generated method stub
		int totalPage = 0;
		totalPage = totalData / limit;
		totalPage = totalPage * limit < totalData ? totalPage + 1 : totalPage;
		return totalPage;
	}

	public int checkCurrentPage(int currentPage, int totalPage) {
		if (currentPage < 1) {
			return 1;
		}
		if (currentPage > totalPage) {
			return totalPage;
		}
		return currentPage;

	}

}
