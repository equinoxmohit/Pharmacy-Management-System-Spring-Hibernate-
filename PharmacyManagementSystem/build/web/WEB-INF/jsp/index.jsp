<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pharmacy Management System|PMS</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </head>

    <body>
        <div class="container">
            <h1>Welcome to Pharmacy Management System</h1>
            <table class="table table-striped">
                <tr>
                    <th>Administrator Login</th>
                    <th>Patient's Enquiry</th>
                </tr>
                <tr>
                    <td><a href="${pageContext.request.contextPath}/admin" class="btn  btn-danger"><span class="glyphicon glyphicon-user"></span> </a></td>
                    <td><a href="${pageContext.request.contextPath}/enquiry" class="btn btn-success"><span class="glyphicon glyphicon-ok"></span> </a></td>
                </tr>
            </table>
        </div>
    </body>
</html>
