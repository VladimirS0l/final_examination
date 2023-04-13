<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>

<meta charset="UTF-8">
<title>{% block title %}{% endblock %}</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">PetRegistry</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav me-auto mb-2 mb-md-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/">Main page</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/animals">Manage pet</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
</head>

<body>
<img class="https://w0.peakpx.com/wallpaper/812/100/HD-wallpaper-on-the-farm-cows-animals-barn-chickens-farm-dogs.jpg">
<a class="ferma" href="https://w0.peakpx.com/wallpaper/812/100/HD-wallpaper-on-the-farm-cows-animals-barn-chickens-farm-dogs.jpg" >Главная страница</a>
<div class="container">
    {% block content %}{% endblock %}
</div>
<main class="flex-shrink-0">
    <div class="container">
        <h1 class="mt-5">This is a web application for managing your pets.</h1>
        <p class="lead">Please go to the pet management tab to be able to add, delete, edit your pets. </p>
        <br/>
        <hr/>
        <img src="https://w0.peakpx.com/wallpaper/812/100/HD-wallpaper-on-the-farm-cows-animals-barn-chickens-farm-dogs.jpg">
    </div>
</main>

<footer class="footer mt-auto py-3 bg-body-tertiary">
    <div class="container">
        <span class="text-body-secondary">Place sticky footer content here.</span>
    </div>
</footer>


</body>
</html>
