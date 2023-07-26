class A {
    public fptr<int->void> a;
}

class Main {
    public void bar(int aa)
        print(aa);
    public void foo(int a) {
        print(a)
        self.bar(a)
    }
    public initialize() {
        A a
        a = A.new()
        a.a = self.foo
        a.a(7)
    }
}
