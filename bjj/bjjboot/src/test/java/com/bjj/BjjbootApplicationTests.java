package com.bjj;

import com.bjj.model.Bjj;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BjjbootApplicationTests {

    @Autowired
    private Bjj bjj;

    @Test
    void contextLoads() {
        System.out.println(bjj);
    }

}
