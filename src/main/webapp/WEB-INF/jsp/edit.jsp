<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>SpringBoot</title>
</head>
<body>



<hr/>
<form method="post" action="/save">
    <input type="hidden" name="vehicleid" value="${selectedItem.getId()}">
    <br>First Name: <br>
    <input type="text" name="vehiclemake" value="${selectedItem.getVehicleMake()}">
    <br>Last name:<br>
    <input type="text" name="vehiclemodel" value="${selectedItem.getVehicleModel()}">
    <br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>
