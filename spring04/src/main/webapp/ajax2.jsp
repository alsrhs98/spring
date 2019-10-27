<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function() { //body먼저 인식하고, 자바 스크립트해주세요.
		$('.btn1').click(function() {
			//버튼을 클릭하면, 입력한 값을 가지고 온다
			reValue = $('.reply').val() //Map 형태로 데이터 값 지정함
			$.ajax({
				url : "server.do",
				data : {
					reply : reValue
				},
				success : function(result) {//result : 댓글내용을 받는 변수
					alert("서버로 통신 성공..!!!")
					$('.d1').append(result)
				}
			});
		});
	});
</script>
</head>
<body>
<input type="text" class="reply" name="reply">
<input type="button" class="btn1" value="댓글 달기"><br>

<div class="d1"> </div>
</body>



</html>