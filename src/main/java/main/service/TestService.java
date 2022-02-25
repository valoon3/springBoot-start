package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.mapper.MemberDAO;
import main.vo.MemberVO;

@Service
public class TestService {

	@Autowired
	private MemberDAO memberDAO;
	
	public void showMember() {
		List<MemberVO> list = memberDAO.selectMember();
		
		for(MemberVO member : list) {
			System.out.print(member.getId() + " " + member.getEmail() + " " + member.getPassword() + " " + member.getName() + " " + member.getRegDate());
			System.out.println();
		}
		
	}
	
}
