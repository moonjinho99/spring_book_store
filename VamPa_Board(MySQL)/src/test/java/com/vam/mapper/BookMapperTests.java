package com.vam.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.model.BookVO;
import com.vam.model.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BookMapperTests {
	
	@Autowired
	private BookMapper mapper;

//	@Test
//	public void getGoodsListTests() {
//		
//		Criteria cri = new Criteria();
//		
//		//테스트 키워드
//		//cri.setKeyword("test")
//		System.out.println("cri : "+cri);
//		
//		List<BookVO> list = mapper.getGoodsList(cri);
//		System.out.println("list : "+list);
//		
//		System.out.println("=================");
//		int goodsTotal = mapper.goodsGetTotal(cri);
//		System.out.println("total : "+goodsTotal);
//	}
	
	//작가 id 리스트 요청
//	@Test
//	public void getAuthorId() {
//		
//		String keyword = "폴";
//		
//		String[] list = mapper.getAuthorIdList(keyword);
//		
//		System.out.println("결과 : "+list.toString());
//		
//		for(String id : list) {
//			System.out.println("개별 결과 : "+id);
//		}
//	}
	
	
	//검색 (동적 쿼리 적용) - 작가
//	@Test
//	public void getGoodsListTest1() {
//		Criteria cri = new Criteria();
//		String type ="A";
//		String keyword = "유홍준";
//		//String keyword = "없음";
//		String catecode = "";
//		
//		cri.setType(type);
//		cri.setKeyword(keyword);
//		cri.setAuthorArr(mapper.getAuthorIdList(keyword));
//		cri.setCateCode(catecode);
//	
//		List<BookVO> list = mapper.getGoodsList(cri);
//		
//		System.out.println("cri : "+cri);
//		System.out.println("list : "+list);
//	}
//	
//	
//	//검색 (동적 쿼리 적용) - 책제목
//	@Test
//	public void getGoodsListTest2() {
//		Criteria cri = new Criteria();
//		String type ="T";
//		String keyword = "테스트";  //테이블에 등록된 책 제목 데이터
//		//String keyword = "없음";	// 테이블에 등록되지 않은 데이터
//		String catecode = "";
//		
//		cri.setType(type);
//		cri.setKeyword(keyword);
//		cri.setAuthorArr(mapper.getAuthorIdList(keyword));
//		cri.setCateCode(catecode);
//	
//		List<BookVO> list = mapper.getGoodsList(cri);
//		
//		System.out.println("cri : "+cri);
//		System.out.println("list : "+list);
//	}
//	
//	//검색 (동적 쿼리 적용) - 카테고리
//		@Test
//		public void getGoodsListTest3() {
//			Criteria cri = new Criteria();
//			String type ="C";
//			String keyword = "";  
//			//String keyword = "";	
//			String catecode = "103002";
//			
//			cri.setType(type);
//			cri.setKeyword(keyword);
//			cri.setAuthorArr(mapper.getAuthorIdList(keyword));
//			cri.setCateCode(catecode);
//		
//			List<BookVO> list = mapper.getGoodsList(cri);
//			
//			System.out.println("cri : "+cri);
//			System.out.println("list : "+list);
//		}
//		
//		//검색 (동적 쿼리 적용) - 카테고리+작가
//				@Test
//				public void getGoodsListTest4() {
//					Criteria cri = new Criteria();
//					String type ="AC";
//					String keyword = "유홍준";  
//					//String keyword = "";	
//					String catecode = "103002";
//					
//					cri.setType(type);
//					cri.setKeyword(keyword);
//					cri.setAuthorArr(mapper.getAuthorIdList(keyword));
//					cri.setCateCode(catecode);
//				
//					List<BookVO> list = mapper.getGoodsList(cri);
//					
//					System.out.println("cri : "+cri);
//					System.out.println("list : "+list);
//				}
//				
//		//검색 (동적 쿼리 적용) - 카테고리+책제목
//				@Test
//				public void getGoodsListTest5() {
//					Criteria cri = new Criteria();
//					String type ="CT";
//					String keyword = "테스트";  
//					//String keyword = "";	
//					String catecode = "10200";
//					
//					cri.setType(type);
//					cri.setKeyword(keyword);
//					cri.setAuthorArr(mapper.getAuthorIdList(keyword));
//					cri.setCateCode(catecode);
//				
//					List<BookVO> list = mapper.getGoodsList(cri);
//					
//					System.out.println("cri : "+cri);
//					System.out.println("list : "+list);
//				}
	
	//카테고리 리스트
//	@Test
//	public void getCateListTest1() {
//		
//		Criteria cri = new Criteria();
//		
//		String type="TC";
//		String keyword="test";
//		
//		cri.setType(type);
//		cri.setKeyword(keyword);
//		
//		String[] cateList = mapper.getCateList(cri);
//		for(String codeNum : cateList) {
//			System.out.println("codeNum ::::: "+codeNum);
//		}
//	}
//	
//	//카테고리 정보 얻기
//	@Test
//	public void getCateInfoTest1() {
//		
//		Criteria cri = new Criteria();
//		
//		String type= "TC";
//		String keyword = "test";
//		String cateCode="104001";
//		
//		cri.setType(type);
//		cri.setKeyword(keyword);
//		cri.setCateCode(cateCode);
//		
//		mapper.getCateInfo(cri);
//	}
	
	//상품 정보
	@Test
	public void getGoodsInfo() {
		int bookId = 26;
		BookVO goodsInfo = mapper.getGoodsInfo(bookId);
		System.out.println("===============================");
		System.out.println(goodsInfo);
		System.out.println("===============================");
		
	}
	
	
}
