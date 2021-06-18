package com.songqingchao.boottest;

import com.songqingchao.BoottestApplication;
import com.songqingchao.entity.PingFen;
import com.songqingchao.servcie.PingFenService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = BoottestApplication.class)
@RunWith(SpringRunner.class)
class BoottestApplicationTests {

    @Autowired
    private PingFenService pingFenService;
    @Test
    void contextLoads() {
        int i = pingFenService.insert(3);

    }

    @Test
    void query() {
        List<PingFen> pingFens = pingFenService.queryPingFen(3);
        System.out.println(pingFens);
    }

}
