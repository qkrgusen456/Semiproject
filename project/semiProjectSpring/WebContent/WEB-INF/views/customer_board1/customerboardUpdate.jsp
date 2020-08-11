<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header_index.jsp"%>
<%@ include file="../include/header_menu.jsp"%>
<link href="resources/css/community/writing.css" rel="stylesheet">
<script type="text/javascript" src="resources/edit/js/service/HuskyEZCreator.js" charset="UTF-8"></script>
<section class="projects-section bg-light" id="projects">
	<div class="container">
		
		<form action="cusUpdate" method="post">
			<input type="hidden" name = "c_num" value="${detail.c_num}">
			<div class="form-group">
				<div class="form-inline form-group">
				<input type="hidden" name="anum" value="${user.anum}">
					<label for="title" class="col-sm-2 control-label">제목</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="title" name="c_subject" maxlength="50" value="${detail.c_subject}">
					</div>
				</div>
				<div class="tab-pane fade show active" id="all">
					<br>
					<div class="form-inline form-group">
						<label for="Select1">문의 유형</label>&nbsp;&nbsp;&nbsp;
						<select
							class="form-control" id="c_type" name="c_type" required="required">
									<option>문의유형1</option>
									<option>문의유형2</option>
									<option>문의유형3</option>
									<option>문의유형4</option>
									<option>기타</option>
						</select> 
						
					</div>
				</div>
				<textarea id="ir1" name="c_content" class="form-control" rows="20" cols="100" contenteditable="true">
				${detail.c_content}
				</textarea>
				<div id="writebutton">
					<button id="runin" type="submit" class="btn btn-success">확인</button>
					<button type="button" class="btn btn-secondary" onclick="location='listall'">취소</button>
				</div>
			</div>
		</form>
	</div>
</section>
<style>
#Select1, #Select2{
	margin-left: 10px;
	margin-right: 10px;
}
</style>
<script>
	$(function() {
		$('#est').click(function() {
			location = 'wriEst';
		});
		$('#auc').click(function() {
			location = 'wriAuc';
		});
		
		var oEditors = [];
		nhn.husky.EZCreator.createInIFrame({
		 oAppRef: oEditors,
		 elPlaceHolder: "ir1",
		 sSkinURI: "resources/edit/SmartEditor2Skin.html",
		 fCreator: "createSEditor2"
		});
		
		$('#runin').click(function() {
			var val1 = oEditors.getById["ir1"].exec("UPDATE_CONTENTS_FIELD",[]);
		});
		
	
	
	});
</script>
<%@ include file="../include/footer.jsp"%>
