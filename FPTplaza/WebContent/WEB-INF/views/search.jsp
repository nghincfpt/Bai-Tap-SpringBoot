<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<style type="text/css">

</style>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">

<meta charset="ISO-8859-1">
<title>Seach Result</title>
</head>
<body>

	<div class="container">

		<div class="shadow-lg p-3 mb-5 bg-body rounded">
			<div align="center">
				<h2 style="">Search for Name</h2>
				
				
				<table class="table table-striped">
					<thead>
						<tr>
							<th scope="col">matt</th>
							<th scope="col">maCanHo</th>
							<th scope="col">dienTich</th>
							<th scope="col">maToaNha</th>
							<th scope="col">hoTenChuHo</th>
							<th scope="col">soDienThoai</th>
							<th scope="col">thangBD</th>
							<th scope="col">soThang</th>
							<th scope="col">ngayDong</th>
							<th scope="col">tongTien</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${result}" var="o">
							<tr>
			    	<th scope="row">${o.matt}</th>
								<td>${o.maCanHo}</td>
								<td>${o.dienTich}</td>
								<th>${o.maToaNha}</th>
								<td>${o.hoTenChuHo}</td>
								<td>${o.soDienThoai}</td>
								<th>${o.thangBD}</th>
								<td>${o.soThang}</td>
								<td>${o.ngayDong}</td>
								<td>${o.tongTien}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>