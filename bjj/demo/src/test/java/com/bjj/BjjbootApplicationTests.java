package com.bjj;

import com.bjj.model.Bjj;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

@SpringBootTest
@Component
public class BjjbootApplicationTests {

    @Autowired
    private Bjj bjj;

    @Test
    public void test(){
        System.out.println(bjj.toString());
    }

}
