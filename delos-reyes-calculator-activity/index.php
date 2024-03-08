<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculator</title>
    <style>
        .calculator-container {
            width: 300px;
            margin: 300px auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: lightblue;
        }
        .calculator-container input[type="text"] {
            width: 100%;
            margin-bottom: 10px;
            padding: 5px;
            box-sizing: border-box;
        }
        .calculator-container button {
            width: 50px;
            height: 50px;
            margin: 10px;
            font-size: 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        .calculator-container button:hover {
            background-color: lightgreen;
        }
     
    </style>
</head>
<body>
    <div class="calculator-container">
        <form action="form.php" method="POST">
            <input type="text" name="first_number" placeholder="Enter First Number" required>
            <br>
            <input type="text" name="second_number" placeholder="Enter Second Number" required>
            <br>
            <button type="submit" name="operation" value="add">+</button>
            <button type="submit" name="operation" value="subtract">-</button>
            <button type="submit" name="operation" value="multiply">*</button>
            <button type="submit" name="operation" value="divide">/</button>
        </form>
    </div>
</body>
</html>
