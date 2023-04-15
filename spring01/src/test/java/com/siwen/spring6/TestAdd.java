package com.siwen.spring6;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring6
 * @package: com.siwen.spring6
 * @className: TestAdd
 * @author: 749291
 * @description: TODO
 * @date: 4/14/2023 4:47 PM
 * @version: 1.0
 */

public class TestAdd {
    @Test
    public void testAdd() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Add add = (Add) classPathXmlApplicationContext.getBean("add");
    }
}