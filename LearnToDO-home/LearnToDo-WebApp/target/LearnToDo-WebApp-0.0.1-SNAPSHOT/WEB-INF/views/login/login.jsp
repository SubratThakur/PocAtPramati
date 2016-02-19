<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<spring:url value="/css/login/style.css" var="LoginCss" />
<spring:url value="/css/login/angularAnimate.css" var="angularAnimateCss" />
<spring:url value="/js/lib/angularjs/angular.min.js" var="angularJs" />
<spring:url value="/js/lib/angularjs/angular-animate.min.js" var="angularanimateJs" />
<spring:url value="/js/login/login.js" var="loginJs" />
<spring:url value="/css/bootstrap/bootstrap.min.css" var="bootstrapCss" />
<spring:url value="/js/lib/jquery/jquery-2.2.0.min.js" var="jqueryJs" />
<spring:url value="/js/lib/bootstrap/bootstrap.min.js" var="bootstrapJs" />
<link href="${LoginCss}" rel="stylesheet" />
<link href="${angularAnimateCss}" rel="stylesheet"/>
<script type="text/javascript" src="${angularJs}"></script>
<script type="text/javascript" src="${angularanimateJs}"></script>
<script type="text/javascript" src="${loginJs}"></script>
<script type="text/javascript" src="${jqueryJs}"></script>
<script type="text/javascript" src="${bootstrapJs}"></script>
<title>LearnToDo-Login</title>
</head>
<body ng-app="loginLearnToDo">
	<div class="container" ng-controller="loginController">
	<form name="loginform">
		<div class="top">
			<h1 id="title" class="hidden"><span id="logo">Learn<span>ToDo</span></span></h1>
		</div>
		<div class="login-box animated fadeInUp" ng-hide=initPage>
			<div class="box-header">
				<h2>Log In</h2>
			</div>
			<label for="username">Email</label>
			<br/>
			<input id="username" name="loginEmail" ng-model="LoginDTO.lgnUserEmail" type="email" required>
			<br/>
			<label for="password">Password</label>
			<br/>
			<input type="password" id="password" name="LoginDTO.lgnUserPwd" ng-model="loginPwd" ng-change="analyze(loginPwd)" tooltip="Some text" 
            tooltip-trigger="{{{true: 'mouseenter', false: 'never'}[loginform.password.$invalid]}}" required>
			<br/>
			<button  ng-click="getSignIn()">Sign In</button>
			<button  ng-click="registernewUser()">Register</button>
			<br/>
			<a href="#"><p class="small">Forgot your password?</p></a>
		</div>
	</form>
	
	<modal title="Enter Your Details" ng-hide="showModal">
    <form role="form">
        <label for="name">Name</label>
        <br/>
        <input class="form-control" id="name" placeholder="Full Name" />
        <br/>
        <label for="password">Confirm Password</label>
        <br/>
        <input type="password" class="form-control" id="password" placeholder="Password" />
        <br/>
        <button class="btn btn-default" ng-click="registernewUser()">Back</button>
      <button class="btn btn-default"ng-click="registerUser()">Register</button>
    </form>
  </modal>
	</div>
</body>
</html>