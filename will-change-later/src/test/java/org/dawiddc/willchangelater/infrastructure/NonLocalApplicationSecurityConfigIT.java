package org.dawiddc.willchangelater.infrastructure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class NonLocalApplicationSecurityConfigIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("App should NOT allow free access to index.html when local profile is disabled.")
    void shouldNotAllowAccessForLocalProfileAbsent() throws Exception {
        // when + then
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection());
    }

}
