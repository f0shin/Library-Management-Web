<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   

<h1>${title} test!!</h1>
	
<c:set var="user" value="가길동" />
<c:if test="${not empty user}">
    <p>안녕하세요, ${user}님!</p>
</c:if>