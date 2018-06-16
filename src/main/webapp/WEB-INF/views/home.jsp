<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<ul>
	<li><a href="board/list.do">게시판 리스트</a></li>
	<li><a href="board/list.do">게시판 입력</a></li>
	<li><a href="board/list.do">게시판 수정</a></li>
	
</ul>
</body>
</html>
