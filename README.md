# springboot-store
A very simple voucher system

## Running the project
```
    mvn spring-boot:run
```
```
voucher-api/
 ├── src/main/java/com/example/voucher
 │    ├── controller
 │    │     └── VoucherController.java
 │    ├── entity
 │    │     └── Voucher.java
 │    ├── repository
 │    │     └── VoucherRepository.java
 │    ├── service
 │    │     └── VoucherService.java
 │    ├── exception
 │    │     ├── VoucherNotFoundException.java
 │    │     ├── VoucherAlreadyRedeemedException.java
 │    │     └── GlobalExceptionHandler.java
 │    └── VoucherApiApplication.java
 └── src/main/resources
       └── application.properties
```



## 🔹 Architechture Layers

1. **Repository Layer**

   * Manages data persistence 

2. **Controller layer**

   * Exposes the REST points to handle incoming HTTP requests, provides valid responses 

3. **Service Layer**

   * You buy an electricity voucher at a till.
   * The voucher code is generated, stored in the backend, and activated.
   * When you load the code into your prepaid meter, it deducts and marks as redeemed.

4. **Exceptions handling layer**

   * You buy an electricity voucher at a till.
   * The voucher code is generated, stored in the backend, and activated.
   * When you load the code into your prepaid meter, it deducts and marks as redeemed.

5. **Entity Layer**

   * You buy an electricity voucher at a till.
   * The voucher code is generated, stored in the backend, and activated.
   * When you load the code into your prepaid meter, it deducts and marks as redeemed.

## Control flow
```
   Controller -> service -> Exception handling -> Repository -> entitiy -> controller
```