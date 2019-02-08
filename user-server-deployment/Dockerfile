FROM java:openjdk-8-jdk
ADD /target/user-server-swarm.jar /opt/runnable.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","-Djava.net.preferIPv4Stack=true","-Djavacd.net.preferIPv4Addresses=true", "-XX:MaxRAM=1024m","/opt/runnable.jar"]