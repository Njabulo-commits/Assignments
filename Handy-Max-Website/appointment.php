<?php
// Include the database connection file
require 'db_connect.php';

// Check if the form was submitted
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Capture and sanitize form inputs
    $firstname = htmlspecialchars($_POST['first_name']);
    $lastname = htmlspecialchars($_POST['last_name']);
    $email = htmlspecialchars($_POST['email']);
    $appointmentDate = $_POST['date'];
    $appointmentTime = $_POST['appointment_time'];
    $service = htmlspecialchars($_POST['services']);
    $details = htmlspecialchars($_POST['details']);

    try {
        // SQL query to insert the data into the appointments table
        $sql = "INSERT INTO appointments (first_name, last_name, email, date, time, service, details) 
                VALUES (:first_name, :last_name, :email, :date, :time, :service, :details)";

        // Prepare the statement
        $stmt = $pdo->prepare($sql);

        // Bind parameters to the SQL query
        $stmt->bindParam(':first_name', $firstname);
        $stmt->bindParam(':last_name', $lastname);
        $stmt->bindParam(':email', $email);
        $stmt->bindParam(':date', $appointmentDate);
        $stmt->bindParam(':time', $appointmentTime);
        $stmt->bindParam(':service', $service);
        $stmt->bindParam(':details', $details);

        // Execute the statement
        $stmt->execute();

        // Display success message
        echo "Appointment booked successfully!";
    }catch (PDOException $e) {
        // Display error message if something goes wrong
        echo "Error: " . $e->getMessage();
    }
}
