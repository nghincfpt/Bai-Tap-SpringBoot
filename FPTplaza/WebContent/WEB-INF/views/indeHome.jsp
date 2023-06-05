<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<style type="text/css">
<%@include file="/css/bootstrap.min.css"%>
</style>

<html>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />
<!-- <link -->
<!-- 	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" -->
<!-- 	rel="stylesheet"> -->
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="container" style="padding-top: 10px">

		<div class="shadow-lg p-3 mb-5 bg-body rounded">
			<div align="center">
				<h2 style="color: blue">Phi Chung Cu</h2>
				
					<p style="color: blue">${message}</p>
			
				<div style="display: flex; justify-content: space-between">
					<div>
						<a href="newphichungcu"><i
						class=" btn btn-success fas fa-calendar-plus fa-lg"></i> </a>
					</div>
					<div>
						<form class="form-inline my-2 my-lg-0" method="get"
							action="searchInName" >
							<input class="form-control mr-sm-2" type="search"
								placeholder="Search"  name="keyword">							
							<button class="btn btn-outline-success my-2 my-sm-0"
								type="submit">Search</button>
						</form>
					</div>
				</div>
	
<form action="searchInMa" method="get">
  <div class="form-group row" style="justify-content: center;">
    <label for="colFormLabel" class="col-sm-2 col-form-label">Ma Toa Nha</label>
    <div class="col-5">     
       <select class="form-control" name ="keyword">
      <c:forEach items="${listmatoanha}" var="o">  
      <option  value="${o.maToaNha}" > <c:out value="${o.maToaNha}"></c:out> </option>
      
      </c:forEach>
      </select>      
    </div>
  </div>
  <button class="btn btn-outline-success my-2 my-sm-0"
								type="submit">Search</button>
</form>
				
				<table class="table table-striped">
					<thead>
						<tr>
							<th scope="col"> <a href="?field=matt">Ma  THU PHI </a></th>
							<th scope="col">ma can ho</th>
							<th scope="col"> dien tich</th>
							<th scope="col">ma toan nha </th>
							<th scope="col"><a href="?field=hoTenChuHo">Ho Ten Chu Ho </a></th>
							<th scope="col"> SDT</th>
							<th scope="col"> thang BD</th>
							<th scope="col">so thang </th>
							<th scope="col"> ngay dong</th>
							<th scope="col">tong tien </th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${lists}" var="o">
							<tr>
								<th scope="row">${o.matt}</th>
								<td>${o.maCanHo}</td>
								<td>${o.dienTich}</td>
								<td>${o.maToaNha}</td>
								<td>${o.hoTenChuHo}</td>
								<td>${o.soDienThoai}</td>
								<td>${o.thangBD}</td>
								<td>${o.soThang}</td>
								<td>${o.ngayDong}</td>
								<td>${o.tongTien}</td>
								
								<td><a href="editphichungcu?id=${o.matt}"><i
										class=" btn btn-primary fas fa-edit"></i></a> &nbsp;&nbsp;&nbsp; <a
									href="#" onclick="showMess('${o.matt}')"><i
										class="btn btn-danger fas fa-trash"></i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>

<script>
	function showMess(matt) {
		var option = confirm('are you sure to delete');
		if(option ===true){
			window.location.href='deletematt?matt='+matt;
		}
	}
	</script>
</html>