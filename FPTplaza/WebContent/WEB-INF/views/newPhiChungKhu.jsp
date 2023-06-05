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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div  class="container" style="padding-top: 20px">
<nav>
<div class="shadow-lg p-3 mb-5 bg-body rounded" >
<h3> ADD Phi Chung Cu</h3>
<form:form action="savephichungcu" method="post" modelAttribute="phichungcu">

  
   <div class="form-group row" style="justify-content: center;">
    <label for="colFormLabel" class="col-sm-2 col-form-label">Ma tinh tien</label>
    <div class="col-5">
      <form:input type="text" class="form-control" id="colFormLabel" placeholder="matt" path="matt"/>
        <form:errors path="matt" cssClass="text-danger"></form:errors>
    </div> 
  </div>
  
    <div class="form-group row" style="justify-content: center;">
    <label for="colFormLabel" class="col-sm-2 col-form-label">Ma Can Ho</label>
    <div class="col-5">
      <form:input type="text" class="form-control" id="colFormLabel" placeholder="Ma Can Ho" path="maCanHo"/>
     <form:errors path="maCanHo" cssClass="text-danger"></form:errors>
    </div>
  </div>
  
    <div class="form-group row" style="justify-content: center;">
    <label for="colFormLabel" class="col-sm-2 col-form-label">dien Tich</label>
    <div class="col-5"> 
      <form:input type="text" class="form-control" id="colFormLabel" placeholder="dien Tich" path="dienTich"/>
     <form:errors path="dienTich" cssClass="text-danger"></form:errors>
    </div>
  </div>
  
  
  
    <div class="form-group row" style="justify-content: center;">
    <label for="colFormLabel" class="col-sm-2 col-form-label">Ma Toa Nha</label>
    <div class="col-5">     
       <form:select class="form-control"   path="maToaNha">
      <form:options items="${listmatoanha}" itemLabel="maToaNha" itemValue="maToaNha"></form:options>
      </form:select>      
    </div>
  </div>
  
  
    <div class="form-group row" style="justify-content: center;">
    <label for="colFormLabel" class="col-sm-2 col-form-label">Ho Ten Chu Ho</label>
    <div class="col-5">
      <form:input type="text" class="form-control" id="colFormLabel" placeholder="Ho Ten Chu Ho" path="hoTenChuHo"/>
     <form:errors path="hoTenChuHo" cssClass="text-danger"></form:errors>
    </div>
  </div>
  
    <div class="form-group row" style="justify-content: center;">
    <label for="colFormLabel" class="col-sm-2 col-form-label">so Dien Thoai</label>
    <div class="col-5">
      <form:input type="text" class="form-control" id="colFormLabel" placeholder="soDienThoai" path="soDienThoai"/>
     <form:errors path="soDienThoai" cssClass="text-danger"></form:errors>
    </div>
  </div>
  
    <div class="form-group row" style="justify-content: center;">
    <label for="colFormLabel" class="col-sm-2 col-form-label">thang Bat Dau</label>
    <div class="col-5">
      <form:input type="date" class="form-control" id="colFormLabel" placeholder="thang BD" path="thangBD"/>
     <form:errors path="thangBD" cssClass="text-danger"></form:errors>
    </div>
  </div>
  
    <div class="form-group row" style="justify-content: center;">
    <label for="colFormLabel" class="col-sm-2 col-form-label">So Thang</label>
    <div class="col-5">
      <form:input type="text" class="form-control" id="colFormLabel" placeholder="soThang " path="soThang"/>
     <form:errors path="soThang" cssClass="text-danger"></form:errors>
    </div>
  </div>
  
    <div class="form-group row" style="justify-content: center;">
    <label for="colFormLabel" class="col-sm-2 col-form-label">ngay Dong</label>
    <div class="col-5">
      <form:input type="date" class="form-control" id="colFormLabel" placeholder=" ngay Dong" path="ngayDong"/>
     <form:errors path="ngayDong" cssClass="text-danger"></form:errors>
    </div>
  </div>
  

    <div class="d-flex justify-content-center">
     <button type="submit" class="btn btn-outline-success"  >Submit</button>
    </div>
</form:form>
</div>
</nav>
</div>
</body>
</html>