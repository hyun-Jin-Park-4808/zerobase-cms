FROM openjdk:11-jre-slim
COPY build/libs/order-api.jar order-api.jar
ENTRYPOINT ["java", "-DSpring.profies.active=prod","-jar","order-api.jar"]