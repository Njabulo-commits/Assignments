<?php


// Check if the form was submitted
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Include the database connection file
    require 'db_connect.php';

    // Capture form inputs
    $firstname = $_POST['first_name'];
    $lastname = $_POST['last_name'];
    $email = $_POST['email'];
    $appointmentDate = $_POST['appointment_date'];
    $appointmentTime = $_POST['appointment_time'];
    $service = $_POST['services'];
    $details = $_POST['details'];

    // Validate appointment date format (YYYY-MM-DD)
    if (!empty($appointmentDate) && preg_match('/\d{4}-\d{2}-\d{2}/', $appointmentDate)) {
    // SQL query to insert the data into the appointments table
    $sql = "INSERT INTO Appointments (first_name, last_name, email, appointment_date, appointment_time, service, details) 
    VALUES (:first_name, :last_name, :email, :date, :time, :service, :details)";

    try {
        // Prepare the statement
        $stmt = $pdo->prepare($sql);

        // Execute the statement
        $stmt->execute([
            ':first_name' => $firstname,
            ':last_name' => $lastname,
            ':email' => $email,
            ':date' => $appointmentDate,
            ':time' => $appointmentTime,
            ':service' => $service,
            ':details' => $details,
        ]);

        // Display success message
        header("Location: appointment.html");
        exit();
    } catch (PDOException $e) {
        // Display error message if something goes wrong
        echo "Error: " . $e->getMessage();
    }
} else {
    // If the date format is incorrect
    echo "Invalid date format. Please enter a valid date in the format YYYY-MM-DD.";
}
}
