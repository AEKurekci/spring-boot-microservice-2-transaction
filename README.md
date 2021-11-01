# Spring Boot Microservice 2 - Transaction Service

### Endpoints

#### Save Transaction

````
POST /api/transaction HTTP/1.1
Host: localhost:4444
Authorization: Basic basic64(username:password)
Content-Type: application/json
Content-Length: 42

{
    "userId": 1,
    "productId": 1
}
````

#### Get Transactions of User
````
GET /api/transaction/1 HTTP/1.1
Host: localhost:4444
Authorization: Basic basic64(username:password)
````

#### Delete Transaction by Id
````
DELETE /api/transaction/1 HTTP/1.1
Host: localhost:4444
Authorization: Basic basic64(username:password)
````