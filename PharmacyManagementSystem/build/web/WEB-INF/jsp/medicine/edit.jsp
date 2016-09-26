<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <h1>Edit Medicine</h1>
            <form action="" method="post">
                <div>
                    <label>Medicine Name</label>
                    <input type="text" name="medicineName" class="form-control" value="${med.medicineName}" required="required"/>
                </div>
                <div>
                    <label>Cost</label>
                    <input type="text" name="medicinePrice" class="form-control"  value="${med.medicinePrice}" required="required"/>
                </div>
                <div>
                    <label>Quantity</label>
                    <input type="text" name="quantity" class="form-control"  value="${med.quantity}" required="required"/>
                </div>
                <div>
                    <label >Status
                        <select name="status" required="required" class="form-control">
                            <option value="">Select Any One</option>
                            <option value="0">Unavailable</option>
                            <option value="1">Available</option>
                        </select>
                    </label>
                </div>
                <div>
                    <input type="hidden" value="${med.medicineId}"/>
                </div>
                <br>
                <div>
                    <button type="submit" class="btn btn-success">Submit</button>
                    <button type="reset" class="btn btn-danger">Clear</button>
                </div>
            </form>
        </div>
    </body>
</html>
