package semiproject.mvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import semiproject.mvc.dao.SignUpDao;
import semiproject.mvc.vo.SignUpVO;

@RestController
public class SignUpRestPage {

	@Autowired
	private SignUpDao signUpDao;
	
	@RequestMapping(value = "/idChk")
	@ResponseBody
	public int idChk(String aid) {
		int cnt = signUpDao.aidCheck(aid);
		return cnt;
	}
	
	@RequestMapping(value = "/nameChk")
	@ResponseBody
	public int dnameChk(SignUpVO vo) {
		int cnt = signUpDao.dnameCheck(vo);
		return cnt;
	}
}
