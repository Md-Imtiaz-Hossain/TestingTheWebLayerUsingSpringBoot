package com.imtiaz.testingtheweblayerusingspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @Value(value = "${local.server.port}")
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        assertThat(this.restTemplate.getForObject
                ("http://localhost:" + port + "/", String.class))
                .contains("Hello, World");
    }

    @Test
    public void myMethod() throws Exception {
        assertThat(this.restTemplate.getForObject
                ("http://localhost:" + port + "/myM", String.class))
                .contains("Welcome to - myMethod");
    }

    @Test
    public void myMethod2() throws Exception {
        assertThat(this.restTemplate.getForObject
                ("http://localhost:" + port + "/myM2", String.class))
                .contains("10");
    }

}
