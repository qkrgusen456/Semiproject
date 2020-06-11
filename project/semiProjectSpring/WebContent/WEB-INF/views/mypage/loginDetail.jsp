<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<link href="resources/css/myPage/th_bootstrap.css?after"
	rel="stylesheet" />
<link href="resources/css/myPage/th_styles.css?after" rel="stylesheet" />



<div class="container" id="">
	<h4 class="subtopma">${user.aid }님의 로그인 정보 입니다.</h4>
	<form class="form-horizontal" action="mypageloginUpdate" method="post">

		<table class="type02">
			<tr>
				<th scope="row">아이디</th>
				<td><input type="text" class="form-control" name="aid"
					readonly="readonly" value="${user.aid }"></td>
			</tr>
			<tr>
				<th scope="row">비밀번호</th>
				<td><input type="password" class="form-control" name="apwd"
					id="apwd" value="${vo.apwd }">
				<input type="button" id="cbtn" class="" value="비번확인"></td>
			</tr>
			<tr>
				<th scope="row">가입날짜</th>
				<td><input type="text" class="form-control" name="ainday"
					id="age" readonly="readonly" value="${vo.ainday }"></td>
			</tr>
			<tr>
				<th scope="row">수정날짜</th>
				<td><input type="text" class="form-control" name="achgday"
					readonly="readonly" value="${vo.achgday }"></td>
			</tr>
			<tr>
				<th scope="row">아이디 구분</th>
				<td><input type="text" class="form-control" name="agubun"
					readonly="readonly" value="${vo.agubun }"></td>
			</tr>
		</table>
		<div class="container" id="signup" style="">

			<button type="submit" class="btn btn-success btn-lg">수정하기</button>
			<button type="submit" class="btn btn-success btn-lg"
				formmethod="post" formaction="mypage_lessor" formtarget="#aid">뒤로가기
			</button>
		</div>
	</form>
</div>


<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
	$(function() {
		var cnum = 0;

		$('#cbtn').click(function() {

			if (cnum === 0) {
				$('#apwd').attr('type', 'text');
				$('#cbtn').val('감추기');
				cnum++
			} else if (cnum === 1) {
				cnum = 0;
				$('#apwd').attr('type', 'password');
				$('#cbtn').val('비번확인');
			}

		});

	});
</script>

