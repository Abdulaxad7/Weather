<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Show</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .centered-label {
            text-align: center;
        }
    </style>
</head>
<body style="background-color:lightcyan">

<h3>
The current weather in Tashkent is:
${weather}
</h3>



</body>
</html>