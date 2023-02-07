package com.ngochung.springbootk8syaml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootK8sYamlApplication {

    @GetMapping("/")
    public String index() {
        return "I'm programer";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootK8sYamlApplication.class, args);
    }

}
