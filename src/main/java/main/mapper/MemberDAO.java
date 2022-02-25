package main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import main.vo.MemberVO;

@Mapper
@Repository
public interface MemberDAO {
	public List<MemberVO> selectMember();
}
