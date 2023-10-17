package com.example.spring;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

public class MyApp11 {
}

interface MyInterface2 {
    public void method2();
}

class MyClass21 implements MyInterface2 {
    @Override
    public void method2() {}
}


@Component
class MyClass22 implements MyInterface2 {
    public void method2() {}
}

@Component
@RequiredArgsConstructor
class MyClass20 {
    private final MyInterface2 field;

    public void method20() {
        field.method2();
    }
}
