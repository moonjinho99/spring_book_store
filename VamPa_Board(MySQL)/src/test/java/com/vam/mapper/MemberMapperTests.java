package com.vam.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.model.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTests {

	@Autowired
	private MemberMapper membermapper;
	
//	@Test
//	public void memberJoin() throws Exception{
//		MemberVO member = new MemberVO();
//		
//		member.setMemberId("spring_test");
//		member.setMemberPw("spring_test");
//		member.setMemberName("spring_test");
//		member.setMemberMail("spring_test");
//		member.setMemberAddr1("spring_test");
//		member.setMemberAddr2("spring_test");
//		member.setMemberAddr3("spring_test");
//		
//		membermapper.memberJoin(member);
//	}
	
//	@Test
//	public void memberIdChk() throws Exception{
//		String id = "a";
//		String id2 = "aa";
//		membermapper.idCheck(id);
//		membermapper.idCheck(id2);
//	}
	
	@Test
	public void memberLogin() throws Exception{
		MemberVO member = new MemberVO();
		member.setMemberId("test1");
		member.setMemberPw("test1");
		
		membermapper.memberJoin(member);
		System.out.println("결과 값 : "+membermapper.memberLogin(member));
	}
}
