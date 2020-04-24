<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>SUPERHEROES</title>
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
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<h2>View Superhero</h2>

<table>
    <tr>
        <th>ID</th>
        <td>${selectedItem.getVehicleId()}</td>
    </tr>
    <tr>
        <th>Vehicle Make</th>
        <td>${selectedItem.getVehicleMake()}</td>
    </tr>
    <tr>
        <th>Vehicle Model</th>
        <td>${selectedItem.getVehicleModel()}</td>
    </tr>
    <tr>
        <th>Vehicle Year</th>
        <td>${selectedItem.getVehicleYear()}</td>
    </tr>
    <tr>
        <th>Vehicle VIN</th>
        <td>${selectedItem.getVehicleVIN()}</td>
    </tr>
    <tr>
        <th>Vehicle Color</th>
        <td>${selectedItem.getVehicleColor()}</td>
    </tr>
    <tr>
        <th>Vehicle Model</th>
        <td>${selectedItem.getVehicleMileage()}</td>
    </tr>
    <tr>
        <th>Vehicle Model</th>
        <td>${selectedItem.getVehiclePrice()}</td>
    </tr>
    <tr>
        <th>Vehicle Model</th>
        <td>${selectedItem.getVehicleAvail()}</td>
    </tr>

</table>
<a href="/">Back</a>
</body>
</html>
