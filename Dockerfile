FROM java:8  
ADD /target/SpringBootJenkinsPipeline.jar SpringBootJenkinsPipeline.jar
ENTRYPOINT ["java", "-jar", "SpringBootJenkinsPipeline.jar"]
