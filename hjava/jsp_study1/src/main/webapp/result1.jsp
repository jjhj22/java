<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%-- result1.jsp -> html태그 삭제
    
    이름과 국어, 수학, 과학 성적을 받아서
    평균이 90이상이면 참 잘했어요
    80이상이면 잘했어요
    70이상이면 노력해라
    나머지는 이게 점수야! 출력
      
    
    
     --%>
    
 <%
String name=request.getParameter("name");
int mat=Integer.parseInt(request.getParameter("mat"));
int kor=Integer.parseInt(request.getParameter("kor"));
int sci=Integer.parseInt(request.getParameter("sci"));

int gkq=mat+kor+sci;
int vud=gkq/3;

if(vud>=90){
	out.println("참 잘했어요");
}else if(vud>=80){
	out.println("잘했어요");
}else if(vud>=70){
	out.println("노력해라");
}else{
	out.println("이게 점수야!");
}
%>

<br>
<hr>
<%@ include file="requestTest2.jsp" %>
