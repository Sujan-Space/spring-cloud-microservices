# 🌩️ Spring Cloud Microservices Demo

A simple **Spring Cloud microservices architecture** built using **Spring Boot 3.x**.  
This project demonstrates **service discovery, API gateway routing, and inter-service communication** using modern Spring Cloud components.

---

## 📌 Features

- Service Discovery using **Eureka Server**
- Centralized routing via **API Gateway**
- Inter-service communication using **WebClient**
- Client-side load balancing with **Spring Cloud LoadBalancer**
- Modular microservice structure
- Compatible with **Spring Boot 3.x & Java 17**

---

## 🧩 Architecture Overview

The system consists of the following microservices:

- **Eureka Server** – Service registry and discovery
- **API Gateway** – Single entry point for all client requests
- **Order Service** – Handles order creation
- **Payment Service** – Handles payment processing

---

## 🛠 Tech Stack

- **Java** 17  
- **Spring Boot** 3.1+  
- **Spring Cloud** 2022.x  
- **Maven**  
- **Spring Tool Suite (STS) / IntelliJ IDEA**

---

## 🚀 Services & Ports

| Service          | Port |
|------------------|------|
| Eureka Server    | 8761 |
| API Gateway      | 8080 |
| Order Service    | 8181 |
| Payment Service  | 8082 |

---

## 📂 Project Structure

```text
spring-cloud-microservices/
├── api-gateway
├── eureka-server
├── order-service
├── payment-service
└── README.md
▶️ How to Run the Application
1️⃣ Clone the Repository
bash
Copy code
git clone https://github.com/Sujan-Space/spring-cloud-microservices.git
cd spring-cloud-microservices
2️⃣ Import into STS / Eclipse
mathematica
Copy code
File → Import → Existing Maven Projects
Select the project root

Click Finish

Allow Maven to download dependencies

3️⃣ Start Services (IMPORTANT ORDER)
Start the services in the following order:

Eureka Server

API Gateway

Payment Service

Order Service

Each service can be started using:

mathematica
Copy code
Right-click → Run As → Spring Boot App
🔍 Verify Eureka Registration
Open your browser and navigate to:

arduino
Copy code
http://localhost:8761
You should see all services registered in the Eureka Dashboard.

🧪 API Testing
Create Order (via API Gateway)
Endpoint

http
Copy code
POST http://localhost:8080/api/orders
Request Body

json
Copy code
{
  "price": 100,
  "quantity": 2
}
Use Postman or curl to test the API.

⚠️ Notes
Ensure Java 17 is configured correctly

Ports must be free before starting services

Eureka Server must always start first

🧑‍💻 Author
Sujan Kumar
🔗 GitHub: https://github.com/Sujan-Space
