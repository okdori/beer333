<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!doctype html>
<html lang="ko">
  <head>
    <meta charset="EUC-KR">

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



<div style ="margin:70px; padding:2px; font-weight:bold;">
    <div class="container">
      <h1>회원 가입</h1>
    </div>
    <div style="padding:10px;">

      <form class="needs-validation " novalidate>
        <div class="col-md-4 mb-3">
          <label for="id">id를 입력하세요</label>
          <input type="text" class="form-control" id="id" placeholder="영문으로 기재해 주세요" value="" required>
          </div>

          <div class="col-md-4 mb-3">
            <label for="pw">pw를 입력하세요</label>
            <input type="text" class="form-control" id="pw" placeholder="영문, 숫자 혼용 기입 가능" value="" required>
            </div>

            <div class="col-md-4 mb-3">
              <label for="pw">pw 확인</label>
              <input type="text" class="form-control" id="pw" placeholder="비밀번호 확인" value="" required>
            </div>
            <div class="col-md-4 mb-3">
              <button class="btn btn-secondary" type="submit">확인</button>
              </div>

        </div>

  <div class="col-md-4 mb-3">
            <label for="name">이름을 입력하세요</label>
            <input type="text" class="form-control" id="name" placeholder="홍길동" value="" required>
            </div>



   <div class="container">
  <div class="col-md-4 mb-3">
<label for="sex">성별을 입력하세요<span class="text-muted"></span></label>
   <span class="col-md-4 mb-3 custom-radio">
            <input id="sex_m" name="sexMethod" type="radio" class="custom-control-input" checked required>
            <label class="col-md-8 custom-control-label" for="male">남</label>
          </span>
         <span class="col-md-4 mb-3 custom-radio">
            <input id="sex_f" name="sexMethod" type="radio" class="custom-control-input" required>
            <label class="col-md-8 custom-control-label" for="female">여</label>
         <span> </div>
            </div>
<div style="padding:5px;"/>



<div class="col-md-4 mb-3">
          <label for="email">생년월일<span class="text-muted"></span></label>
          <input type="birthday" class="form-control" id="birthday" placeholder="ex)991203">
            <span class="invalid-feedback" style="width: 100%;">
              하이픈 없이 기재해 주세요.
          </div>
<div style="padding:5px;"/>

<div class="col-md-4 mb-3">
          <label for="email">Email <span class="text-muted"></span></label>
          <input type="email" class="form-control" id="email" placeholder="aBc@gmail.com">
        </div>
<div style="padding:5px;"/>

<div class="col-md-4 mb-3">
          <label for="address">주소</label>
          <input type="text" class="form-control" id="address" placeholder="서울시 종로구 효자동" required>
        </div>
 <div style="padding:5px;">
</div>

<div class="col-md-4 mb-3">
        <div class="row">

            <label for="country">직업</label>
            <select class="custom-select d-block w-100" id="job" required>
              <option value="">선택</option>
              <option>학생</option>
	 <option>프리랜서</option>
	 <option>IT</option>
	 <option>자영업</option>
	 <option>디자인</option>
	 <option>기타</option>
           </select>
          </div>
          </div>
        <hr class="mb-4">

      </form>

   <button class="btn btn-warning" type="submit">가입 완료</button>
  </body>
</html>
