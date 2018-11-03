FROM java:8
WORKDIR /
ADD target/${artifactId}-jar-with-dependencies.jar ${artifactId}.jar
ENTRYPOINT ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java", "-jar", "${artifactId}.jar" ]
