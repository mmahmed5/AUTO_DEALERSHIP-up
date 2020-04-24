<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>SpringBoot</title>
    <style>
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
        <th>Customer First Name</th>
        <th>Customer Last Name</th>
        <th>Vehicle Purchased Make</th>
        <th>Vehicle Purchased Model</th>
        <th>Date Purchased</th>
        <th>Sales Person</th>


    </tr>
    <c:forEach var = "listitem" items = "${customerlist}">
        <tr>
            <td>${listitem.getCustomerfirstname()}</td>
            <td>${listitem.getCustomerlastname()}</td>
            <td>${listitem.getPurchasedmake()}</td>
            <td>${listitem.getPurchasedmodel()}</td>
            <td>${listitem.getDatepurchased()}</td>
            <td>${listitem.getSalesperson()}</td>




        </tr>
    </c:forEach>
</table>
<form method="post" action="/save-customer">
    <input type="hidden" name="customerid" value="">
    Make:<br>
    <input type = "text" name = "customerfirstname">
    <br>
    Model:<br>
    <input type="text" name="customerlastname">
    <br>
    <input  type="text" name="purchasedmake">
    <br>
    <input  type="text" name="purchasedmodel">
    <br>
    <input type="text" name="datepurchased">
    <br>
    <input type="text" name="salesperson">


    <br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>

