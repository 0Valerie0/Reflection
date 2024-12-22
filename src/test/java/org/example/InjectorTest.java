package org.example;

import junit.framework.TestCase;

public class InjectorTest extends TestCase {

    public static void main(String[] args) {
        SomeBean sb = new Injector().inject(new SomeBean());
        sb.foo(); // Выведет "A" и "C"
    }
}
