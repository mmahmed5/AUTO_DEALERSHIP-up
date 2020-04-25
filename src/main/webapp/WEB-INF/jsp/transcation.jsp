<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    title>Car Dealership</title>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

    <div class="mainmenu">

        <a href="${pageContext.request.contextPath}/jsp/index.jsp"> Home </a>
        <a href="${pageContext.request.contextPath}vehicle.jsp"> Vehicles </a>
        <a class="active" href="${pageContext.request.contextPath}/jsp/customer.jsp"> Customers </a>
        <a href="${pageContext.request.contextPath}employee.jsp"> Employees </a>
        <a href="${pageContext.request.contextPath}transaction.jsp">Transactions </a>

    </div>

    <b></b>
    <style>

        .mainmenu {
            width: 100%;
            background-color: #555;
            overflow: auto;
        }

        /* Navbar links */

        .mainmenu a {
            float: left;
            text-align: center;
            padding: 12px;
            color: white;
            text-decoration: none;
            font-size: 17px;
        }

        /* Navbar links: hover */


        .mainmenu a:hover {
            background-color: #000;
        }

        /* Active navbar link */

        .active {
            background-color: lightslategray;
        }
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
            width: 150px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>