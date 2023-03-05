package OOP_Practice;

class A {
    int a;
    int b;
    public void display() {
        System.out.println(a+b);
    }
}
class B extends A {
    int x;
    int y;
    public void show() {
        System.out.println(x+y);
    }
}

class C extends  B {
    int p;
    int q;
    public void addition() {
        System.out.println(p+q);
    }
}

public class Test1 {
    public static void main(String[] args) {
        A obj = new A();
        obj.a=100;
        obj.b=200;
        obj.display();

        B objB = new B();
        objB.x=10;
        objB.y=20;
        objB.show();

        objB.a=150;
        objB.b=250;
        objB.display();

        C objC = new C();
        objC.a=15;
        objC.b=200;
        objC.x=120;
        objC.y=400;
        objC.p=12;
        objC.q=100;
        objC.display();
        objC.show();
        objC.addition();
    }
}
