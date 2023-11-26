CREATE DATABASE IF NOT EXISTS `e-commerce` DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

USE `e-commerce`;

CREATE TABLE IF NOT EXISTS `user_auth` (
                                           `id` int NOT NULL AUTO_INCREMENT,
                                           `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                           `email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                           `password_hashed` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                           `phone_number` varchar(20) DEFAULT NULL,
                                           `first_name` varchar(100) DEFAULT NULL,
                                           `last_name` varchar(100) DEFAULT NULL,
                                           `address_line1` varchar(255) DEFAULT NULL,
                                           `address_line2` varchar(255) DEFAULT NULL,
                                           `city` varchar(100) DEFAULT NULL,
                                           `state` varchar(100) DEFAULT NULL,
                                           `postal_code` varchar(20) DEFAULT NULL,
                                           `country` varchar(100) DEFAULT NULL,
                                           `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
                                           `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
