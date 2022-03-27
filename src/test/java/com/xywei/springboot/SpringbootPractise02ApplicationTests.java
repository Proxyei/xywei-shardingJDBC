package com.xywei.springboot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.Assert;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
class SpringbootPractise02ApplicationTests {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testHomePage(){
        try {
            MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/home");
            ResultActions resultActions = mockMvc.perform(requestBuilder);
            String contentAsString = resultActions.andExpect(MockMvcResultMatchers.status().isOk()).andReturn().getResponse().getContentAsString();
            System.out.println(contentAsString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetAllEmployee() {

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/employee/getAllEmployee");
        try {
            ResultActions resultActions = mockMvc.perform(requestBuilder);
            MvcResult mvcResult = resultActions.andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();
            String contentAsString = mvcResult.getResponse().getContentAsString();
            Assert.notNull(contentAsString, "Error! result should be not null!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
