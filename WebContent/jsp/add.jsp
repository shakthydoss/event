<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Event</title>
</head>
<body>
	 <s:form action="/save">
	        <s:textfield key="event.name"/>
            <s:textfield key="event.category"/>
            <s:textfield key="event.description"/>
            <s:textfield key="event.organizer"/>
            <s:textfield key="event.website"/>
            <s:date name="event.startDate" />
            <s:date name="event.endDate" />
            <s:textfield key="event.addLine1"/>
            <s:textfield key="event.addLine2"/>
            <s:textfield key="event.city"/>
            <s:textfield key="event.region"/>
            <s:textfield key="event.postalCode"/>
            <s:textfield key="event.country"/>
            <s:submit/>
     </s:form>
</body>
</html>