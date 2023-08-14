<%@include file="/common/lib.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<!-- Breadcrumb Section Begin -->
<section class="breadcrumb-section set-bg" data-setbg="img/breadcrumb.jpg">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 text-center">
                <div class="breadcrumb__text">
                    <h2>Vegetable’s Package</h2>
                    <div class="breadcrumb__option">
                        <a href="trang-chu">Home</a>
                        <a href="danh-sach-san-pham">Vegetables</a>
                        <span>Vegetable’s Package</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Breadcrumb Section End -->
<c:if test="${ not empty Product}" >
<!-- Product Details Section Begin -->
<section class="product-details spad">
    <div class="container">
        <div class="row">
            <div class="col-lg-6 col-md-6">
                <div class="product__details__pic">
                    <div class="product__details__pic__item">
                        <img class="product__details__pic__item--large"
                             src="<c:url value="${Product.pathImg}"/>" alt="">
                    </div>
                </div>
            </div>
            <div class="col-lg-6 col-md-6">
                <form method="post" id="add_cart">
                    <div class="product__details__text">
                        <h3>${Product.productName}</h3>
                        <div class="product__details__rating">
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star-half-o"></i>
                        </div>
                        <div class="product__details__price">${Product.price}</div>
                        <p>${Product.describe}</p>
                        <div class="product__details__quantity">
                            <div class="quantity">
                                <div class="pro-qty">
                                    <input type="text" value="1" id="quantity">
                                </div>
                            </div>
                        </div>
                        <input type="hidden" value="${Product.productId}">
                        <c:if test="${empty USER}">
                            <a href="<c:url value="/dang-nhap?action=login"/>" class="primary-btn">ADD TO CART</a>
                        </c:if>
                        <c:if test="${not empty USER}">
                            <input type="button" class="primary-btn" value="ADD TO CART" id="ip_success">
                        </c:if>

                    </div>
                </form>

            </div>
        </div>
    </div>
</section>
</c:if>
<script type="text/javascript">
    $('#ip_success').on("click",function(){
        let id=${Product.productId};
        let quantity=document.getElementById("quantity").value;
            $.ajax({
                url:'<c:url value="gio-hang"/>',
                method:"POST",
                data : {
                    idProduct:id,
                    quantity:quantity
                },
                success:function (data){
                    alert('thanh cong')
                }
            })
    });
</script>
</body>
</html>
