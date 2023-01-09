package com.imtiaz.testingtheweblayerusingspringboot;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private HomeController homeController;

    //Sanity Test to check if the application context starts or not
    @Test
    public void contextLoads() throws Exception {
        assertThat(homeController).isNotNull();
    }

}

//    What is Smoke Testing
//In simple terms, smoke tests means verifying the important features are working and there are no showstoppers
// in the build that is under testing.

//    Smoke Testing is a software testing process that determines whether the deployed software build is stable or not.
//    Smoke testing is a confirmation for QA team to proceed with further software testing.
//    It consists of a minimal set of tests run on each build to test software functionalities.
//    Smoke testing is also known as “Build Verification Testing” or “Confidence Testing.”
