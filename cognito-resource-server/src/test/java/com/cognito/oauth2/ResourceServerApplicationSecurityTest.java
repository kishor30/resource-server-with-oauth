package com.cognito.oauth2;


import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;



@WebMvcTest
@ExtendWith(SpringExtension.class)
class ResourceServerApplicationSecurityTest {

    @Autowired
    private MockMvc mockMvc;


}