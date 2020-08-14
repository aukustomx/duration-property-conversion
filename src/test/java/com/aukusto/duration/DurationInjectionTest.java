package com.aukusto.duration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
public class DurationInjectionTest {

    @Autowired
    private DurationInjection bean;

    @Test
    public void test() {
        bean.printDurationInjected();
    }
}
