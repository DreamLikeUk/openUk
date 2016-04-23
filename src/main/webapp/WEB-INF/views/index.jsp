
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Old+Standard+TT" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

    <link rel="stylesheet" type="text/css" href="css/index.css ">

    <title><spring:message code="main.title"/> </title>

</head>
<body>
<!-- All navigation should go to header -->
    <ul class="nav nav-tabs">
        <li role="presentation" class="active"><a href="#"><spring:message code="main.home"/> </a></li>

        <li role="presentation"><a href="about.html"><spring:message code="main.about"/></a></li>
        <li role="presentation"><a href="user_home.html"><spring:message code="main.user"/></a></li>
    </ul>
    <br/>
    <h5 style="text-align:right;"><a href="#" >Увійти</a></h5>
    <h5><a href="#" align="rightright">Зареєструватися</a></h5>
    <br/>
<!-- Up to this point -->
    <h3><label align="middle" style="font-family:verdana;">Вітаємо на порталі OpenUk<br/>
    Для вдосконалення своїх знань, будь ласка, оберіть категорію</label></h3>
    <div class="list-group" width="80" height="200" align="middle">
    <a href="orthography.jsp" class="list-group-item active">Орфографія</a>
    <a href="phraseology.jsp" class="list-group-item">Фразеологія</a>
    <a href="vocabulary.jsp" class="list-group-item">Лексика</a>
    <a href="editing.jsp" class="list-group-item">Редагування</a>
    <a href="interestingFacts.jsp" class="list-group-item">Цікавинки</a>
    </div>

</body>
</html>
