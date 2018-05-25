package spring.learn.customtag.handler;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;
import spring.learn.customtag.CustomTag;

/**
 * @Corp Created By sytown
 * @Author Chun
 * @Date 2018/5/25
 * @Time 16:43
 * @Description
 */
public class CustomBeanDefinitionParser implements BeanDefinitionParser {
    @Override
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        String id = element.getAttribute("id");
        String name = element.getAttribute("name");
        RootBeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClass(CustomTag.class);
        beanDefinition.getPropertyValues().addPropertyValue("name", name);
        parserContext.getRegistry().registerBeanDefinition(id, beanDefinition);
        return beanDefinition;
    }
}
