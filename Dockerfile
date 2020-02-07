FROM deepexi/java-skywalking:v0.0.2

WORKDIR /home


COPY ./deepexi-spring-cloud-provider/target/app.jar /home

ADD entrypoint.sh /

RUN chmod +x /entrypoint.sh

ENTRYPOINT ["/entrypoint.sh"]
