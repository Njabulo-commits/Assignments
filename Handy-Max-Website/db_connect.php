<?php
// Database connection settings
$host = 'localhost'; 
$db = 'handymax_db'; 
$user = 'root'; 
$pass = '#Greatness22'; 
$charset = 'utf8mb4'; // Character set

// Data Source Name for PDO
$dsn = "mysql:host=$host;dbname=$db;charset=$charset";

try {
    // Create a PDO instance for database connection
    $pdo = new PDO($dsn, $user, $pass);
    // Set error mode to exceptions
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    echo "Connection successful";
} catch (PDOException $e) {
    // Display error message if connection fails
    die("Database connection failed: " . $e->getMessage());
}
