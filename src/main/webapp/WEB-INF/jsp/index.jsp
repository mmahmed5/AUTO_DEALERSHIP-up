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
        <th>Vehicle Availability</th>
    </tr>
    <c:forEach var = "listitem" items = "${vehiclelist}">
        <tr>
            <td>${listitem.getVehicleMake()}</td>
            <td>${listitem.getVehicleModel()}</td>
            <td>${listitem.getVehicleYear()}</td>
            <td>${listitem.getVehicleVIN()}</td>
            <td>${listitem.getVehicleVIN()}</td>
            <td>${listitem.getVehicleColor()}</td>
            <td>${listitem.getVehicleMileage()}</td>
            <td>${listitem.getVehiclePrice()}</td>
            <td>${listitem.getVehicleAvailabilty()}</td>
            <td>
                <a href="/view/${listitem.getId()}">View</a>
                <a href="/edit/${listitem.getId()}">Edit</a>
                <a href="/delete/${listitem.getId()}"><img src="../../img/delete.jpg" alt="delete_image" ></a>
            </td>
        </tr>
    </c:forEach>
</table>
<form method="post" action="/save">
    <input type="hidden" name="vehicleid" value="">
    Make:<br>
    <textarea row = "15" cols ="15" type = "text" name = "vehiclemake">${vehiclemake}</textarea>
    <br>
    Model:<br>
    <textarea row="15" cols = "15" type="text" name="vehiclemodel">${vehiclemodel}</textarea>
    <br><br>
    <input type="submit" value="Save">
</form>

</body>
</html>
