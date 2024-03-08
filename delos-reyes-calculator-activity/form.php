<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $first_number = $_POST['first_number'];
    $second_number = $_POST['second_number'];
    $operation = $_POST['operation'];
    $result = '';

    switch ($operation) {
        case 'add':
            $result = $first_number + $second_number;
            break;
        case 'subtract':
            $result = $first_number - $second_number;
            break;
        case 'multiply':
            $result = $first_number * $second_number;
            break;
        case 'divide':
            if ($second_number != 0) {
                $result = $first_number / $second_number;
            } else {
                $result = "Cannot divide by zero";
            }
            break;
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculator Result</title>
</head>
<body>
<div class="result-container">
            <?php if (!empty($result)): ?>
                <p>Result: <?php echo $result; ?></p>
            <?php endif; ?>
            <button class="back-button" onclick="window.location.href='index.php'">Back to Calculator</button>
        </div>
    </div>
</body>
</html>
