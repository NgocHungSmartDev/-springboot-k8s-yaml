FROM eclipse-temurin:17-jdk-focal
EXPOSE 8080

ADD target/springboot-k8s-yaml-0.0.1-SNAPSHOT.jar springboot-k8s-demo.jar
ENTRYPOINT ["java","-jar","/springboot-k8s-demo.jar"]