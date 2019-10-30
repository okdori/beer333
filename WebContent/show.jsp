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
 
 <!-- 상단 바 -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand h3 font-italic" href="index.html">Beer Stroage

</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="show.jsp">맥주보기
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="compare.jsp">맥주비교</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="rank.jsp">맥주랭킹</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="map.jsp">내주변 맥주맛집</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="brew.jsp">지역별 맥주</a>
          </li>
          <li class="nav-item">
            <a class="nav-link font-weight-bold font-italic" href="login.jsp">LogIn</a>
          </li>
          <li class="nav-item">
            <a class="nav-link font-weight-bold font-italic" href="join.jsp">Join</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
 </head>
  <!-- 상단 바 끝 -->
  
<body>

  <!-- Custom CSS -->
  <link href="css/landing-page.min.css" rel="stylesheet">

  <!-- Masthead -->
  <header class="masthead text-white text-center">
    <div class="overlay"></div>
    <div class="container">
      <div class="row">
        <div class="col-xl-9 text-left">
          <h1 class="mb-5">지금 당신의 맥주를 찾아보세요.</h1>
        </div>
        <div class="col-md-10 col-lg-8 col-xl-7 mx-auto">
          <form>
            <div class="form-row">
              <div class="col-12 col-md-9 mb-2 mb-md-0">
                <input type="email" class="form-control form-control-lg" placeholder="맥주 이름 검색">
              </div>
              <div class="col-12 col-md-3">
                <button type="submit" class="btn btn-block btn-lg btn-dark">검색</button>
              </div>
            </div>
          </form>

<div class="container ">
  <div class="row">
    <div class="col-sm">
                 <select class="custom-select d-block w-30" id="type" required="">
              <option value="">type 선택...</option>
              <option>라거</option>
	<option>람빅</option>
	<option>에일</option>
            </select>
    </div>
    <div class="col-sm">
                 <select class="custom-select d-block w-30" id="type" required="">
              <option value="">type 선택...</option>
              <option>라거</option>
	<option>람빅</option>
	<option>에일</option>
            </select>
    </div>
    <div class="col-sm">
                 <select class="custom-select d-block w-30" id="type" required="">
              <option value="">type 선택...</option>
              <option>라거</option>
	<option>람빅</option>
	<option>에일</option>
            </select>
    </div>
  </div>
</div>

       </div>
      </div>
    </div>
  </header>
​

  <!-- Footer -->
  <footer class="py-2 bg-dark">
    <div class="container">
      <a class="nav-link" span style="color:gray" href="control.jsp"> 관리자페이지 | </a>
      <p class="m-0 text-center text-white">Copyright &copy; Beer Stroage 2019</p>
    </div>
  </footer>




  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
