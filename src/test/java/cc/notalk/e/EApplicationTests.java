package cc.notalk.e;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import cc.notalk.e.controller.EStartController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EApplicationTests {
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new EStartController()).build();

    }

    @Test
    public void getHello() throws Exception {
        ResultActions resultActions = mvc.perform(MockMvcRequestBuilders.get("/hw").accept(MediaType.APPLICATION_JSON));
        resultActions.andExpect(status().isOk()).andExpect(content().string("hw"));
    }

}
