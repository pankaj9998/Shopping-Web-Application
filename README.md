<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org"
      th:replace="~{base::layout(~{::section})}">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Premium E-Commerce Experience</title>
</head>
<body>
<section>
    <!-- Premium Hero Carousel with Overlay Text -->
    <div class="hero-carousel-container position-relative mb-5">
        <div id="carouselExample" class="carousel slide carousel-fade" data-bs-ride="carousel">
            <div class="carousel-indicators">
                <button type="button" data-bs-target="#carouselExample" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                <button type="button" data-bs-target="#carouselExample" data-bs-slide-to="1" aria-label="Slide 2"></button>
                <button type="button" data-bs-target="#carouselExample" data-bs-slide-to="2" aria-label="Slide 3"></button>
            </div>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <div class="overlay-gradient"></div>
                    <img src="img/ecom1.png" class="d-block w-100" alt="Premium Shopping Experience"
                         style="height: 500px; object-fit: cover;">
                    <div class="carousel-caption d-none d-md-block text-start animate__animated animate__fadeInUp">
                        <h1 class="display-4 fw-bold">Discover What's New</h1>
                        <p class="lead">Explore our latest collection of premium products.</p>
                        <button class="btn btn-primary btn-lg shadow">Shop Now</button>
                    </div>
                </div>
                <div class="carousel-item">
                    <div class="overlay-gradient"></div>
                    <img src="img/ecom3.jpg" class="d-block w-100" alt="Special Offers"
                         style="height: 500px; object-fit: cover;">
                    <div class="carousel-caption d-none d-md-block text-start animate__animated animate__fadeInUp">
                        <h1 class="display-4 fw-bold">Special Offers</h1>
                        <p class="lead">Limited time deals on exclusive items.</p>
                        <button class="btn btn-primary btn-lg shadow">View Deals</button>
                    </div>
                </div>
                <div class="carousel-item">
                    <div class="overlay-gradient"></div>
                    <img src="img/ecom2.jpg" class="d-block w-100" alt="Premium Collection"
                         style="height: 500px; object-fit: cover;">
                    <div class="carousel-caption d-none d-md-block text-start animate__animated animate__fadeInUp">
                        <h1 class="display-4 fw-bold">Premium Collection</h1>
                        <p class="lead">Handpicked quality products for discerning customers.</p>
                        <button class="btn btn-primary btn-lg shadow">Explore</button>
                    </div>
                </div>
            </div>
            <button class="carousel-control-prev" type="button"
                    data-bs-target="#carouselExample" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button"
                    data-bs-target="#carouselExample" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>
    </div>

    <!-- Featured Benefits Section -->
    <div class="container mb-5">
        <div class="row g-4 text-center">
            <div class="col-md-3">
                <div class="feature-box p-4 rounded-4 bg-light">
                    <i class="bi bi-truck fs-1 text-primary"></i>
                    <h5 class="mt-3">Free Shipping</h5>
                    <p class="text-muted small mb-0">On orders over ₹3,999</p>
                </div>
            </div>
            <div class="col-md-3">
                <div class="feature-box p-4 rounded-4 bg-light">
                    <i class="bi bi-shield-check fs-1 text-primary"></i>
                    <h5 class="mt-3">Secure Payment</h5>
                    <p class="text-muted small mb-0">100% secure checkout</p>
                </div>
            </div>
            <div class="col-md-3">
                <div class="feature-box p-4 rounded-4 bg-light">
                    <i class="bi bi-arrow-repeat fs-1 text-primary"></i>
                    <h5 class="mt-3">Easy Returns</h5>
                    <p class="text-muted small mb-0">30 day return policy</p>
                </div>
            </div>
            <div class="col-md-3">
                <div class="feature-box p-4 rounded-4 bg-light">
                    <i class="bi bi-headset fs-1 text-primary"></i>
                    <h5 class="mt-3">24/7 Support</h5>
                    <p class="text-muted small mb-0">Always here to help</p>
                </div>
            </div>
        </div>
    </div>

    <!-- Stylish Category Module -->
    <div class="container mb-5 py-5">
        <div class="row mb-4">
            <div class="col-lg-6">
                <h2 class="section-title display-6 fw-bold">Shop by <span class="text-primary">Category</span></h2>
                <div class="title-underline"></div>
            </div>
            <div class="col-lg-6 text-end d-none d-lg-block">
                <a href="#" class="btn btn-outline-primary rounded-pill">View All Categories</a>
            </div>
        </div>

        <div class="row g-4">
            <!-- Dynamic Categories -->
            <div class="col-6 col-sm-4 col-md-3 col-lg-2" th:each="c:${category}">
                <div class="category-card">
                    <div class="card h-100 border-0 category-hover">
                        <div class="category-img-wrapper">
                            <img th:src="@{'img/category_img/'+${c.imageName}}" class="card-img-top"
                                 alt="Category" style="height: 160px; object-fit: contain;">
                        </div>
                        <div class="card-body text-center p-3">
                            <a th:href="@{'/products?category='+${c.name}}" class="category-title fw-semibold stretched-link">[[${c.name}]]</a>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Static Categories with Visual Enhancement -->
            <div class="col-6 col-sm-4 col-md-3 col-lg-2">
                <div class="category-card">
                    <div class="card h-100 border-0 category-hover">
                        <div class="category-img-wrapper">
                            <img src="img/category_img/laptop.jpg" class="card-img-top"
                                 alt="Laptop" style="height: 160px; object-fit: contain;">
                        </div>
                        <div class="card-body text-center p-3">
                            <a href="#" class="category-title fw-semibold stretched-link">Laptop</a>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-6 col-sm-4 col-md-3 col-lg-2">
                <div class="category-card">
                    <div class="card h-100 border-0 category-hover">
                        <div class="category-img-wrapper">
                            <img src="img/category_img/mobile.png" class="card-img-top"
                                 alt="Mobile" style="height: 160px; object-fit: contain;">
                        </div>
                        <div class="card-body text-center p-3">
                            <a href="#" class="category-title fw-semibold stretched-link">Mobile</a>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-6 col-sm-4 col-md-3 col-lg-2">
                <div class="category-card">
                    <div class="card h-100 border-0 category-hover">
                        <div class="category-img-wrapper">
                            <img src="img/category_img/groccery.jpg" class="card-img-top"
                                 alt="Grocery" style="height: 160px; object-fit: contain;">
                        </div>
                        <div class="card-body text-center p-3">
                            <a href="#" class="category-title fw-semibold stretched-link">Grocery</a>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-6 col-sm-4 col-md-3 col-lg-2">
                <div class="category-card">
                    <div class="card h-100 border-0 category-hover">
                        <div class="category-img-wrapper">
                            <img src="img/category_img/electronics.jpg" class="card-img-top"
                                 alt="Electronics" style="height: 160px; object-fit: contain;">
                        </div>
                        <div class="card-body text-center p-3">
                            <a href="#" class="category-title fw-semibold stretched-link">Electronics</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Premium Banner Section -->
    <div class="container mb-5">
        <div class="row g-4">
            <div class="col-md-6">
                <div class="promo-banner position-relative rounded-4 overflow-hidden">
                    <img src="img/ecom1.png" class="w-100" alt="Special Offer" style="height: 250px; object-fit: cover;">
                    <div class="promo-content position-absolute top-0 start-0 w-100 h-100 d-flex flex-column justify-content-center p-4">
                        <h3 class="text-white fw-bold mb-2">New Arrivals</h3>
                        <p class="text-white mb-3">Check out our latest collection</p>
                        <a href="#" class="btn btn-light btn-sm rounded-pill px-4 align-self-start">Shop Now</a>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="promo-banner position-relative rounded-4 overflow-hidden">
                    <img src="img/ecom2.jpg" class="w-100" alt="Special Offer" style="height: 250px; object-fit: cover;">
                    <div class="promo-content position-absolute top-0 start-0 w-100 h-100 d-flex flex-column justify-content-center p-4">
                        <h3 class="text-white fw-bold mb-2">Special Deals</h3>
                        <p class="text-white mb-3">Up to 50% off select items</p>
                        <a href="#" class="btn btn-light btn-sm rounded-pill px-4 align-self-start">View Deals</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Premium Latest Product Module -->
    <div class="container-fluid bg-light py-5">
        <div class="container">
            <div class="row mb-4">
                <div class="col-lg-6">
                    <h2 class="section-title display-6 fw-bold">Latest <span class="text-primary">Products</span></h2>
                    <div class="title-underline"></div>
                </div>
                <div class="col-lg-6 text-lg-end">
                    <ul class="nav nav-pills product-filter justify-content-lg-end mb-3">
                        <li class="nav-item">
                            <a class="nav-link active rounded-pill px-4" href="#">All</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link rounded-pill px-4" href="#">Featured</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link rounded-pill px-4" href="#">New Arrivals</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link rounded-pill px-4" href="#">On Sale</a>
                        </li>
                    </ul>
                </div>
            </div>

            <div class="row g-4">
                <!-- Dynamic Products with enhanced design -->
                <div class="col-6 col-md-4 col-lg-3" th:each="p:${products}">
                    <div class="product-card card h-100 border-0 shadow-sm">
                        <div class="product-badge bg-primary text-white position-absolute top-0 end-0 m-2 px-2 py-1 rounded-pill small">New</div>
                        <div class="product-wishlist position-absolute top-0 start-0 m-2">
                            <button class="btn btn-light btn-sm rounded-circle shadow-sm"><i class="bi bi-heart"></i></button>
                        </div>
                        <div class="text-center p-4">
                            <img th:src="@{'img/product_img/'+${p.image}}" class="img-fluid product-img"
                                 alt="Product" style="height: 180px; object-fit: contain;">
                        </div>
                        <div class="card-body pb-0">
                            <div class="d-flex justify-content-between mb-2">
                                <div class="product-category small text-muted">Category</div>
                                <div class="product-rating">
                                    <i class="bi bi-star-fill text-warning"></i>
                                    <i class="bi bi-star-fill text-warning"></i>
                                    <i class="bi bi-star-fill text-warning"></i>
                                    <i class="bi bi-star-fill text-warning"></i>
                                    <i class="bi bi-star text-warning"></i>
                                </div>
                            </div>
                            <h5 class="card-title">
                                <a th:href="@{'/product/'+${p.id}}" class="text-decoration-none text-dark product-title stretched-link">[[${p.title}]]</a>
                            </h5>
                            <div class="d-flex justify-content-between align-items-center mt-3">
                                <div class="product-price">
                                    <span class="fw-bold text-primary">₹7,999</span>
                                    <span class="small text-decoration-line-through text-muted ms-2">₹9,999</span>
                                </div>
                            </div>
                        </div>
                        <div class="card-footer bg-transparent border-0 pt-0">
                            <div class="d-grid">
                                <button class="btn btn-outline-primary">Add to Cart</button>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Static Products with enhanced design -->
                <div class="col-6 col-md-4 col-lg-3">
                    <div class="product-card card h-100 border-0 shadow-sm">
                        <div class="product-badge bg-danger text-white position-absolute top-0 end-0 m-2 px-2 py-1 rounded-pill small">Sale</div>
                        <div class="product-wishlist position-absolute top-0 start-0 m-2">
                            <button class="btn btn-light btn-sm rounded-circle shadow-sm"><i class="bi bi-heart"></i></button>
                        </div>
                        <div class="text-center p-4">
                            <img src="img/product_img/laptop.jpg" class="img-fluid product-img"
                                 alt="HP Laptop" style="height: 180px; object-fit: contain;">
                        </div>
                        <div class="card-body pb-0">
                            <div class="d-flex justify-content-between mb-2">
                                <div class="product-category small text-muted">Laptops</div>
                                <div class="product-rating">
                                    <i class="bi bi-star-fill text-warning"></i>
                                    <i class="bi bi-star-fill text-warning"></i>
                                    <i class="bi bi-star-fill text-warning"></i>
                                    <i class="bi bi-star-fill text-warning"></i>
                                    <i class="bi bi-star-half text-warning"></i>
                                </div>
                            </div>
                            <h5 class="card-title">
                                <a href="#" class="text-decoration-none text-dark product-title stretched-link">HP Laptop with Intel Core i7</a>
                            </h5>
                            <div class="d-flex justify-content-between align-items-center mt-3">
                                <div class="product-price">
                                    <span class="fw-bold text-primary">₹74,999</span>
                                    <span class="small text-decoration-line-through text-muted ms-2">₹89,999</span>
                                </div>
                            </div>
                        </div>
                        <div class="card-footer bg-transparent border-0 pt-0">
                            <div class="d-grid">
                                <button class="btn btn-outline-primary">Add to Cart</button>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-6 col-md-4 col-lg-3">
                    <div class="product-card card h-100 border-0 shadow-sm">
                        <div class="product-badge bg-success text-white position-absolute top-0 end-0 m-2 px-2 py-1 rounded-pill small">Featured</div>
                        <div class="product-wishlist position-absolute top-0 start-0 m-2">
                            <button class="btn btn-light btn-sm rounded-circle shadow-sm"><i class="bi bi-heart"></i></button>
                        </div>
                        <div class="text-center p-4">
                            <img src="img/product_img/electronics.jpg" class="img-fluid product-img"
                                 alt="Electronics" style="height: 180px; object-fit: contain;">
                        </div>
                        <div class="card-body pb-0">
                            <div class="d-flex justify-content-between mb-2">
                                <div class="product-category small text-muted">Electronics</div>
                                <div class="product-rating">
                                    <i class="bi bi-star-fill text-warning"></i>
                                    <i class="bi bi-star-fill text-warning"></i>
                                    <i class="bi bi-star-fill text-warning"></i>
                                    <i class="bi bi-star-fill text-warning"></i>
                                    <i class="bi bi-star text-warning"></i>
                                </div>
                            </div>
                            <h5 class="card-title">
                                <a href="#" class="text-decoration-none text-dark product-title stretched-link">Premium Wireless Headphones</a>
                            </h5>
                            <div class="d-flex justify-content-between align-items-center mt-3">
                                <div class="product-price">
                                    <span class="fw-bold text-primary">₹12,999</span>
                                    <span class="small text-decoration-line-through text-muted ms-2">₹16,499</span>
                                </div>
                            </div>
                        </div>
                        <div class="card-footer bg-transparent border-0 pt-0">
                            <div class="d-grid">
                                <button class="btn btn-outline-primary">Add to Cart</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="text-center mt-5">
                <a href="#" class="btn btn-primary btn-lg rounded-pill px-5">View All Products</a>
            </div>
        </div>
    </div>

    <!-- Newsletter Section -->
    <div class="container my-5 py-5">
        <div class="row justify-content-center">
            <div class="col-lg-8">
                <div class="newsletter-box text-center p-5 rounded-4 bg-gradient">
                    <h3 class="mb-3 text-white">Subscribe to Our Newsletter</h3>
                    <p class="text-white mb-4">Get the latest updates on new products and special offers</p>
                    <div class="input-group mb-3">
                        <input type="email" class="form-control form-control-lg rounded-pill" placeholder="Enter your email address">
                        <button class="btn btn-light rounded-pill px-4 ms-2" type="button">Subscribe</button>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Custom CSS for enhanced visual appeal -->
    <style>
        /* Add Bootstrap Icons CDN */
        @import url("https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.0/font/bootstrap-icons.css");

        /* Add Animate.css for animations */
        @import url("https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css");

        /* Improved design elements */
        :root {
            --primary-color: #4e73df;
            --primary-dark: #2e59d9;
            --secondary-color: #f8f9fa;
            --accent-color: #ffc107;
        }

        /* Enhanced carousel */
        .hero-carousel-container {
            margin-bottom: 3rem;
        }

        .carousel-item {
            position: relative;
        }

        .overlay-gradient {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: linear-gradient(90deg, rgba(0,0,0,0.6) 0%, rgba(0,0,0,0) 100%);
            z-index: 1;
        }

        .carousel-caption {
            z-index: 2;
            max-width: 550px;
            bottom: 20%;
            left: 10%;
        }

        /* Section title styling */
        .section-title {
            position: relative;
            margin-bottom: 1rem;
        }

        .title-underline {
            width: 80px;
            height: 4px;
            background-color: var(--primary-color);
            border-radius: 2px;
            margin-bottom: 2rem;
        }

        /* Feature boxes */
        .feature-box {
            transition: all 0.3s ease;
            height: 100%;
        }

        .feature-box:hover {
            transform: translateY(-10px);
            box-shadow: 0 10px 30px rgba(0,0,0,0.08);
        }

        /* Category cards */
        .category-card {
            margin-bottom: 1rem;
        }

        .category-img-wrapper {
            padding: 1rem;
            background-color: var(--secondary-color);
            transition: all 0.3s ease;
            border-radius: 8px 8px 0 0;
        }

        .category-hover:hover .category-img-wrapper {
            background-color: #e9ecef;
        }

        .category-hover {
            transition: all 0.3s ease;
            border-radius: 8px;
            overflow: hidden;
            box-shadow: 0 5px 15px rgba(0,0,0,0.05);
        }

        .category-hover:hover {
            transform: translateY(-10px);
            box-shadow: 0 15px 30px rgba(0,0,0,0.1);
        }

        .category-title {
            color: #212529;
            transition: all 0.3s ease;
            font-size: 1rem;
        }

        .category-hover:hover .category-title {
            color: var(--primary-color);
        }

        /* Product cards */
        .product-card {
            transition: all 0.3s ease;
            overflow: hidden;
            border-radius: 8px;
        }

        .product-card:hover {
            transform: translateY(-10px);
            box-shadow: 0 15px 35px rgba(0,0,0,0.1) !important;
        }

        .product-img {
            transition: all 0.5s ease;
        }

        .product-card:hover .product-img {
            transform: scale(1.05);
        }

        .product-title {
            overflow: hidden;
            text-overflow: ellipsis;
            display: -webkit-box;
            -webkit-line-clamp: 2;
            -webkit-box-orient: vertical;
            transition: color 0.3s ease;
            height: 3rem;
        }

        .product-card:hover .product-title {
            color: var(--primary-color) !important;
        }

        /* Promo banners */
        .promo-banner {
            position: relative;
            overflow: hidden;
        }

        .promo-banner img {
            transition: all 0.5s ease;
        }

        .promo-banner:hover img {
            transform: scale(1.1);
        }

        .promo-content {
            background: linear-gradient(90deg, rgba(0,0,0,0.7) 0%, rgba(0,0,0,0.4) 100%);
            transition: all 0.3s ease;
        }

        .promo-banner:hover .promo-content {
            background: linear-gradient(90deg, rgba(0,0,0,0.8) 0%, rgba(0,0,0,0.5) 100%);
        }

        /* Newsletter section */
        .newsletter-box {
            background: linear-gradient(45deg, var(--primary-color), var(--primary-dark));
            box-shadow: 0 15px 35px rgba(0,0,0,0.1);
        }

        /* Product filter pills */
        .product-filter .nav-link {
            color: #6c757d;
            background-color: transparent;
            border: 1px solid #dee2e6;
            margin-right: 0.5rem;
            margin-bottom: 0.5rem;
            transition: all 0.3s ease;
        }

        .product-filter .nav-link.active,
        .product-filter .nav-link:hover {
            color: white;
            background-color: var(--primary-color);
            border-color: var(--primary-color);
        }

        /* Responsive adjustments */
        @media (max-width: 991px) {
            .carousel-item img {
                height: 400px !important;
            }

            .carousel-caption {
                bottom: 10%;
            }
        }

        @media (max-width: 767px) {
            .carousel-item img {
                height: 300px !important;
            }

            .carousel-caption {
                display: block !important;
                bottom: 5%;
                left: 5%;
            }

            .carousel-caption h1 {
                font-size: 1.5rem;
            }

            .carousel-caption p {
                font-size: 0.9rem;
            }

            .carousel-caption .btn {
                font-size: 0.8rem;
                padding: 0.375rem 0.75rem;
            }

            .section-title {
                font-size: 1.75rem;
            }
        }
    </style>
</section>
</body>
</html>
