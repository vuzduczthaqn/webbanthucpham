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


    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

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
                                Tất cả sản phẩm
                                <span class="arrow_carrot-down"></span>
                            </div>
                            <form action="chi-tiet-san-pham">
                                <input type="text" placeholder="What do yo u need?" name="searchProduct">
                                <button type="submit" class="site-btn">Tìm kiếm</button>
                            </form>

                        </form>
                    </div>
                    <div class="hero__search__phone">
                        <div class="hero__search__phone__icon">
                            <i class="fa fa-phone"></i>
                        </div>
                        <div class="hero__search__phone__text">
                            <h5>+0346548121</h5>
                            <span>Hỗ trợ 24/7</span>
                        </div>
                    </div>
                </div>
                <div class="hero__item set-bg" data-setbg="<c:url value="/template/web/img/hero/banner.jpg"/>">
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
        <c:if test="${not empty listProduct}">
        <div class="col-lg-12">
            <div class="section-title">
            </div>
            <div class="featured__controls">
                <ul>
                </ul>
            </div>
        </div>
        <div class="row featured__filter" style="display: block" id="contentContainer">
            <c:forEach var="Product" items="${sessionScope.listProduct}" begin="${start-1}" end="${start+2}">
            <form method="get" action="chi-tiet-san-pham?id=${Product.productId}">
                <div class="col-lg-3 col-md-4 col-sm-6 mix oranges fresh-meat">
                    <div class="featured__item">
                        <div class="featured__item__pic set-bg"
                             data-setbg="<c:url value="${Product.pathImg}"/>">
                        </div>
                        <div class="featured__item__text">
                            <h6><a href="chi-tiet-san-pham?id=${Product.productId}">${Product.productName}</a></h6>
                            <h5>${Product.price}</h5>
                        </div>
                    </div>
                </div>
            </form>
            </c:forEach>
        </div>
    </c:if>
    </div>
</section>
<div id="link-product">
    <button id="listProduct" onclick="loadMore()">Xem thêm</button>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script>
    function loadMore(){
        $.ajax({
            url: '<c:url value="api-load"/>',
            type: "GET",
            success: function(data) {
                var row=document.getElementById("contentContainer");
                row.innerHTML+=data;
            }
        });
    }
</script>

</body>
</html>
