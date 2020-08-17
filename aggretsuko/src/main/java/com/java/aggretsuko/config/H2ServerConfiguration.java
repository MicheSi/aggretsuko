package com.java.aggretsuko.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class H2ServerConfiguration {
    // creating tcp port
    @Value("{h2.tcp.port:9092}")
    private String h2WebPort;

    // creating web port
    @Value("{h2.web.port:8082}")
    private String h2WebPort;
}
