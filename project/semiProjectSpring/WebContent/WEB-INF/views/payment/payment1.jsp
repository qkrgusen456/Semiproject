<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>

<style>
img {
	width: 100px;
	height: 30px;
}

div.final_price {
	height: 69px;
	border-top: 1px solid #cbcfdb;
	border-bottom: 1px solid #cbcfdb;
	color: red;
	font: bold 30px Tahoma, sans-serif;
	text-align: center;
	line-height: 230%;
}

#button1 {
	width: 200px;
	text-align: center;
}
</style>
</head>
<body>
	<h2>결제확인창</h2>
	<div class="container">
		<div class="etc_payment">
			<span style="display:"> <span style="display: none"><input
					type="radio" id="pmCard" name="pay" checked="checked">신용카드</span>
				<label class="selected"><input type="radio" id="cardType0"
					name="pay" checked="checked">신용카드(일반)</label>
					

			</span> <span style="display: none" disabled=""> <label><input
					type="radio" id="pmRealtime" name="pay">실시간계좌이체</label>
			</span> <span style="display:"> <label><input type="radio"
					id="bank1" name="pay">무통장입금</label>
			</span> <span style="display: none" disabled=""> <label><input
					type="radio" id="pmPhone" name="pay">휴대폰결제</label>
			</span> <span style="display: none" disabled=""> <label><input
					type="radio" id="pmPayco" name="pay">PAYCO</label>
			</span> <span style="display: none" disabled=""> <label><input
					type="radio" id="pmTcash" name="pay">모바일티머니</label>
			</span>
		</div>
		<table border="1px solid black" class="aa">


			<tbody>
				<tr>
					<th scope="row">카드선택</th>
					<td bordercolor="red">
						<div id="target">
							<img src="resources/images/dnfl.png"> <img
								src="resources/images/shdguq.png"> <img
								src="resources/images/toakdmf.png"> <img
								src="resources/images/rnrals.png">


						</div>

					</td>
				</tr>

				<tr>
					<th>그외카드선택</th>
					<td><select style="width: 140px;"><option value="">선택하세요</option>
							<option>제주카드</option>
							<option>신협체크카드</option>
							<option>광주카드</option>
							<option>수협카드</option>
							<option>전북카드</option>
							<option>우체국카드</option>
							<option>KDB카드</option>
							<option>KB[구 현대]증권체크카드</option></select></td>

				</tr>


				<tr>
					<th><label>할부방식</label></th>
					<td><select>
							<option>일시불</option>
							<option>1개월</option>
							<option>2개월</option>
							<option>3개월</option>
							<option>4개월</option>
							<option>5개월</option>
							<option>6개월</option>
							<option>7개월</option>
							<option>8개월</option>
							<option>9개월</option>
							<option>10개월</option>
							<option>11개월</option>
							<option>12개월</option>
					</select></td>
				</tr>

				<tr>
					<th>결제안내</th>
					<td><a href="#"><span>간편결제안내</span></a> <a href="#"><span>공인인증안내</span></a>
						<a href="#"><span>안전결제안내</span></a> <a href="#"><span>안심클릭안내</span></a>
						<a href="#"><span>해외발급카드안내</span></a></td>
				</tr>
			</tbody>
		</table>
		<div id="PayOnline" style="display: block;">
			<input type="hidden" value="PayMethod_Set"
				name="PayMethod_SetClientID">
			<table id="Table1" cellspacing="1" cellpadding="3" width="670"
				bgcolor="#e54698" border="0"
				style="text-align: left; margin-top: 10px;">
				<tbody>
					<tr>
						<td colspan="2" bgcolor="#fce4ea" style="padding-left: 14px;"
							height="30" class="popup"><input type="radio" value="1"
							name="PayInfoHis" checked="" style="cursor: hand"><b>
								최근 입금정보와 동일</b> <input type="radio" value="2" name="PayInfoHis"
							style="cursor: hand"><b>새 입금정보 입력</b></td>
					</tr>
					<tr>
						<td class="popup" height="35" style="padding-left: 14px;"
							width="27%" bgcolor="#fce4ea">입금하실 은행</td>
						<td bgcolor="#ffffff"><select
							style="width: 140px; padding: 5px 0; font-size: 14px;"><option
									value="1">국민은행</option>
								<option value="2">기업은행</option>
								<option value="3">농협은행</option>
								<option value="12">시티은행</option>
								<option value="15">신한은행</option>
								<option value="13">우리은행</option>
								<option value="14">우체국은행</option>
								<option value="8">제일은행</option>
								<option value="11">하나은행</option></select></td>
					</tr>
					<tr>
						<td height="35" style="padding-left: 14px;" width="27%"
							bgcolor="#fce4ea">예금주 확인</td>
						<td bgcolor="#ffffff">㈜코스모 클랏쓰</td>
					</tr>
					<tr>
						<td class="popup" height="35" style="padding-left: 14px;"
							width="27%" bgcolor="#fce4ea">입금자 성명</td>
						<td bgcolor="#ffffff"><input class="form" type="text"
							maxlength="20" size="20"></td>
					</tr>
				</tbody>
			</table>
		</div>

	</div>
	<div class="container">
		<h4>
			<span id="finalPayTxt ">신용카드</span> 최종 결제금액
		</h4>
	</div>
	<div class="final_price container" id="CalcAmount">
		8,000<span>원</span>
	</div>
	<div class="my_agrmt_wrap container">
		<h5>
			<input type="checkbox" id="idArmt" name="idArmt"> 개인정보 판매자
			제공에 동의합니다.
		</h5>
		<div>
			<div class="id_agrmt">
				<p>고객님께서는 아래 내용에 대하여 동의를 거부하실 수 있으며, 거부시 상품 배송, CS가 제한됩니다.</p>
				<table border="1px solid black">
					<p>개인정보 수집 내용</p>
					<colgroup>
						<col width="30%">
						<col width="70%">
					</colgroup>
					<tbody>
						<tr>
							<th>제공받는자</th>
							<td>[예스이십사 주식회사]</td>
						</tr>
						<tr>
							<th>목적</th>
							<td>주문상품의 배송(예약), 고객상담 및 불만처리</td>
						</tr>
						<tr>
							<th>항목</th>
							<td>성명, 주소, 연락처(안심번호 적용 시 연락처는 제외), 개인통관고유부호(선택시), 공동현관
								출입번호(입력시)</td>
						</tr>
						<tr>
							<th>보유기간</th>
							<td>구매확정 후 3개월까지</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div class="container">
		<h5>
			<input type="checkbox"> 개인정보 수집 및 이용에 동의합니다.
		</h5>
		<p>고객님께서는 아래 내용에 대하여 동의를 거부하실 수 있으며, 거부 시 상품배송, 구매 및 결제, 일부 포인트
			적립이 제한됩니다.</p>

		<h5>
			<input type="checkbox">주문 상품정보에 동의합니다.
		</h5>
		<p>주문 상품의 상품명,가격,배송정보에 동의합니다</p>
		<input type="checkbox">위 내용을 모두 확인하였으며, 이 내용에 모두 동의하시겠습니까?<br>
		<button type="button" class="btn btn-success" id="button1"
			onclick="location='semi.Project?page=payment&code=3'">결제하기</button>
		<button type="button" class="btn btn-danger" id="button1"
			onclick="location='semi.Project?page=payment&code=2'">뒤로가기</button>

	</div>

<script>
$(document).ready(function() {
	$('.aa').show(); //페이지를 로드할 때 표시할 요소
	$('#PayOnline').hide(); //페이지를 로드할 때 숨길 요소
	$('.aa').click(function(){
	$ ('.aa').hide(); //클릭 시 첫 번째 요소 숨김
	$ ('#PayOnline').show(); //클릭 시 두 번째 요소 표시
	return false;
	});
	});
	
	

	
</script>


</body>
</html>
