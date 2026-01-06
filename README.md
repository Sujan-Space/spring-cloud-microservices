# Spring Cloud Microservices Demo

This repository demonstrates a basic Spring Cloud microservices architecture using:

- Eureka Server (Service Discovery)
- API Gateway
- Order Service
- Payment Service
- WebClient + LoadBalancer
- Spring Boot 3.x

## Tech Stack
- Java 17
- Spring Boot 3.1+
- Spring Cloud 2022.x
- Maven
- STS / IntelliJ

## Services & Ports

| Service        | Port |
|---------------|------|
| Eureka Server | 8761 |
| API Gateway  | 8080 |
| Order Service | 8081 |
| Payment Service | 8082 |

## How to Run

### 1. Clone repository
```bash
git clone https://github.com/<your-username>/spring-cloud-microservices-demo.git
2. Import into STS
File → Import → Existing Maven Projects

Select project root

Finish

3. Run services in this order
Eureka Server

API Gateway

Payment Service

Order Service

4. Verify Eureka
Open:

arduino
Copy code
http://localhost:8761
5. Test Order API
bash
Copy code
POST http://localhost:8081/api/orders
json
Copy code
{
  "price": 100,
  "quantity": 2
}
Author
Sujan Kumar

yaml
Copy code

---

# 5️⃣ INITIALIZE GIT (LOCAL)

### Open **Git Bash** or **Terminal**

Navigate to your **workspace root**:

```bash
