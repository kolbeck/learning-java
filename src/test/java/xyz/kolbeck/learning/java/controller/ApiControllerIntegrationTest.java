package xyz.kolbeck.learning.java.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
public class ApiControllerIntegrationTest {
    @Autowired
    private MockMvc mvc;

    @Test
    @DisplayName("OK response when request sent to /")
    public void mustReturnOkOnGetApiRootEndpoint() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/"))
            .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
