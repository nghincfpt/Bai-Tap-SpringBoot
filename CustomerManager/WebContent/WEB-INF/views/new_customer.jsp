<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <div align="center">
        <h2>New Customer</h2>
        <form:form action="save" method="post" modelAttribute="customer">
            <table border="0" cellpadding="5">
                <tr>
                    <td>Name: </td>
                    <td><form:input path="name" /></td>
                    <form:errors path="name" cssClass="text-danger"></form:errors>
                </tr>
                <tr>
                    <td>Email: </td>
                    <td><form:input path="email" /></td>
                </tr>
                <tr>
                    <td>Address: </td>
                    <td><form:input path="address" /></td>
                     <form:errors path="address" cssClass="error" />
                </tr>    
                <tr>
                    <td colspan="2">
                    <input type="submit" value="Save"></td>
                </tr>                    
            </table>
        </form:form>
    </div>
</body>
</html>