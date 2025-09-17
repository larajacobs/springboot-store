# springboot-store
Learning spring with mosh, creating a basic springboot application

# Basic Springboot project
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

Great follow-up — this is exactly the kind of thinking that will make you stand out in an interview. Let’s ground your **Voucher / Airtime Redemption API** idea in **real-world fintech scenarios**, and connect it directly to Pepkor Fintech.

---

## 🔹 When Would You Use It (Real Life Scenarios)

1. **Prepaid Airtime/Data Top-Ups**

   * You buy a voucher code at a PEP or Ackermans store.
   * That code represents a specific value (e.g. R100 airtime).
   * At home, you redeem it through your phone or an app to load airtime.

2. **Gift Vouchers**

   * A customer buys a R200 Pepkor voucher in-store or online.
   * They give it as a gift.
   * The recipient redeems it later for products or services.

3. **Electricity/Utility Payments (common in SA)**

   * You buy an electricity voucher at a till.
   * The voucher code is generated, stored in the backend, and activated.
   * When you load the code into your prepaid meter, it deducts and marks as redeemed.

---

## 🔹 When Are Vouchers Activated?

* **At Point of Sale**:

  * When the voucher is purchased in-store, the backend generates a code and marks it “active.”
  * If payment fails, the voucher is never activated (to prevent free usage).

* **When Distributed Digitally**:

  * Vouchers can also be generated in bulk and activated only when a customer pays online.

* **Lifecycle**:

  1. **Generated** → unique code is created and stored.
  2. **Activated** → linked to a successful payment.
  3. **Redeemed** → customer uses the code, backend marks as “used.”
  4. **Expired (optional)** → vouchers can have expiry dates (e.g. 12 months).

---

## 🔹 How It Relates to Pepkor Fintech

Pepkor Fintech provides **financial and value-added services** that tie directly into this kind of system:

1. **Flash (Payments & Vouchers)**

   * Flash already operates voucher and airtime services across SA.
   * Your demo is essentially a mini version of how Flash redeems prepaid services.

2. **Retail Integration**

   * Pepkor’s huge retail footprint (PEP, Ackermans, Shoe City) sells prepaid vouchers, devices, and connectivity services.
   * A voucher redemption API is the backend logic that ensures every voucher sold in-store can later be redeemed securely.

3. **Fintech Infrastructure**

   * EMS (Electronic Money Solutions) relies on **idempotency** and **integrity** — vouchers must be unique, redeemable once, and tied to transactions.
   * Your Spring Boot project mirrors those **core fintech requirements**: secure API design, transactional updates, and auditability.

---

## ✅ How to Explain It in Interview

You could say:

> “This demo simulates a simplified voucher redemption service, similar to what Pepkor Fintech products like Flash would use behind the scenes. In real life, a customer buys a voucher in a PEP store, the code is activated at the till, and later redeemed for airtime or electricity. My service models that process — vouchers are generated, activated, and securely redeemed. It demonstrates REST API design, database persistence, validation, and transactional consistency, which are critical for financial services. This is the kind of backend system I’d be excited to contribute to at Pepkor Next Tech.”

---

👉 Do you want me to also add an **“activation step”** in the code (so vouchers are first generated as “inactive,” then activated after a simulated payment), to make it feel even closer to a real fintech scenario?
