package com.vam.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.model.AttachImageVO;
import com.vam.model.BookVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class AdminServiceTests {
	
	@Autowired
	private AdminService service;
	
	
	@Test
	public void bookEnrollTEsts()
	{
		BookVO book = new BookVO();
		
		//상품 정보
		book.setBookName("service 테스트");
		book.setAuthorId(123);
		book.setPubleYear("2023-11-09");
		book.setPublisher("출판사");
		book.setCateCode("100000");
		book.setBookPrice(20000);
		book.setBookStock(300);
		book.setBookDiscount(0.23);
		book.setBookIntro("책 소개 ");
		book.setBookContents("책 목차");
		
		//이미지 정보
		List<AttachImageVO> imageList = new ArrayList<AttachImageVO>();
		
		AttachImageVO image1 = new AttachImageVO();
		AttachImageVO image2 = new AttachImageVO();
		
		image1.setFileName("test Image 1");
		image1.setUploadPath("test image 1");
		image1.setUuid("test1111");
		
		image2.setFileName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		image2.setUploadPath("test Image 2");
		image2.setUuid("test2222");
		
		imageList.add(image1);
		imageList.add(image2);
		
		book.setImageList(imageList);
		
		//bookEnroll() 메서드 호출
		service.bookEnroll(book);
		
		System.out.println("등록된 VO : "+book);
		
	}
	
}
