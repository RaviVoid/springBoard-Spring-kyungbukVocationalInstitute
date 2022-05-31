package com.kb.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kb.domain.MemberVO;
import com.kb.domain.MemberCriteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberMapperTests {

	@Setter(onMethod_ = @Autowired)
	MemberMapper mapper;
	
	public void getListTest() {
		log.info(mapper.getList());
	}
	
	public void getListWithPaging() {
		MemberCriteria cri = new MemberCriteria();
		cri.setPageNum(1);
		cri.setAmount(20);
		cri.setType("이름");
		//cri.setType("content");
		cri.setKeyword("테스트");
		List<MemberVO> list = mapper.getListWithPaging(cri);
		list.forEach(member -> log.info(member));
	}
	
	public void insert() throws ParseException {
		MemberVO member = new MemberVO();
		member.setUname("이름");
		member.setSchoolname("학교명");
		member.setGradeclass("학년반");
		member.setUid("01012345678");
		member.setUpw("1");
		member.setRoute("A");
		member.setBoardingplace("B");
		String dateStr = "2022-02-22 00:00:00";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = formatter.parse(dateStr);
		member.setJoindate(date);
		mapper.insert(member);

	}
	
	
	public void read() {
		log.info(mapper.read(1));
	}
	
	public void update() throws ParseException {
		MemberVO member = new MemberVO();
		member.setNum(1);
		member.setUname("홍길동");
		member.setSchoolname("둘리고등학교");
		String dateStr = "2022-02-22 00:00:00";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = formatter.parse(dateStr);
		member.setJoindate(date);
		mapper.update(member);
	}
	
	
	@Test
	public void delete() {
		mapper.delete(1);
	}
}







