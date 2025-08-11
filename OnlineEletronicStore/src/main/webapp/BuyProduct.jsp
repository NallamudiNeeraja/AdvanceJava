<%@page import="com.pack1.ProductBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buy Electronics</title>
<style>
    body {
        background-image: url(hthttps://img.freepik.com/free-photo/3d-rendering-electronic-store-gadgets-accessories_107791-16647.jpg);

        background-size: cover;
        background-repeat: no-repeat;
        background-attachment: fixed;
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
    }

    .form-container {
        background-color: rgba(255, 255, 255, 0.95);
        padding: 30px;
        margin-top: 80px;
        border-radius: 15px;
        width: 400px;
        box-shadow: 0 0 15px rgba(0,0,0,0.3);
    }

    input[type="text"],
    input[type="number"] {
        width: 100%;
        padding: 10px;
        margin: 10px 0;
        border: 1px solid #ccc;
        border-radius: 8px;
        font-size: 16px;
    }

    input[type="submit"] {
        background-color: #007bff;
        color: white;
        border: none;
        padding: 12px 20px;
        font-size: 16px;
        border-radius: 8px;
        cursor: pointer;
        margin-top: 15px;
    }

    input[type="submit"]:hover {
        background-color: #0056b3;
    }

    label {
        font-weight: bold;
        display: block;
        margin-top: 10px;
    }
</style>
</head>
<body>
<center>
    <div class="form-container">
        <%
        ProductBean pb = (ProductBean) request.getAttribute("pbean");
        %>
        <form action="ups" method="post">
            <label>Product Code:</label>
            <input type="text" name="pcode" value="<%=pb.getPcode()%>" readonly>

            <label>Product Name:</label>
            <input type="text" name="pname" value="<%=pb.getPname() %>" readonly>

            <label>Company:</label>
            <input type="text" name="pcom" value="<%=pb.getPcompany()%>" readonly>

            <label>Price:</label>
            <input type="text" name="pprice" value="<%=pb.getPprice() %>" readonly>

            <label>Available Quantity:</label>
            <input type="number" name="pqty" value="<%=pb.getPqty() %>" readonly>

            <label>Enter Quantity to Buy:</label>
            <input type="number" name="rno" min="1" required>

            <input type="submit" value="Buy Now">
        </form>
    </div>
</center>
</body>
</html>
