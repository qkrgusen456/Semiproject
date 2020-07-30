package semiproject.mvc.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import semiproject.mvc.vo.LoginDTO;
import semiproject.mvc.vo.SignUpVO;
import semiproject.mvc.vo.UserVO;

@Repository
public class LoginDao extends HandlerInterceptorAdapter{
	@Autowired
	private SqlSessionTemplate ss;

	public int login(LoginDTO loginDTO) throws Exception{
		
		return ss.selectOne("login.login", loginDTO);
	}
	public UserVO logininfo(String aid) throws Exception{
		
		return ss.selectOne("login.info", aid);
	}
	
	public void loginsert(int anum) {
		ss.insert("login.loginsert", anum);
	}
	
	public void logout(int anum) {
		ss.update("login.logout", anum);
	}
	

}