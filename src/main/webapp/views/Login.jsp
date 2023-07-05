<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 17/06/2023
  Time: 12:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/lib.jsp" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>dang nhap </title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <link rel="stylesheet" href="<c:url value="/template/web/css/stylelogin.css"/>">
</head>

<body>
<div class="wrapper">
    <section class="login">
        <div class="container">
            <div class="box-body">
                <div class="box-login">
                    <label id="title">Đăng nhập</label>
                    <form action="<c:url value='/dang-nhap'/>" method="post">
                        <div class="box-input">
                            <input type="email" name="txtUser" value="" placeholder="Email">
                            <input type="password" name="txtPass" placeholder="Mật khẩu">
                            <a href="#">Quên mật khẩu?</a>
                        </div>
                        <div class="login">
                            <input type="hidden" name="action" value="login">
                            <button type="submit">Dang nhap</button>
                        </div>
                    </form>


                    <label>Đăng nhập với tài khoản</label>
                    <div class="box-icon">
                        <a href="#"><img src="<c:url value="/template/web/Images/google_30px.png"/>" alt=""></a>
                        <a href="#"><img src="<c:url value="/template/web/Images/instagram_30px.png"/>" alt=""></a>
                        <a href="#"><img src="<c:url value="/template/web/Images/twitter_30px.png"/>" alt=""></a>
                    </div>
                    <div class="box-sigup">
                        <label>Chưa có tài khoản?</label>
                        <a href="./sigup.html">Đăng ký ngay</a>
                    </div>
                </div>
            </div>
        </div>
    </section>
</div>
</body>

</html>
