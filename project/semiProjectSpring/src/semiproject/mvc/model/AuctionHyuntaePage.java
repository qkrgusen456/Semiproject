package semiproject.mvc.model;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import semiproject.mvc.dao.AuctionDao;
import semiproject.mvc.dao.AuctionHyuntaeDao;
import semiproject.mvc.service.AuctionService;
import semiproject.mvc.vo.AuctionAddDeVO;
import semiproject.mvc.vo.AuctionAddIpVO;
import semiproject.mvc.vo.AuctionAddMainVO;
import semiproject.mvc.vo.AuctionDetailVO;
import semiproject.mvc.vo.AuctionPageVO;
import semiproject.mvc.vo.AuctionSaleVO;
import semiproject.mvc.vo.IpchalperVO;
import semiproject.mvc.vo.UserVO;

@Controller
public class AuctionHyuntaePage {
	@Autowired
	private AuctionService auctionservice;

	@Autowired
	private AuctionHyuntaeDao auctionhyuntaedao;
	@Autowired
	private AuctionDao auctionDao;

	@RequestMapping(value = "/auctionDetail")
	public ModelAndView acutionGGG(int anum, HttpServletRequest request,HttpSession httpsession) throws Exception {
		System.out.println("물건번호 : " + anum);
		ModelAndView mav = new ModelAndView("auction/auctionDetail");
		UserVO vo1 = (UserVO) httpsession.getAttribute("user");
		String aid = vo1.getAid();
		auctionhyuntaedao.auctionHit(anum);
		AuctionDetailVO vo = auctionhyuntaedao.getAuctionDetail(anum);
		mav.addObject("result", vo);
		mav.addObject("list", anum);
		mav.addObject("aid", aid);
		return mav;
	}

	@RequestMapping(value = "/auction_sale")
	public ModelAndView auctionSales(HttpServletRequest request, HttpSession httpsession) throws Exception {
		ModelAndView mav = new ModelAndView("auction/auction_sale");
		UserVO vo = (UserVO) httpsession.getAttribute("user");
		String aid = vo.getAid();
		mav.addObject("aid", aid);

		return mav;
	}

	@RequestMapping(value = "insertPurchase", method = RequestMethod.POST)
	public ModelAndView insertPurchase(IpchalperVO vo) {
		ModelAndView mav = new ModelAndView();
		auctionhyuntaedao.purchase(vo);
		mav.setViewName("redirect:purchase");
		return mav;

	}

	@RequestMapping(value = "/purchase")
	public ModelAndView detailIpchal(IpchalperVO vo) {
		ModelAndView mav = new ModelAndView();

		auctionhyuntaedao.purchase(vo);
		mav.setViewName("auction/purchase");
		return mav;
	}

	@RequestMapping(value = "/auctionSaleManagement")
	public ModelAndView saleManagement(int anum , IpchalperVO vo1) {
		System.out.println("물건번호 : " + anum);
		ModelAndView mav = new ModelAndView("auction/auctionSaleManagement");
		auctionhyuntaedao.auctionHit(anum);
		AuctionDetailVO vo = auctionhyuntaedao.getAuctionDetail(anum);
		System.out.println(vo.getIpnum());
		System.out.println(vo1.getIpprice());
		mav.addObject("result", vo);
		mav.addObject("anum", anum);
		return mav;
	}

	/*
	 * @RequestMapping(value = "/auctionSaleManagement") public ModelAndView
	 * manegementList(int ipnum) { ModelAndView mav = new
	 * ModelAndView("auction/auctionSaleManagement"); List<IpchalperVO> list =
	 * auctionhyuntaedao.getList(ipnum); mav.addObject("list", list); return mav; }
	 */

	@RequestMapping(value = "/auction_sales")
	public ModelAndView saleList(String aid, AuctionAddMainVO vo, AuctionAddDeVO avo, AuctionAddIpVO bvo) {
		ModelAndView mav = new ModelAndView();
		System.out.println(aid);
		List<AuctionSaleVO> list = auctionhyuntaedao.getAuctionsale(aid);
		mav.addObject("list", list);
		mav.setViewName("auction/auction_sale");
		return mav;

	}
	//@RequestMapping(value = "/auction_sales")
	//public String auctionviewlist(AuctionPageVO vo,Model model,HttpServletRequest request,@RequestParam(value = "nowPage",required = false,defaultValue = "1") String nowPage, 
			//@RequestParam(value = "cntPage",required = false,defaultValue = "5") String cntPerPage,
			//@RequestParam(value = "statussel",required = false,defaultValue = "0") String statussel,
			//@RequestParam(value = "mulgun",required = false,defaultValue = "0") String mulgun,
			//@RequestParam(value = "sortindex",required = false,defaultValue = "0") String sortindex,
			//@RequestParam(value = "searchType",required = false) String searchType,
			//@RequestParam(value = "searchValue",required = false) String searchValue
			//) {
		//int total = auctionhyuntaedao.getTotalCnt(vo);
		//vo = new AuctionPageVO(total,Integer.parseInt(nowPage),Integer.parseInt(cntPerPage),Integer.parseInt(statussel),Integer.parseInt(mulgun),Integer.parseInt(sortindex),vo.getSearchType(),vo.getSearchValue());
		//System.out.println(vo.getSearchType()+"::"+vo.getSearchValue());
		//세션 값
		//HttpSession session = request.getSession();
		//UserVO sbid =(UserVO) session.getAttribute("user");
		//model.addAttribute("paging",vo);
		//List<AuctionSaleVO> list = auctionhyuntaedao.getAuctionsale(sbid.getAid());
		//model.addAttribute("list",list);
		
		//세션 테스트
		//session.setAttribute("user","tests");
	
		//model.addAttribute("sbid",sbid.getAid().equals(null)?"":sbid.getAid());
		//return "auction/auction_sale";

//	}	

	@RequestMapping(value = "/purchaseChart", produces = "application/json; charset=euc-kr")
	public String purchaseDetail2(int num) {
		List<AuctionSaleVO> list = auctionhyuntaedao.getchartdata(num);
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (AuctionSaleVO e : list) {
			map.put(e.getIpdate(), e.getIpprice());
		}

		String result = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			result = mapper.writeValueAsString(map);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}
