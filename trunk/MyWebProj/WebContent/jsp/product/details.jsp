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
Product Details: 
<s:property value="objProduct.productId"/><br />
<s:property value="objProduct.title"/><br />
<s:property value="objProduct.catId"/><br />
<s:property value="objProduct.link"/><br />
<s:property value="objProduct.desc"/><br />
<s:property value="objProduct.imgUrl"/><br />
</body>
</html>