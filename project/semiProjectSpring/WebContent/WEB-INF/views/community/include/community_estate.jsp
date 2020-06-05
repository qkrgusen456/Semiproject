<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
#Select5, #Select6 {
	margin-left: 10px;
	margin-right: 10px;
}

#checkorder3 {
	text-align: right;
	margin-bottom: 0.5rem;
}

#location3 {
	margin-bottom: 0;
}
</style>
<div class="tab-pane fade" id="estate">
	<br>
	<p>선택하신 '구'와 '행정동'을 기준으로 검색됩니다.</p>
	<div>
		<div class="form-inline form-group" id="location2">
			<label for="Select5">구 선택</label> <select id="Select5"
				class="form-control col-md-2">
				<option>전체</option>
			</select> <label for="Select6">동 선택</label> <select id="Select6"
				class="form-control col-md-2">
				<option>전체</option>
			</select>
			<button type="button" class="btn-primary btn-sm">검색</button>
		</div>
	</div>
	<div id="checkorder3">
		<div class="form-check-inline">
			<label class="form-check-label"> <input type="radio"
				class="form-check-input" name="estateoption" id="estateoption1"
				value="option7" checked="checked">최신순
			</label>
		</div>
		<div class="form-check-inline">
			<label class="form-check-label"> <input type="radio"
				class="form-check-input" name="estateoption" id="estateoption2"
				value="option8">조회순
			</label>
		</div>
		<div class="form-check-inline">
			<label class="form-check-label"> <input type="radio"
				class="form-check-input" name="estateoption" id="estateoption3"
				value="option9">추천순
			</label>&nbsp;
			<button type="button" class="btn-primary btn-sm" id="writeBtn3">글쓰기</button>
		</div>
	</div>
	<table class="table table-hover">
		<thead>
			<tr>
				<th scope="col">지역</th>
				<th scope="col">제목</th>
				<th scope="col">등록일</th>
				<th scope="col">조회</th>
				<th scope="col">추천</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">강남구</th>
				<td>안녕하세요!</td>
				<td>2020-05-27</td>
				<td>27</td>
				<td>5</td>
			</tr>
		</tbody>
	</table>
	<div id="pagenum3">
		<ul class="pagination pagination-lg">
			<li class="page-item disabled"><a class="page-link" href="#">&laquo;</a>
			</li>
			<li class="page-item active"><a class="page-link" href="#">1</a>
			</li>
			<li class="page-item"><a class="page-link" href="#">2</a></li>
			<li class="page-item"><a class="page-link" href="#">3</a></li>
			<li class="page-item"><a class="page-link" href="#">4</a></li>
			<li class="page-item"><a class="page-link" href="#">5</a></li>
			<li class="page-item"><a class="page-link" href="#">6</a></li>
			<li class="page-item"><a class="page-link" href="#">7</a></li>
			<li class="page-item"><a class="page-link" href="#">8</a></li>
			<li class="page-item"><a class="page-link" href="#">9</a></li>
			<li class="page-item"><a class="page-link" href="#">10</a></li>
			<li class="page-item"><a class="page-link" href="#">&raquo;</a>
			</li>
		</ul>
	</div>
</div>
<script>
	$(function() {
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
	})
</script>