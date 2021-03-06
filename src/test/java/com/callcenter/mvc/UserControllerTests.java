package com.callcenter.mvc;

import org.junit.Test;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * callcenter
 * UserBean: Kauê Q. Carbonari
 * Date: 8/18/13
 * Time: 12:08 PM
 */
public class UserControllerTests extends AppTests {

    @Test
    public void findLee() throws Exception {
        mockMvc.perform(get("/user/1").accept(MediaType.parseMediaType("application/json")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.login").value("blee"))
                .andExpect(jsonPath("$.password").value("!@#$%^&*^%"));
    }

    @Test
    public void addLee() throws Exception {
        mockMvc.perform(put("/user").contentType(MediaType.APPLICATION_JSON)
                .content("{\n \"login\": \"blee\"\n" +
                        "    , \"password\": \"!@#$%^&*^%\"\n" +
                        "}"))
                .andExpect(status().isOk());
    }

    @Test
    public void updateLee() throws Exception {
        mockMvc.perform(post("/user").contentType(MediaType.APPLICATION_JSON)
                .content("{\n \"login\": \"bruce.lee\"\n" +
                        "    , \"password\": \"!@#$%^&*^%\"\n" +
                        "}"))
                .andExpect(status().isOk());
    }

    @Test
    public void deleteLee() throws Exception {
        mockMvc.perform(delete("/user/1"))
                .andExpect(status().isOk());
    }

}
