<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome, <s:property value="name"/> 
<br/>
Here it goes..

<s:form>
	<%-- <s:text name="${name}"></s:text> --%>
	<s:textarea label="Enter Desc" cols="50" wrap="true" id="" title="dipak" rows="10" value=""></s:textarea>
	<s:textfield name="" value="tet" label="Enter Name"></s:textfield>
	<s:checkbox name="name" fieldValue="User" label="User"></s:checkbox>
	<s:checkbox name="name" fieldValue="Admin" label="Admin"></s:checkbox>

	<s:submit value="SUBMIT"></s:submit>
	<s:reset value="RESET"></s:reset>
</s:form>

</body>
</html>