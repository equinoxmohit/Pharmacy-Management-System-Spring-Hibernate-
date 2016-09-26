<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
            <h1>Insert Enquiry</h1>
            <form action="" method="post">
                <label>First Name</label>
                <input type="text" name="firstName" required="required" class="form-control"/>
                <label>Last Name</label>
                <input type="text" name="lastName" required="required" class="form-control"/>
                <label>Email Id</label>
                <input type="email" name="emailId" required="required" class="form-control"/>
                <label>Contact Number</label>
                <input type="number" name="contactNumber" required="required" class="form-control"/>
                <label>Disease Type</label>
                <select name="disease.diseaseId" required="required" class="form-control">
                    <option value="">Select The Type Of Disease</option>
                    <c:forEach var="d" items="${disease}">
                        <option value="${d.diseaseId}">${d.diseaseName}</option>
                    </c:forEach>
                </select>
                <label>Select Medicine</label>
                <select name="medicine.medicineId" required="required" class="form-control">
                    <option value="">Select Any One Medicine</option>
                    <c:forEach var="m" items="${medicine}">
                        <option value="${m.medicineId}">${m.medicineName}</option>
                    </c:forEach>
                </select>
                <br>
                <button type="submit" class="btn btn-success">Submit</button>
                <button type="reset" class="btn btn-danger">Clear</button>
            </form>
        </div>
    </body>
</html>
