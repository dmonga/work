<%

response.setCharacterEncoding("UTF-8");
response.setHeader("Cache-Control","no-cache");
response.setHeader("Pragma","no-cache");
response.setDateHeader ("Expires", -1);

%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>





<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- Show usage; Used in Header --%>

<s:set name="lang" value="#request.locale.language" />

<html xmlns="http://www.w3.org/1999/xhtml"> 

    <head>
		


		<jsp:include page="/common/catalogLinks.jsp" /> 
		<jsp:include page="/common/checkRequirements.jsp" />






		



</head>
<body class="body">

    <tiles:importAttribute name="page" scope="request"/>




    <tiles:insertAttribute name="body"/>



	
</body>
</html>












