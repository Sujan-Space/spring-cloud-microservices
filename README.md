# 🌩️ Spring Cloud Microservices Demo

A simple **Spring Cloud microservices architecture** built using **Spring Boot 3.x**.  
This project demonstrates **service discovery, API Gateway routing, and inter-service communication** using modern Spring Cloud components.

---

## 📌 Features

- Service Discovery using **Eureka Server**
- Centralized routing via **API Gateway**
- Inter-service communication using **WebClient**
- Client-side load balancing with **Spring Cloud LoadBalancer**
- Modular microservice-based architecture
- Compatible with **Spring Boot 3.x** and **Java 17**

---

## 🧩 Architecture Overview

The system consists of the following microservices:

- **Eureka Server** – Service registry and discovery  
- **API Gateway** – Single entry point for client requests  
- **Order Service** – Handles order creation  
- **Payment Service** – Handles payment processing  

---

## 🛠 Tech Stack

- **Java** 17  
- **Spring Boot** 3.1+  
- **Spring Cloud** 2022.x  
- **Maven**  
- **Spring Tool Suite (STS) 

---

## 🚀 Services & Ports

| Service         | Port |
|-----------------|------|
| Eureka Server   | 8761 |
| API Gateway     | 8080 |
| Order Service   | 8181 |
| Payment Service | 8082 |

---

## 📂 Project Structure

```text
spring-cloud-microservices/
├── api-gateway/
├── eureka-server/
├── order-service/
├── payment-service/
└── README.md
```

---

## ▶️ How to Run the Application

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/Sujan-Space/spring-cloud-microservices.git
cd spring-cloud-microservices
```

### 2️⃣ Import into STS / Eclipse

```
File → Import → Existing Maven Projects
Select the project root
Click Finish
Allow Maven to download dependencies
```

### 3️⃣ Start Services (IMPORTANT ORDER)

Start the services in the following order:

1. **Eureka Server**
2. **API Gateway**
3. **Payment Service**
4. **Order Service**

Each service can be started using:

```
Right-click → Run As → Spring Boot App or 
Run server as spring boot and rest as Java Application 
```

### 🔍 Verify Eureka Registration

Open your browser and navigate to:

```
http://localhost:8761
```

You should see all services registered in the Eureka Dashboard.

---

## 🧪 API Testing

### Create Order (via API Gateway)

**Endpoint:**

```
POST http://localhost:8080/api/orders
```

**Request Body:**

```json
{
  "price": 100,
  "quantity": 2
}
```

**Expected Response:**

```json
{
  "orderId": "ORD123456",
  "price": 100,
  "quantity": 2,
  "totalAmount": 200,
  "paymentStatus": "SUCCESS"
}
```

Test using **Postman** :

```bash
curl -X POST http://localhost:8080/api/orders \
  -H "Content-Type: application/json" \
  -d '{"price": 100, "quantity": 2}'
```

---

## 📦 Service Details

### 🔹 Eureka Server

- Acts as a **service registry** where all microservices register themselves
- Provides service discovery for inter-service communication
- Dashboard available at `http://localhost:8761`

### 🔹 API Gateway

- Single entry point for all client requests
- Routes requests to appropriate microservices
- Provides load balancing and filters

**Sample Route Configuration:**

### 🔹 Order Service

- Handles order creation and management
- Communicates with Payment Service for payment processing
- Uses **WebClient** for asynchronous HTTP calls

### 🔹 Payment Service

- Processes payment requests
- Returns payment status to Order Service
- Exposes REST endpoints for payment operations

---


---

## 🐛 Troubleshooting

### Services not registering with Eureka

- Ensure Eureka Server is running first
- Check if `eureka.client.service-url.defaultZone` is correctly configured
- Verify network connectivity on port 8761

### API Gateway not routing requests

- Confirm all services are registered in Eureka Dashboard
- Check Gateway route configurations in `application.yml`
- Verify service names match exactly (case-sensitive)

### WebClient connection errors

- Ensure target service is running and registered
- Check if `@LoadBalanced` annotation is present on WebClient bean
- Verify service name is correct in WebClient URL

---


## 👤 Author

**Sujan Kumar**  
GitHub: [@Sujan-Space](https://github.com/Sujan-Space)  
LinkedIn: [Connect with me]([https://www.linkedin.com/in/sujankumar2003/])  



---

## ⭐ Show your support

Give a ⭐️ if this project helped you!

**Happy Coding! 🚀**
