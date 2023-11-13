package com.vam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vam.mapper.AdminMapper;
import com.vam.model.BookVO;
import com.vam.model.CateVO;
import com.vam.model.Criteria;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class AdminServiceimpl implements AdminService{

	@Autowired
	private AdminMapper adminMapper;
	
	//상품 등록
	@Transactional
	@Override
	public void bookEnroll(BookVO book) {
		
		log.info("(service)bookEnroll.....");
		
		adminMapper.bookEnroll(book);
		
		if(book.getImageList() == null || book.getImageList().size() <= 0) {
			return;
		}
		
		book.getImageList().forEach(attach ->{
			
			attach.setBookId(book.getBookId());
			adminMapper.imageEnroll(attach);
			
		});
	}
	
	//카테고리 리스트
	@Override
	public List<CateVO> cateList() {
		log.info("(service)cateList....");
		return adminMapper.cateList();
	}

	//상품 리스트
	@Override
	public List<BookVO> goodGetList(Criteria cri) {
		log.info("goodsGetTotalList....");
		return adminMapper.goodsGetList(cri);
	}

	//상품 총 갯수
	@Override
	public int goodsGetTotal(Criteria cri) {
		log.info("goodsGetTotal.....");
		
		return adminMapper.goodsGetTotal(cri);
	}

	//상품 조회 페이지
	@Override
	public BookVO goodsGetDetail(int bookId) {
		
		log.info("(service)bookGetDetail...."+bookId);
		
		return adminMapper.goodsGetDetail(bookId);
	}

	//상품 정보 수정
	@Override
	public int goodsModify(BookVO vo) {
		
		log.info("goodModify....");
		
		return adminMapper.goodsModify(vo);
	}

	//상품 정보 삭제
	@Override
	public int goodsDelete(int bookId) {
		
		log.info("goodsDelete.....");
		return adminMapper.goodsDelete(bookId);
		
	}
	
	
}
