<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    title>Car Dealership</title>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

    <div class="mainmenu">

        <a href="${pageContext.request.contextPath}/index.jsp"> Home </a>
        <a href="${pageContext.request.contextPath}/vehicle.jsp"> Vehicles </a>
        <a class="active" href="${pageContext.request.contextPath}/jsp/customer.jsp"> Customers </a>
        <a href="${pageContext.request.contextPath}/employee.jsp"> Employees </a>
        <a href="${pageContext.request.contextPath}/transaction.jsp">Transactions </a>

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
<body>

<h2>HTML Table</h2>

<table>
    <tr>
        <th>Employee First Name</th>
        <th>Employee Last Name</th>
        <th>Employee Hire Date</th>
        <th>Employee Last Date</th>
        <a href="/index/${pageContext.request.contextPath}"> Home </a>

    </tr>
    <c:forEach var = "listitem" items = "${employeelist}">
        <tr>
            <td>${listitem.getEmployeefirstname()}</td>
            <td>${listitem.getEmployeelastname()}</td>
            <td>${listitem.getEmployeehiredate()}</td>
            <td>${listitem.getEmployeelastdate()}</td>
        </tr>
    </c:forEach>
</table>
<form method="post" action="/save-employee">
    <input type="hidden" name="employeeid" value="">
    First Name:<br>
    <input type = "text" name = "employeefirstname">
    <br>
    Last name:<br>
    <input type="text" name="employeelastname">
    <br>
    <input  type="text" name="employeehiredate">
    <br>
    <input  type="text" name="employeelastdate">
    <br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>

