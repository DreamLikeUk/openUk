
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
    <script src="/resources/js/ejs.min.js"> </script>
    <script type="text/javascript">
        getMain();
        var user_template = getTemplate("/resources/template/user.ejs");
        var category_template = getTemplate("/resources/template/category.ejs");
        var messages = {
          user:{
              username: '<spring:message code="user.username"/>',
              email: '<spring:message code="user.username"/>'
          },
            category:{
                button: '<spring:message code="category.button"/>'
            }
        };
        function getMain(){
            $.ajax({
                type: "GET",
                url: "/category/",
                dataType : 'json',
                timeout : 100000,
                success : function(data) {
                    console.log("SUCCESS: ", data.result);
                    var html = '';
                    data.result.forEach(function(category){
                        html+= category_template.render({category: category, messages: messages});
                    });
                    $(".row.stylish-panel").html(html);
                },
                error : function(e) {
                    console.log("ERROR: ", e);
                }

            });
        }

        function changeContainer(){
            $(".container.main").html("here");
            $(".text-center").html("text");
            $(".lead.text-center").html("desc");
        }
        function getUserPage(){
            $("#user").show();
        }

        function getTemplate(address){
            return new EJS({url: address});
        }



    </script>
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
                    <security:authorize access="isAnonymous()">
                    <li class="hvr-bounce-to-bottom "><a href="/login"><spring:message code="main.signin"/></a></li>
                    <li class="hvr-bounce-to-bottom "><a href="#"><spring:message code="main.signup"/></a></li>
                    </security:authorize>
                    <li class="hvr-bounce-to-bottom "><a href="#" onclick="changeContainer();"><spring:message code="main.about"/></a></li>
                    <security:authorize access="isAuthenticated()">
                        <li class="hvr-bounce-to-bottom "><a href="#" ><spring:message code="main.user"/></a></li>
                    <li class="hvr-bounce-to-bottom "><a href="/logout"><spring:message code="main.logout"/></a></li>
                    </security:authorize>
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
    <div class="container main">
        <div class="row stylish-panel">
            <!-- Test version would be moved to ejs files -->

        </div>
    </div>
    </div>
    <security:authorize access="isAuthenticated()">
    <jsp:include page="user_home.jsp"/>
    </security:authorize>
        <!-- /container -->
<script src="/resources/js/bootstrap.js"></script>
</body>
</html>