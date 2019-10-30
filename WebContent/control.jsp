<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!doctype html>
<html lang="ko">
<head>
<meta charset="utf-8">
<title>Index</title>

<!-- core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- 해당 파일의 CSS -->
<link href="/view/checkout/form-validation.css" rel="stylesheet">
<!-- 히든경로 -->
<link rel="stylesheet" type="text/css" href="css/dashboard.css">
<!-- 사이드바 CSS -->
<link href="/view/checkout/dashboard.css" rel="stylesheet">

<!-- blog CSS -->
<link href="/view/checkout/blog.css" rel="stylesheet">

<!-- 상단 바 -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	<div class="container">
		<a class="navbar-brand h3 font-italic" href="index.html">Beer
			Stroage </a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a class="nav-link" href="show.jsp">맥주보기
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="compare.jsp">맥주비교</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="rank.jsp">맥주랭킹</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="map.jsp">내주변
						맥주맛집</a></li>
				<li class="nav-item"><a class="nav-link" href="brew.jsp">지역별
						맥주</a></li>
				<li class="nav-item"><a
					class="nav-link font-weight-bold font-italic" href="login.jsp">LogIn</a>
				</li>
				<li class="nav-item"><a
					class="nav-link font-weight-bold font-italic" href="join.jsp">Join</a>
				</li>
			</ul>
		</div>
	</div>
</nav>
</head>
<!-- 상단 바 끝 -->

<body>

	<div class="container-fluid mt-5">
		<div class="row ">
			<nav class="col-md-2 d-none d-md-block bg-light sidebar mt-5">
				<div class="sidebar-sticky">
				<h5>&nbsp;&nbsp;관리자페이지</h5>
					<ul class="nav flex-column">
						<li class="nav-item"><a class="nav-link active"
							href="beer_mg.jsp"> <span data-feather="home"></span>맥주관리
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#"> <span
								data-feather="file"></span> 회원정보관리
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#"> <span
								data-feather="shopping-cart"></span> QnA관리
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#"> <span
								data-feather="users"></span> 리뷰게시판 관리
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#"> <span
								data-feather="bar-chart-2"></span> 방명록 관리
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#"> <span
								data-feather="layers"></span> 랭킹 관리
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#"> <span
								data-feather="bar-chart-2"></span> 통계자료
						</a></li>
					</ul>
				</div>
			</nav>
		</div>
	</div>


</body>

</html>
