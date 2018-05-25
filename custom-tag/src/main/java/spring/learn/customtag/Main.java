package spring.learn.customtag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Corp Created By sytown
 * @Author Chun
 * @Date 2018/5/25
 * @Time 16:57
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        String xml = "classpath*:custom.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { xml });
        System.out.println(context.getBean("test"));
    }
}
