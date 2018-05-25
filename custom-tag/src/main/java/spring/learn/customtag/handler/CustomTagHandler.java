package spring.learn.customtag.handler;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @Corp Created By sytown
 * @Author Chun
 * @Date 2018/5/25
 * @Time 16:22
 * @Description
 */
public class CustomTagHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("custom", new CustomBeanDefinitionParser());
    }
}
