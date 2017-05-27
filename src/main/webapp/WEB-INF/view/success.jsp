<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<html>
<head>
  <title>Test App</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>User Info</h2>
  <img src="${userdata.picture}" class="img-circle" alt="Cinque Terre" width="304" height="236"> 
  <ul class="list-group">
    <li class="list-group-item">Name : ${userdata.name}</li>
    <li class="list-group-item">Email : ${userdata.email}</li>
    <li class="list-group-item">Gender : ${userdata.gender}</li>
  </ul>
</div>

</body>
</html>