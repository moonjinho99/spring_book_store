package com.vam.mapper;

import java.util.List;

import com.vam.model.BookVO;
import com.vam.model.CateVO;
import com.vam.model.Criteria;

public interface BookMapper {
	
	//상품 검색
	public List<BookVO> getGoodsList(Criteria cri);
	
	//상품 총 개수
	public int goodsGetTotal(Criteria cri);
	
	//작가 id 리스트 요청
	public String[] getAuthorIdList(String keyword);
	
	//국내 카테고리 테스트
	public List<CateVO> getCateCode1();
	
	//국외 카테코리 테스트
	public List<CateVO> getCateCode2();
	
}
