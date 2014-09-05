<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Checkbox:</title>
</head>
<body>
Dipak
<s:form>

	<s:iterator value="magazines">
	
		<s:checkbox name="magazines" label="%{name}" fieldValue="%{code}"></s:checkbox>
	
	</s:iterator>
<s:checkbox name="dipk" label="My Name" fieldValue=""></s:checkbox>

<s:select name="sel" list="#{'1':'Mumbai', '2':'Pune', '3':'Nasik'}" onchange="javascript:alert(this.value );"></s:select><!-- Map -->
<s:select name="sel" list="{'Dipak', 'Yogesh', 'Mukesh'}" onchange="javascript:alert(this.value );"></s:select><!-- Array -->

<s:radio name="eleName" list="#{'1':'Admin', '2':'Customer'}"></s:radio>
<s:radio name="eleName" list="{'Admin', 'Customer'}"></s:radio>

	<s:iterator status="status" value="{10,2,9,6,3,8,4,5,1,7} ">
		<s:sort comparator="com.rediff.project.MySort">
			<s:property />
		</s:sort>	
		dipak
	</s:iterator>


<s:generator val="%{'Violet,Indigo,Blue,Green,Yellow,Orange,Red '}" count="7" separator=",">
   <s:iterator>
      <s:property /><br/>
   </s:iterator>
</s:generator>	

</s:form>

</body>
</html>