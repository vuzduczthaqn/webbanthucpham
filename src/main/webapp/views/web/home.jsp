<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 29/06/2023
  Time: 5:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/lib.jsp" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="description" content="Ogani Template">
    <meta name="keywords" content="Ogani, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ogani | Template</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="<c:url value="/template/web/css/bootstrap.min.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/template/web/css/font-awesome.min.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/template/web/css/elegant-icons.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/template/web/css/nice-select.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/template/web/css/jquery-ui.min.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/template/web/css/owl.carousel.min.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/template/web/css/slicknav.min.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/template/web/css/style.css"/>" type="text/css">
</head>
<body>
<section class="hero">
    <div class="container">
        <div class="row">
            <div class="col-lg-3">
                <div class="hero__categories">
                    <div class="hero__categories__all">
                        <i class="fa fa-bars"></i>
                        <span>All departments</span>
                    </div>
                    <ul>
                        <li><a href="#">Fresh Meat</a></li>
                        <li><a href="#">Vegetables</a></li>
                        <li><a href="#">Fruit & Nut Gifts</a></li>
                        <li><a href="#">Fresh Berries</a></li>
                        <li><a href="#">Ocean Foods</a></li>
                        <li><a href="#">Butter & Eggs</a></li>
                        <li><a href="#">Fastfood</a></li>
                        <li><a href="#">Fresh Onion</a></li>
                        <li><a href="#">Papayaya & Crisps</a></li>
                        <li><a href="#">Oatmeal</a></li>
                        <li><a href="#">Fresh Bananas</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-9">
                <div class="hero__search">
                    <div class="hero__search__form">
                        <form action="#">
                            <div class="hero__search__categories">
                                All Categories
                                <span class="arrow_carrot-down"></span>
                            </div>
                            <input type="text" placeholder="What do yo u need?">
                            <button type="submit" class="site-btn">SEARCH</button>
                        </form>
                    </div>
                    <div class="hero__search__phone">
                        <div class="hero__search__phone__icon">
                            <i class="fa fa-phone"></i>
                        </div>
                        <div class="hero__search__phone__text">
                            <h5>+65 11.188.888</h5>
                            <span>support 24/7 time</span>
                        </div>
                    </div>
                </div>
                <div class="hero__item set-bg" data-setbg="img/hero/banner.jpg">
                    <div class="hero__text">
                        <span>FRUIT FRESH</span>
                        <h2>Vegetable <br/>100% Organic</h2>
                        <p>Free Pickup and Delivery Available</p>
                        <a href="#" class="primary-btn">SHOP NOW</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<section class="categories">
    <div class="container">
        <div class="row">
            <div class="categories__slider owl-carousel">
                <div class="col-lg-3">
                    <div class="categories__item set-bg"
                         data-setbg="<c:url value="/template/web/img/categories/cat-1.jpg"/>">
                        <h5><a href="#">Fresh Fruit</a></h5>
                    </div>
                </div>
                <div class="col-lg-3">
                    <div class="categories__item set-bg"
                         data-setbg="<c:url value="/template/web/img/categories/cat-2.jpg"/>">
                        <h5><a href="#">Dried Fruit</a></h5>
                    </div>
                </div>
                <div class="col-lg-3">
                    <div class="categories__item set-bg"
                         data-setbg="<c:url value="/template/web/img/categories/cat-3.jpg"/>">
                        <h5><a href="#">Vegetables</a></h5>
                    </div>
                </div>
                <div class="col-lg-3">
                    <div class="categories__item set-bg"
                         data-setbg="<c:url value="/template/web/img/categories/cat-4.jpg"/>">
                        <h5><a href="#">drink fruits</a></h5>
                    </div>
                </div>
                <div class="col-lg-3">
                    <div class="categories__item set-bg"
                         data-setbg="<c:url value="/template/web/img/categories/cat-5.jpg"/>">
                        <h5><a href="#">drink fruits</a></h5>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Categories Section End -->

<!-- Featured Section Begin -->
<section class="featured spad">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="section-title">
                    <h2>Featured Product</h2>
                </div>
                <div class="featured__controls">
                    <ul>
                        <li class="active" data-filter="*">All</li>
                        <li data-filter=".oranges">Oranges</li>
                        <li data-filter=".fresh-meat">Fresh Meat</li>
                        <li data-filter=".vegetables">Vegetables</li>
                        <li data-filter=".fastfood">Fastfood</li>
                    </ul>
                </div>
            </div>
        </div>
        <c:if test="${not empty listProduct}">
            <c:forEach var="Product" items="${listProduct}">
                <div class="row featured__filter" style="display: block">
                    <c:if test="${Product.type.getTypeId()=='FM'}">
                        <form method="get" action="chi-tiet-san-pham?id=${Product.productId}">
                            <div class="col-lg-3 col-md-4 col-sm-6 mix fresh-meat">
                                <div class="featured__item">
                                    <div class="featured__item__pic set-bg"
                                         data-setbg="<c:url value="${Product.pathImg}"/>">
                                        <ul class="featured__item__pic__hover">
                                            <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                        </ul>
                                    </div>
                                    <div class="featured__item__text">
                                        <h6><a href="#">${Product.productName}</a></h6>
                                        <h5>${Product.price}</h5>
                                    </div>
                                </div>
                            </div>

                        </form>
                    </c:if>
                    <c:if test="${Product.type.getTypeId()=='FF'}">
                        <form method="get" action="chi-tiet-san-pham?id=${Product.productId}">
                            <div class="col-lg-3 col-md-4 col-sm-6 mix fastfood">
                                <div class="featured__item">
                                    <div class="featured__item__pic set-bg"
                                         data-setbg="<c:url value="${Product.pathImg}"/>">
                                        <ul class="featured__item__pic__hover">
                                            <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                        </ul>
                                    </div>
                                    <div class="featured__item__text">
                                        <h6><a href="#">${Product.productName}</a></h6>
                                        <h5>${Product.price}</h5>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </c:if>
                    <c:if test="${Product.type.getTypeId()=='FO'}">
                        <form method="get" action="chi-tiet-san-pham?id=${Product.productId}">
                            <div class="col-lg-3 col-md-4 col-sm-6 mix oranges">
                                <div class="featured__item">
                                    <div class="featured__item__pic set-bg"
                                         data-setbg="<c:url value="${Product.pathImg}"/>">
                                        <ul class="featured__item__pic__hover">
                                            <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                            <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                            <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                        </ul>
                                    </div>
                                    <div class="featured__item__text">
                                        <h6><a href="#">${Product.productName}</a></h6>
                                        <h5>${Product.price}</h5>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </c:if>
                    <c:if test="${true}">
                        <form method="get" action="chi-tiet-san-pham?id=${Product.productId}">
                            <div class="col-lg-3 col-md-4 col-sm-6 mix vegetables">
                                <div class="featured__item">
                                    <div class="featured__item__pic set-bg"
                                         data-setbg="<c:url value="${Product.pathImg}"/>">
                                        <ul class="featured__item__pic__hover">
                                            <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                            <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                            <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                        </ul>
                                    </div>
                                    <div class="featured__item__text">
                                        <h6><a href="chi-tiet-san-pham?id=${Product.productId}">${Product.productName}</a></h6>
                                        <h5>${Product.price}</h5>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </c:if>
                </div>
            </c:forEach>
        </c:if>
    </div>
</section>
<!-- Featured Section End -->
</body>
</html>
