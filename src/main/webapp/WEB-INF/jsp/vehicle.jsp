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
        <th>Vehicle Make</th>
        <th>Vehicle Model</th>
        <th>Vehicle Year</th>
        <th>Vehicle VIN</th>
        <th>Vehicle Color</th>
        <th>Vehicle Mileage</th>
        <th>Vehicle Price</th>

    </tr>
    <c:forEach var = "listitem" items = "${vehiclelist}">
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