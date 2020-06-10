package semiproject.mvc.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import semiproject.mvc.vo.SignUpVO;

@Repository
public class SignUpDao {
	
	@Autowired
	private SqlSessionTemplate ss;
	
	public void addSignUp1(SignUpVO vo) {
//		System.out.println("DAO 호출 완료!");
		String aid = vo.getAidheader() + "@" + vo.getAidfooter();
		vo.setAid(aid);
		ss.insert("signup.addmember1", vo);
	}
	
	public void addSignUp2(SignUpVO vo) {
//		System.out.println("DAO 호출 완료!");
		String dbirth = vo.getDyear()+"-"+vo.getDmonth()+"-"+vo.getDday();
		vo.setDbirth(dbirth);
		String dtel = vo.getDtelheader()+"-"+vo.getDtelmiddle()+"-"+vo.getDtelfooter();
		vo.setDtel(dtel);
		System.out.println(dtel);
		ss.insert("signup.addmember2", vo);
		ss.insert("signup.addmember3");
		ss.insert("signup.addmember4");
	}
	
	public int aidHeaderCheck(String aid) {
		System.out.println("SignUpDao 호출 완료!");
		return ss.selectOne("signup.idChk", aid);
	}
}