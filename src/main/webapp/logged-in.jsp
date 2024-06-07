<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Result</title>
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
<%
    response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
    session.invalidate();
    response.setHeader("Pragma", "no-cache");
%>
<center>
    <h2>Hello ${user}</h2>
    <form action="index.jsp" method="post">

    </form>
</center>

</body>
</html>