<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Donate Item</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
          <a class="navbar-brand fw-bold fs-4">Share And Help</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo02"
            aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active fw-bold" aria-current="page" href="index.html">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link fw-bold" href="about.html">About Us</a>
              </li>
              <li class="nav-item">
                <a class="nav-link fw-bold" href="contact.html">Contact US</a>
              </li>
            </ul>
          </div>
        </div>
    </nav>
    <div class="container mt-5">
        <h2 class="text-light fw-bold">Donate Item</h2>
        
        <!-- Display Success Message -->
        <c:if test="${not empty successMessage}">
            <div class="alert alert-success" role="alert">
                ${successMessage}
            </div>
        </c:if>
        
        <!-- Display Error Message -->
        <c:if test="${not empty errorMessage}">
            <div class="alert alert-danger" role="alert">
                ${errorMessage}
            </div>
        </c:if>
        
        <form action="DonateController" method="post" enctype="multipart/form-data">
            <div class="mb-3">
                <label for="itemName" class="form-label text-light fw-bold">Item Name</label>
                <input type="text" class="form-control" id="itemName" name="itemName" required>
            </div>
            <div class="mb-3">
                <label for="itemDescription" class="form-label text-light fw-bold">Item Description</label>
                <textarea class="form-control" id="itemDescription" name="itemDescription" required></textarea>
            </div>
            <div class="mb-3">
                <label for="itemImage" class="form-label text-light fw-bold">Item Image</label>
                <input class="form-control" type="file" id="itemImage" name="itemImage" required>
            </div>
            <button type="submit" class="btn btn-primary ">Donate</button>
        </form>
    </div>
    <footer class="footer p-5 text-light" style="margin-top: 30vh;">
        <hr>
        <div class="container">
            <div class="row">
                <div class="col-md-3">
                    <h2>MohanPatil</h2>
                </div>
                <div class="col-md-3">
                    <h5>About Us</h5>
                    <p>
                        This website shows all the information about my life journey. Explore all sections of this website.
                    </p>
                </div>
                <div class="col-md-3">
                    <h5>Contact Us</h5>
                    <ul class="list-unstyled">
                        <li>Email: mohanpatil6599@gmail.com</li>
                        <li>Phone: +91 9307982030</li>
                        <li>Address: Lane no.1, Karve Nagar, Pune, India</li>
                    </ul>
                </div>
                <div class="col-md-3">
                    <h5>Follow Us</h5>
                    <ul class="list-inline footer-links">
                        <li class="list-inline-item">
                            <a href="#">
                                <i class="fab fa-facebook"></i>
                            </a>
                        </li>
                        <li class="list-inline-item">
                            <a href="#">
                                <i class="fab fa-twitter"></i>
                            </a>
                        </li>
                        <li class="list-inline-item">
                            <a href="#">
                                <i class="fab fa-instagram"></i>
                            </a>
                        </li>
                        <li class="list-inline-item">
                            <a href="#">
                                <i class="fab fa-linkedin"></i>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
            <hr>
            <div class="row">
                <div class="col-md-6">
                    <p>© 2024 Your Website. All rights reserved.</p>
                </div>
            </div>
        </div>
      </footer>
      <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
