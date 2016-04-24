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

                <title>Вітаємо на порталі OpenUk</title>


</head>
<div id="user" class="user" style="display: none" >
<div width= 100 height = 200>
    <br/>
   <em> Привіт, (нік користувача)</em><br/><br/>

    <div class="container">
        <img src="https://drive.google.com/drive/folders/0B6hzo8nZx92wTlZBbVJQREEyaU0" class="img-circle" alt="Cinque Terre" width = 100 height= 100>
            </div>
    <br/>
    <br/>
   <h4> <span class="label label-pill label-info">Нік: </span></h4> <h5><em></em></h5>
   <h4> <span class="label label-pill label-success">Електронна адреса: </span></h4><h5><em><security:authentication property="principal.username"/></em></h5>
   <h4> <span class="label label-pill label-warning">Статус: </span></h4><h5><em>(тут буде виведено статус користувача) (подумати над зміною кольору при здoбутті нового статусу)</em></h5>
   <h4> <span class="label label-pill label-primary">Бали: </span></h4><h5><em>(тут буде виведено бали користувача)</em></h5>
</div>
</div>