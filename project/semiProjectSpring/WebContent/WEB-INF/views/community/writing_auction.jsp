<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header_index.jsp"%>
<%@ include file="../include/header_menu.jsp"%>
<link href="resources/css/community/writing.css" rel="stylesheet">
<script type="text/javascript"
	src="resources/edit/js/service/HuskyEZCreator.js" charset="UTF-8"></script>
<section class="projects-section bg-light" id="projects">
	<div class="container">
		<form action="" method="post">
			<ul class="nav nav-tabs">
				<li class="nav-item"><a class="nav-link" data-toggle="tab"
					href="#commercial" id="com">상가</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="tab"
					href="#estate" id="est">부동산</a></li>
				<li class="nav-item"><a class="nav-link active"
					data-toggle="tab" href="#auction" id="auc">경매</a></li>
			</ul>
			<div id="myTabContent" class="tab-content">
				<div class="tab-pane fade" id="commercial">
					<p>내가 사는, 알고 있는 지역에 관한 상가 정보를 알려주세요.</p>
				</div>
				<div class="tab-pane fade" id="estate">
					<p>내가 사는, 알고 있는 지역에 관한 부동산 정보를 알려주세요.</p>
				</div>
				<div class="tab-pane fade active show" id="auction">
					<p>내가 사는, 알고 있는 지역에 관한 경매 정보를 알려주세요.</p>
				</div>
			</div>
			<div class="form-group">
				<div class="form-inline form-group">
					<label for="title" class="col-sm-2 control-label">제목</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="title" maxlength="80">
					</div>
				</div> 
				<div class="tab-pane fade show active" id="all">
					<br>
					<div class="form-inline form-group">
						<label for="Select1">구/동 선택</label> <select
							class="form-control col-md-2" id="Select5">
							<option>선택</option>
						</select> <select class="form-control col-md-2" id="Select6">
							<option>선택</option>
						</select>
					</div>
				</div>
				<textarea id="ir1" class="form-control" rows="20"
					contenteditable="true"></textarea>
				<div id="writebutton">
					<button type="button" class="btn btn-success">확인</button>
					<button type="button" class="btn btn-secondary"
						onclick="location='comuMain'">취소</button>
				</div>
			</div>
		</form>
	</div>
</section>
<style>
#Select5, #Select6{
	margin-left: 10px;
	margin-right: 10px;
}
</style>
<script>
	$(function() {
		$('#com').click(function() {
			location = 'wriCom';
		});
		$('#est').click(function() {
			location = 'wriEst';
		});
		var oEditors = [];
		nhn.husky.EZCreator.createInIFrame({
			oAppRef : oEditors,
			elPlaceHolder : "ir1",
			sSkinURI : "resources/edit/SmartEditor2Skin.html",
			fCreator : "createSEditor2"
		});

		$('#runin').click(
				function() {
					var val1 = oEditors.getById["ir1"].exec(
							"UPDATE_CONTENTS_FIELD", []);
					alert($('#ir1').val());
				})

		var url = "comugu";
		$.ajax({
			url : url,
			success : function(d) {
				$("#Select5").html(d);
			}
		})
		$("#Select5").change(function() {
			var guName = $(this).val();
			var url = "comudong?guName=" + guName;
			$.ajax({
				url : url,
				success : function(d) {
					$("#Select6").html(d);
				}
			})
		})
	});
</script>
<%@ include file="../include/footer.jsp"%>