FROM openjdk:8
ADD target/EcommerceBackend.jar tmp/
EXPOSE 8080
ENTRYPOINT ["java","-jar","EcommerceBackend.jar"]
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
CMD ["java", "Main"]