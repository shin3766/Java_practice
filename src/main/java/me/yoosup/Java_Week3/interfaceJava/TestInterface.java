package me.yoosup.Java_Week3.interfaceJava;

public class TestInterface extends D implements C {

    @Override
    public void a() {
        System.out.println("A");
    }

    @Override
    public void b() {
        System.out.println("B");
    }

    // 밑에 있는건 왜쓰는걸까? 어차피 상속 되는데
    @Override
    void d() {
        super.d();
    }
    public static void main(String[] args) {
        TestInterface test = new TestInterface();
        test.a();  // A
        test.b();  // B
        test.d();  // D
    }
}

interface A {
    void a();
}

interface B {
    void b();
}

interface C extends A, B {
}

class D {
    void d() {
        System.out.println("D");
    }
}