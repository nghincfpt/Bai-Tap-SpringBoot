<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
 <style type="text/css">
 <%@include file="/css/bootstrap.min.css"%>
</style>  
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div  class="container pt-5" >
<div align="center">
<div class="shadow-lg p-3 p-3 mb-5 bg-light rounded">
 <h2 style="color:blue">Edit Customer</h2>

  <form:form action="${pageContext.request.contextPath}/saveEdit" method="post" modelAttribute="phichungcu">
            <table border="0" cellpadding="5">
                <tr>
                    <td>Ma Thu Tien: </td>
                    <td>${phichungcu.matt}
                        <form:hidden path="matt"/>
                    </td>
                </tr>   
                   <tr>
                    <td>Ma Can Ho: </td>
                    <td>${phichungcu.maCanHo}
                        <form:hidden path="maCanHo"/>
                    </td>
                </tr> 
                
                    <tr>
                    <td>dien Tich: </td>
                    <td>${phichungcu.dienTich}
                        <form:hidden path="dienTich"/>
                    </td>
                </tr> 
                
                   <tr>
                    <td>Ma toa nha: </td>
                    <td>${phichungcu.maToaNha}
                        <form:hidden path="maToaNha"/>
                    </td>
                </tr>             
                <tr>
                    <td>Ho ten chu ho : </td>
                    <td><form:input path="hoTenChuHo" /></td>
                </tr> 
                
                  <tr>
                    <td>so Dien Thoai: </td>
                    <td>${phichungcu.soDienThoai}
                        <form:hidden path="soDienThoai"/>
                    </td> 
                </tr> 
                       <tr>
                    <td>Thang Bat Dau: </td>
                    <td>${phichungcu.thangBD}
                        <form:hidden path="thangBD"/>
                    </td>
                </tr>               
                  <tr>
                    <td>So Thang: </td>
                    <td><form:input path="soThang" /></td>
                    <td><span class="error">${message}</span></td>
                </tr> 
                  <tr>
                    <td>Ngay Dong : </td>
                    <td><form:input path="ngayDong" type="date" /></td>
                </tr>   
                
                   <tr>
                    <td>Tong Tien: </td>
                    <td>${phichungcu.tongTien}
                        <form:hidden path="tongTien"/>
                    </td>
                </tr>
                
            </table>
             <div class="">
     <button type="submit" class="btn btn-outline-success" >Submit</button>
    </div>
        </form:form>
   
</div>
</div>
</div>
</body>
</html>


