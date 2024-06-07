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

<form action="login" method="get">
    <table>
        <tr>
<td>
    <input type="text" placeholder="Name" name="name">
</td>
        </tr>
        <tr>
            <td>
    <input type="password" placeholder="Password" name="password">
            </td>
        </tr>
        <tr>
            <td>
   <center> <input type="submit" value="Log in"></center>
            </td>
        </tr>
    </table>

</form>


</body>
</html>