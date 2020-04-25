<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Car Dealership</title>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

    <div class="mainmenu">

        <a href="${pageContext.request.contextPath}/"> Home </a>
        <a href="/vehicle/"${listitem.getVehicleid()}">Vehicle</a>
        <a href="/customer/"${listitem.getCustomerid()}"> Customers </a>
        <a href="/employee/"${listitem.getEmployeeid()}> Employees </a>
        <a class="active" href="/transaction/"${listitem.getTransactionid()}>Transactions </a>

    </div>

    <b></b>
    <style>
        html {
            background-color: lightslategrey;
        }

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
            font-family: Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
            padding: 20px;
            border-bottom-color: darkgray;

        }

        td, th {
            border-bottom-color: lightsteelblue;
            text-align: left;
            padding: 5px;
            width: 150px;

        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }

        /* format for the add new section div */

        h2{
            color: whitesmoke;
        }
        .addnew {

            padding: 10px;
            width: 25%;
            height: auto;
            float: left;


        }

        /* format for the view/table section div*/

        .view {

            overflow-x:auto;
            padding: 10px;
            width: 70%;
            height: auto;
            float: right;


        }

        input[type=text], select, input[type=number] {
            width: 70%;
            padding: 10px 10px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid darkslategray;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type=submit] {
            width: 25%;
            background-color: black;
            color: white;
            padding: 10px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type=submit]:hover {
            background-color: lightsteelblue;
        }

        lable {
            color: whitesmoke;
        }

        fieldset {
            background-color: whitesmoke;
        }

    </style>
</head>

<h2>Transactions</h2>

<table>
    <tr>
        <th>Date</th>
        <th>Customer</th>
        <th>Salesperson</th>
        <th>Vehicle</th>
        <th>Amount</th>
        <th>Receipt #</th>


    </tr>
    <c:forEach var = "listitem" items = "${transactionlist}">
        <tr>
            <td>${listitem.getVehiclemake()}</td>
            <td>${listitem.getVehiclemodel()}</td>
            <td>${listitem.getVehicleyear()}</td>
            <td>${listitem.getVehiclevin()}</td>
            <td>${listitem.getVehiclecolor()}</td>
            <td>${listitem.getVehiclemileage()}</td>
            <td>${listitem.getVehicleprice()}</td>

            <td>
                <a href="/delete/${listitem.getVehicleid()}"></a>
            </td>

        </tr>
    </c:forEach>
</table>
<form method="post" action="/vehicle-save">
    <input type="hidden" name="vehicleid" value="">
    Make:<br>
    <input type = "text" name = "vehiclemake">
    <br>
    Model:<br>
    <input type="text" name="vehiclemodel">
    <br>
    <input  type="text" name="vehicleyear">
    <br>
    <input  type="text" name="vehiclevin">
    <br>
    <input type="text" name="vehiclecolor">
    <br>
    <input type="text" name="vehiclemileage">
    <br>
    <input type="text" name="vehicleprice">

    <br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>
