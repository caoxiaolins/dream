package com.dream;

import com.dream.component.JavaMailComponent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description:
 * User: caoxiaolin
 * Date: 2018-03-16
 * Time: 15:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTest {
    @Autowired
    private JavaMailComponent javaMailComponent;

    @Test
    public void test(){
        this.javaMailComponent.sendMail("854019134@qq.com");
        this.javaMailComponent.sendMail("785673332@qq.com");
        this.javaMailComponent.sendMail("w335963076@qq.com");
        this.javaMailComponent.sendMail("347571938@qq.com");
    }
}
