package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyApp3 {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(MyApp3.class, args);// packgae 하위에 component 붙어 있으면 다 인스턴스 만들어버리기
        MyClass4 bean = context.getBean("mybean4", MyClass4.class);
        MyClass5 bean1 = context.getBean("myClass5", MyClass5.class);
        System.out.println("bean = " + bean);
        System.out.println("bean1 = " + bean1);

        Object bean2 = context.getBean("controller02");
        System.out.println("bean2 = " + bean2);

        Object bean3 = context.getBean("myApp3");
        System.out.println("bean3 = " + bean3);
    }
}

@Component  // spring bean의 이름을 명시하지 않으면 클래스이름 -> lowerCamelCase으로 바꾼게 곧 bean의 이름(myClass5)
class MyClass5 {    // myClass5 (bean의 이름)

}

@Component("mybean4")   //bean의 이름을 명시하고 싶을때는 작성
class MyClass4 {

}
