<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
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
            <a class="nav-link active fw-bold" aria-current="page" href="index.html"><i class="fa-solid fa-house-chimney"></i> Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link fw-bold" href="about.html"><i class="fa-solid fa-magnifying-glass"></i> About Us</a>
          </li>
          <li class="nav-item">
            <a class="nav-link fw-bold" href="contact.html"><i class="fa-solid fa-user"></i> Contact US</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
        <div class="container mb-5 mt-2">
        <div class="row">
          <div class="col">
            <div class="card ms-5" style="width: 18rem;">
                <img src="https://www.shutterstock.com/image-photo/donor-word-on-cube-medical-260nw-1805645929.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">Donate Here!!</h5>
                  <center><a href="Donate.jsp" class="btn btn-primary mt-2">Donate</a></center>
                </div>
              </div>
          </div>
          <div class="col">
            <div class="card ms-5" style="width: 18rem;">
                <img src="https://media.istockphoto.com/id/1353332258/photo/donation-concept-the-volunteer-giving-a-donate-box-to-the-recipient-standing-against-the-wall.jpg?s=612x612&w=0&k=20&c=9AL8Uj9TTtrbHpM78kMp9fqjT_8EqpEekjdixeKUzDw=" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">Receiver Here!!</h5>
                  <center><a href="Receiver.jsp" class="btn btn-primary mt-2">Receiver</a></center>
                </div>
              </div>
          </div>
        </div>
        <footer class="footer p-5 text-light mt-5">
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
</body>
</html>