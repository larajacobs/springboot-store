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

   * Talks to the repository and adds required data

4. **Exceptions handling layer**

   * Handles issues gracefully when program fails

5. **Entity Layer**

   * Creates the different 'tables' within the database.

## Control flow
```
   Controller -> service -> Exception handling -> Repository -> entitiy -> controller
```