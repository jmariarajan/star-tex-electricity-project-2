<%-- <%@page import="com.bootcamp.customerserviceplan.registration.model.Customer"%> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-family:Cambria;">
<div style="color:green;"><h2>Registered Successfully</h2></div>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<fieldset style="width:300px;">
<legend><b>Customer Information</b></legend>
</br>
First Name : ${customer.firstName}
</br>
</br>
Last Name : ${customer.lastName}
</br>
</br>
Phone No : ${customer.phoneNo}
</br>
</br>
Email : ${customer.email}
</br>
</br>
</fieldset>
</br>
<fieldset style="width:300px;">
<legend><b>Service Plan Information</b></legend>
</br>
 Service ID: ${serviceId}
</br></br>
 Service Plan : ${servicePlan}
 </br></br>
 Service Charge : ${serviceCharge}
 </br></br>
 Service Period : ${servicePeriod}
</fieldset>

</body>
</html>