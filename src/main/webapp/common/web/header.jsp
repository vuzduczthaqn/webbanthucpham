<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 29/06/2023
  Time: 5:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Page Preloder -->
<div id="preloder">
    <div class="loader"></div>
</div>

<!-- Humberger Begin -->
<div class="humberger__menu__overlay"></div>
<div class="humberger__menu__wrapper">
    <div class="humberger__menu__logo">
        <a href="#"><img src="<c:url value="/template/web/img/logo.png"/>" alt=""></a>
    </div>
    <div class="humberger__menu__widget">
        <c:if test="${empty USER}">
            <div class="header__top__right__auth">
                <a href="<c:url value="/dang-nhap?action=login"/> "><i class="fa fa-user"></i>Đăng nhập</a>
            </div>
        </c:if>
        <c:if test="${not empty USER}">
            <div class="header__top__right__auth">
                <i class="fa fa-user"></i> Xin chào , <c:out value="${USER.getUsername()}"/>|<a
                    href="<c:url value="/thoat?action=logout"/> ">Đăng xuất</a>
            </div>
        </c:if>
    </div>
    <nav class="humberger__menu__nav mobile-menu">
        <ul>
            <li class="active"><a href="trang-chu">Trang chủ</a></li>
            <li><a href="gio-hang">Giỏ hàng</a></li>
            <li><a href="./blog.html">Blog</a></li>
            <li><a href="./contact.html">Liên hệ</a></li>
        </ul>
    </nav>
    <div id="mobile-menu-wrap"></div>
    <div class="header__top__right__social">
        <a href="#"><i class="fa fa-facebook"></i></a>
        <a href="#"><i class="fa fa-twitter"></i></a>
        <a href="#"><i class="fa fa-linkedin"></i></a>
        <a href="#"><i class="fa fa-pinterest-p"></i></a>
    </div>
    <div class="humberger__menu__contact">
        <ul>
            <li><i class="fa fa-envelope"></i> hello@colorlib.com</li>
            <li>Free Shipping for all Order of $99</li>
        </ul>
    </div>
</div>
<!-- Humberger End -->

<!-- Header Section Begin -->
<header class="header">
    <div class="header__top">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-6">
                    <div class="header__top__left">
                        <ul>
                            <li><i class="fa fa-envelope"></i> hello@colorlib.com</li>
                            <li>Free Shipping for all Order of $99</li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-6 col-md-6">
                    <div class="header__top__right">
                        <div class="header__top__right__social">
                            <a href="#"><i class="fa fa-facebook"></i></a>
                            <a href="#"><i class="fa fa-twitter"></i></a>
                            <a href="#"><i class="fa fa-linkedin"></i></a>
                            <a href="#"><i class="fa fa-pinterest-p"></i></a>
                        </div>
                        <c:if test="${empty USER}">
                            <div class="header__top__right__auth">
                                <a href="<c:url value="/dang-nhap?action=login"/> "><i class="fa fa-user"></i>Đăng nhập</a>
                            </div>
                        </c:if>
                        <c:if test="${not empty USER}">
                            <div class="header__top__right__auth">
                                <i class="fa fa-user"></i> Xin chào , <c:out value="${USER.getUsername()}"/>|<a
                                    href="<c:url value="/thoat?action=logout"/>">Đăng xuất</a>
                            </div>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-lg-3">
                <div class="header__logo">
                    <a href="./index.html"><img src="<c:url value="/template/web/img/logo.png"/> " alt=""></a>
                </div>
            </div>
            <div class="col-lg-6">
                <nav class="header__menu">
                    <ul>
                        <li class="active"><a href="trang-chu">Trang chủ</a></li>
                        <li><a href="gio-hang">Giỏ hàng</a></li>
                        <li><a href="#">blog</a></li>
                        <li><a href="#">Liên hệ</a></li>
                    </ul>
                </nav>
            </div>
        </div>
        <div class="humberger__open">
            <i class="fa fa-bars"></i>
        </div>
    </div>
</header>
<!-- Header Section End -->

