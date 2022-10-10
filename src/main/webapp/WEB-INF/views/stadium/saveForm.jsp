<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<form>
		<div class="mb-3 mt-3">
			<input id="name" type="text" class="form-control" placeholder="Enter name">
		</div>
		<button id="btnInsert" type="button" class="btn btn-primary">경기장등록완료</button>
	</form>
</div>

<script>
	$("#btnInsert").click(()=>{
		insert();
	}); 	// 이벤트리스너
	
	function insert(){
		let data = {
				name: $("#name").val() 	// 키값 : 찾아야할 값
		}
		
		$.ajax("/stadium",{
			type: "POST",
			dataType: "json", 	//디폴트값 json / 응답데이터
			data: JSON.stringify(data),// 데이터 json으로 바꿔서 던지는 것 / http body에 들고갈 요청 데이터
			headers: {  // http header에 들고갈 요청 데이터
				"Content-Type": "application/json; charset=utf-8"
			}
		}).done((res)=>{
			if(res.code == 1){ // 성공 / 경기장등록 성공 -> 경기장 목록
				location.href="/stadium";	// location.href 는 무조건 Get 요청
			}else{ // 실패
				alert("경기장등록에 실패하였습니다.");
			}
		});
	}
</script>

<%@ include file="../layout/footer.jsp"%>