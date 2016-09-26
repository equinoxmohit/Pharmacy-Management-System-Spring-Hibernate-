<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    </head>
    <body>
        <div class="container">
             <a href="${SITE_URL}" class="btn btn-success"><span class="glyphicon glyphicon-home"></span></a>
            <a href="${SITE_URL}/medicine" class="btn btn-success"><span class="glyphicon glyphicon-plus">Medicine</span></a>
            <a href="${SITE_URL}/disease" class="btn btn-success"><span class="glyphicon glyphicon-plus">Disease</span></a>
            <a href="${SITE_URL}/view" class="btn btn-success">Diseases</a>

            <table class="table table-striped table-hover">
                <tr>
                    <th>Medicine Name</th>
                    <th>Cost</th>
                    <th>Quantity</th>
                    <th>Added Date</th>
                    <th>Status</th>
                    <th>Action</th>
                </tr>
                <c:forEach var="med" items="${medicine}">
                    <tr>
                        <td>${med.medicineName}</td>
                        <td>${med.medicinePrice}</td>
                        <td>${med.quantity}</td>
                        <td>${med.addedDate}</td>
                        <td>
                    <c:choose>
                        <c:when test="${med.status}">Available</c:when>
                        <c:otherwise>Unavailable</c:otherwise>
                    </c:choose>
                    </td>
                    <td>
                        <a href="${SITE_URL}/edit/${med.medicineId}" class="btn btn-success"><span class="glyphicon glyphicon-pencil"></span></a>
                        <a href="${SITE_URL}/delete/${med.medicineId}" class="btn btn-danger"><span class="glyphicon glyphicon-trash" onclick="return confirm('Are you sure you want to delete?')"></span></a>
                    </td>
                    </tr>
                </c:forEach>

            </table>




        </div>


    </body>
</html>
