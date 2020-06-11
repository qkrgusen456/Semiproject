<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../include/header_index.jsp"%>
<%@ include file="../include/header_menu.jsp"%>
<style>
#Select1, #Select2 {
	margin-left: 10px;
	margin-right: 10px;
}

#checkorder1 {
	text-align: right;
	margin-bottom: 0.5rem;
}

#location1 {
	margin-bottom: 0;
}
</style>
<section class="projects-section bg-light" id="projects">
	<div class="container">
		<div class="form-inline form-group" id="location1">
			<label for="Select1">구 선택</label> <select id="Select1"
				class="form-control col-md-2">
				<option>전체</option>
			</select> <label for="Select2">거래종류 선택</label> <select id="Select2"
				class="form-control col-md-2">
				<option>전체</option>
			</select>
		</div>
		<table class="table table-hover">
			<thead>
				<tr>
					<th colspan="8">매물정보</th>
				</tr>
				<tr>
					<th>번호</th>
					<th>매물종류</th>
					<th>거래종류</th>
					<th>가격(만원)</th>
					<th>매물정보</th> 
					<th>tagList</th>
					<th>부동산이름</th>
					<th>행정동명</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="listv" items="${list}">
					<tr>
						<th>${listv.num}</th>
						<td>${listv.rlettpcd}</td>
						<td>${listv.tradtpcd}</td>
						<td>${listv.prc}</td>
						<td>${listv.atclfetrdesc}</td>
						<td>${listv.taglist}</td>
						<td>${listv.rltrnm}</td>
						<td>${listv.location }</td>
					</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="8" id="pageTd"><%@ include file="pageProcess.jsp"%>
					</td>
				</tr>
				<tr>
					<th colspan="8">

						<form method="post" action="product">
							<input type="hidden" name="nowPage" value="${param.nowPage }">
							<input type="hidden" name="page" value="${param.page}"> <select
								name="searchType">
								<option value="1">거래종류</option>
								<option value="2">행정동명</option>
								<option value="3">내용</option>
							</select>&nbsp; <input name="searchValue"> <input type="submit"
								class="btn-primary btn-sm" value="검색">
						</form>
					<th>
				<tr>
			</tfoot>
		</table>
	</div>
</section>
<script>
	$(function() {
		var url = "comugu";
		$.ajax({
			url : url,
			success : function(d) {
				$("#Select1").html(d);
			}
		})
		var url = "";
		$.ajax({
			url : url,
			success : function(d) {
				$("#")
			}
		})
	});
</script>
<%@ include file="../include/footer.jsp"%>