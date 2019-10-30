<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
     <meta charset="utf-8">
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <link href="view/sign-in/signin.css" rel="stylesheet"> 

  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand h3 font-italic" href="index.html">Beer Stroage</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="show.jsp">∏∆¡÷∫∏±‚
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="compare.jsp">∏∆¡÷∫Ò±≥</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="rank.jsp">∏∆¡÷∑©≈∑</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="map.jsp">≥ª¡÷∫Ø ∏∆¡÷∏¿¡˝</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="brew.jsp">¡ˆø™∫∞ ∏∆¡÷</a>
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

<form class="form-signin">
  <img class="mb-4" src="{{ site.baseurl }}/docs/{{ site.docs_version }}/assets/brand/bootstrap-solid.svg" alt="" width="500" height="72">
  <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
  <label for="User ID" class="sr-only">User ID</label>
  <input type="User ID" id="inputUserID" class="form-control" placeholder="User ID" required autofocus>
  <label for="inputPassword" class="sr-only">Password</label>
  <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
  <div class="checkbox mb-3">
    <label>
      <input type="checkbox" value="remember-me"> Remember me
    </label>
  </div>
  <button class="btn active btn-primary " type="submit">Login</button>
  <button class="btn active btn-primary " type="submit">Join</button>
</form>
