# Proof of concept : 1 to 1 chat feature for Your Car Your Way App

This project was generated with [Java Spring](https://spring.io) and [MongoDB] NoSQL database.

## Database

If you already have a MongoDB database running, you may change credentials in `application.yml` configuration file.
Anyway, you may `docker compose up -d` the root folder to create a container with MongoDB and correct credentials, for tests purpose.

## App

Run as `Spring Boot App` for a dev server. Navigate to `http://localhost:8088/`.

Run `mvn package / mvn install` to build the jar for the project. The build artifacts will be stored in the `target/` directory, and can be served into your server folder (Apache, Nginx, etc.)

## How it works

This app contains the full Back-End based on websocket protocols to provide a near real time full duplex way to chat with customer service.

Open 3 different pages on `http://localhost:8088/` :

- One's nickname must be `Support`, as it is the Customer Service account in this PoC
- Two others may have any nickname, they are customers

Support can talk to any customer, customers may only talk to support.

## Disclaimer

This is a Proof of Concept, a test version only.
This app IS NOT secured and SHOULD NOT be used as is.
