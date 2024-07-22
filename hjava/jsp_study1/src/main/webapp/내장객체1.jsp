<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%-- 내장객체1.jsp --%>
    
    <%--
    
    
    	JSP페이지를 생성하고 서버에 의해서 페이지가 동작할 때
    	서버에서 페이지에게 객체를 할당해준다
    	
    	내장객체는 9가지이다
    		서버 - application : 처음 서버가 시작할 때 생성되는 객체
    		
    		연결 - session : 사용자가 서버에 처음 요청할 때 생성되고 사용자가 브라우저를
    						종료하기 전까지 살아있는 객체
    						
    		페이지 - request : 사용자의 요청내용을 저장하는 객체
    			   response : 요청에 대한 응답정보를 저장하는 객체
    			   out : 출력 객체
    			   page: JSP페이지 자체를 나타낸다
    			   config : JSP페이지의 설정정보를 저장하는 객체
    			   exception : JSP페이지의 예외발생을 처리하는 객체
    			   pageCotext : JSP페이지의 모든 정보를 저장
    
    
     --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

	String localAddr = request.getLocalAddr();
	out.println(localAddr);
	
	String serverAddr = request.getRemoteAddr();
	
	out.println(serverAddr);
	
	out.println(request.getLocale()); // 요청했을 때의 나라가 어디인지
	
	out.println(request.getMethod()); // 요청한 방식이 무엇인지
	out.println(request.getRequestURL()); // URL안에 URI가 들어있음
	out.println(request.getRequestURI());
	
%>

<!-- input 태그에 입력한 내용으로 requestTest.jsp 주소로 요청 -->

<form method="get" action="requestTest.jsp">
	<input type="text" name="myName"><Br>
	<input type="date" name="today"><br>
	<input type="checkbox" name="interest" value="게임">게임
	<input type="checkbox" name="interest" value="영화">영화
	<input type="checkbox" name="interest" value="자동차">자동차
	<input type="checkbox" name="interest" value="웹툰">웹툰
	
	<br>
	<Select name="city">
		<option value="대전">대전</option>
		<option value="서울">서울</option>
		<option value="광주">광주</option>
		<option value="부산">부산</option>
		
	
	</Select>
	<button>전송</button>

</form>

</body>
</html>