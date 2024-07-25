<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%-- board.jsp --%>
    
    <div id="boardWrap">
    	<h2>게시판</h2>
    	<div id="boardBox">
    		<div id="boardListBox">
    			<table id="boardList">
    				<tr>
    					<th class="num">번호</th>
    					<th class="title">제목</th>
    					<th class="writer">작성자</th>
    					<th class="hit">조회수</th>
    				</tr>
    				<%
    					for(int i=0; i<=0; i++){
    				%>
    				<tr>
    					<th class="num"></th>
    					<th class="title"></th>
    					<th class="writer"></th>
    					<th class="hit"></th>
    				</tr>
    				<%} %>
    			</table>
    		</div>
    		<div id="boardSerachBox">
    			<form method="get" action="?part=board">
    				<div class="boardSearch">
    					<input type="search" name="word" id="word">
    					<button>검색</button>
    				</div>
    			</form>
    		</div>
    		<div id="boardWriteBox">
    			<a href="?part=boardWrite" id="wrBt">글작성</a>
    		</div>
    	</div>
    </div>