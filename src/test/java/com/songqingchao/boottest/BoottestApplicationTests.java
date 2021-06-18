package com.songqingchao.boottest;

import com.songqingchao.BoottestApplication;
import com.songqingchao.servcie.PingFenService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = BoottestApplication.class)
@RunWith(SpringRunner.class)
class BoottestApplicationTests {

    @Autowired
    private PingFenService pingFenService;
    @Test
    void contextLoads() {
        int i = pingFenService.insert(3);

    }

}
