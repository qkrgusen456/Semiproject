package model;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.PageForward;

public class CommunityPage implements PageModel{
	private int code;
	private CommunityPage(int code) {
		this.code = code;
	}

	@Override
	public PageForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		return new PageForward("community/community.jsp", false);
	}
}	
