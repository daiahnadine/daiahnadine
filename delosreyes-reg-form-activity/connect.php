<?php
    // $servername = "localhost";
    // $username = "root";
    // $password = "";

    // //create connection
    // $conn = mysqli_connect($servername, $username, $password);
    // // check connection
    // if (!$conn) {
    //     die("Connection failed: " . mysqli_connect_error());
    // }
    // echo "Connected succesfully";

    $servername = "localhost";
    $username = "root";
    $password = "";

    //create connection
    $conn = new mysqli($servername, $username, $password);

    if ($conn->connect_error) {
            die("Connection failed: " . mysqli_connect_error());
        }

    //create database
    $sql = "CREATE DATABASE FirstConnection";
    if ($conn->query($sql) === TRUE) {
        echo "Database Created Successfully";
    } else {
        echo "Error creating database: " . $conn->error;
    }

    $conn->close();
?>