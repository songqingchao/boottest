import com.songqingchao.BoottestApplication;
import com.songqingchao.entity.PingFen;
import com.songqingchao.mapper.PingfenMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @user candy
 * 2021/6/1322:37
 */
@SpringBootTest(classes = BoottestApplication.class)
@RunWith(SpringRunner.class)
public class PingFenTest {
    @Autowired
    private PingfenMapper pingfenMapper;

    @Test
    public void test() {
        PingFen pingFen = pingfenMapper.selectById("3 and nid = 2");
        //PingFen pingFen2 = pingfenMapper.selectById2("12;drop table test;");
        System.out.println(pingFen);
        //System.out.println(pingFen2);
    }


}
