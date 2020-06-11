<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<link href="resources/css/myPage/th_bootstrap.css?after"
	rel="stylesheet" />
<link href="resources/css/myPage/th_styles.css?after" rel="stylesheet" />



<div class="container"> 
	<h4 class="subtopma">${vo.memberinfor.dname }님의 결제 정보 입니다.</h4>
	<form class="form-horizontal" action="inforDetailUpdate" method="post">
		<input type="hidden" class="" name="aid" id="aid"
			placeholder="" readonly="readonly" value="${vo.aid }"> <input
			type="hidden" class="" name="apwd" placeholder="Password"
			value="${vo.apwd }">
		<table class="type02"> 
			<tr>
				<th scope="row">결제일</th>
				<td><input type="text" class="form-control ch_pay" name="psdate" id="target"
					readonly="readonly" value="${vo.payvo.psdate }"></td>
			</tr>
			<tr>
				<th scope="row">종료일</th>
				<td><input type="text" class="form-control ch_pay" name="pedate"
					readonly="readonly" value="${vo.payvo.pedate }"></td>
			</tr>
			<tr>
				<th scope="row">결제금액</th>
				<td><input type="text" class="form-control ch_pay" name="ppay"
					readonly="readonly" value="${vo.payvo.ppay }"></td>
			</tr>
			<tr> 
				<th scope="row">결제 방식 / 상태 </th>
				<td><input type="text" class="form-control ch_pay" name="pway" id="pway"
					readonly="readonly" value="${vo.payvo.pway } / ${vo.payvo.pgubun }중">
					</td>
			</tr>
			<tr>
				<th scope="row">구독 개월수</th>
				<td><input type="text" class="form-control ch_pay" name="inment"
					readonly="readonly" value="${vo.payvo.paydetailvo.inment }"></td>
			</tr>
			<tr>
				<th scope="row">결제 은행</th>
				<td><input type="text" class="form-control ch_pay" name="kinds"
					readonly="readonly" value="${vo.payvo.paydetailvo.kinds }"></td>
			</tr>
			<tr>
				<th scope="row">카드번호</th>
				<td><input type="text" class="form-control ch_pay" name="mentnum"
					readonly="readonly" value="${vo.payvo.paydetailvo.mentnum }"></td>
			</tr>
		</table>
		<div class="container" id="signup"
			style="">

			<input type="button" class="btn btn-success btn-lg" id="pay_cbtn" value="문의하세요">
			
			<button type="submit" class="btn btn-success btn-lg"
				formmethod="post" formaction="mypage_lessor" formtarget="#aid">뒤로가기
			</button>
		</div>
	</form>
</div>


<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
	$(function() {
		var pgubun = '${vo.payvo.pgubun}' ;
		console.log(pgubun);
		if(pgubun == '구독' ){
		$('#pay_cbtn').val("연장하기");
		}else if(pgubun == '미구독' ){
			$('#pay_cbtn').val("구독하기");
		}
	});
</script>

