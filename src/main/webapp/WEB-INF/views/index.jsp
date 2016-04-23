
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>openUk</title>
    <link href="/resources/css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
    <link href="/resources/bootstrap-3.3.2-dist/css/bootstrap.css.map" type="text/css" rel="stylesheet" media="all">
    <link href="/resources/css/style.css" type="text/css" rel="stylesheet" media="all">
    <link href="/resources/css/index.css" type="text/css" rel="stylesheet" media="all">
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <link href='//fonts.googleapis.com/css?family=Cabin:400,400italic,500,500italic,600,600italic,700,700italic' rel='stylesheet' type='text/css'>
    <link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
    <script src="/resources/js/jquery-2.1.3.min.js"></script>
</head>
<body>
<!--header-->
<div class="header">
    <div class="container">
    </div>
</div>
<!--//header-->
<!--navigation-->
<div class="top-nav">
    <nav class="navbar navbar-default">
        <div class="container">
            <div class="navbar-header navbar-left">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <h1><a class="navbar-brand wow bounceIn animated" data-wow-delay=".5s" style="visibility: visible; -webkit-animation-delay: .5s;" href="/"><img src="../resources/images/openUk.png" onerror="openUk" width="55%"/></a></h1>
            </div>
            <div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-left">
                    <li class="hvr-bounce-to-bottom active"><a href="/"><spring:message code="main.home"/></a></li>
                    <li class="hvr-bounce-to-bottom "><a href="/"><spring:message code="main.about"/></a></li>
                </ul>
                <div class="clearfix"> </div>
            </div>
        </div>
    </nav>
</div>
<!--navigation-->
<div class="container">
    <div class="page-header">
        <h1 class="text-center"><spring:message code="main.title"/></h1>
    </div>
    <p class="lead text-center"><spring:message code="main.message"/></p>
    <div class="container">
        <div class="row stylish-panel">
            <!-- Test version would be moved to ejs files -->
            <div class="col-md-4">
                <div>
                    <img src="http://lorempixel.com/200/200/abstract/1/" alt="Texto Alternativo" class="img-circle img-thumbnail">
                    <h2>Орфографія</h2>
                    <p>Category description          </p>
                    <a href="#" class="btn btn-primary" title="See more">Почати!</a>
                </div>
            </div>
            <div class="col-md-4">
                <div>
                    <img src="http://lorempixel.com/200/200/abstract/2/" alt="Texto Alternativo" class="img-circle img-thumbnail">
                    <h2>Фразеологія</h2>
                    <p>Category description          </p>
                    <a href="#" class="btn btn-primary" title="See more">Почати!</a>
                </div>
            </div>
            <div class="col-md-4">
                <div>
                    <img src="http://lorempixel.com/200/200/abstract/3/" alt="Texto Alternativo" class="img-circle img-thumbnail">
                    <h2>Лексика</h2>
                    <p>Category description          </p>
                    <a href="#" class="btn btn-primary" title="See more">Почати!</a>
                </div>
            </div>
        </div>
        <!-- /container -->
<script src="/resources/js/bootstrap.js"></script>
</body>
</html>