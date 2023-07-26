class A {
   public int a
   public B b
}

class B
    public int b

class Main {
    private int foo(B b) {
        int i
        b.b = 10;
        (10..17).each do |i| {
            b.b = b.b + 1;
        }
        print(b.b)
        return 2;
    }

    public initialize() {
        int i, j
        A a
        (0..9).each do |i| {
            (0..i).each do |j| {
                print(i)
                print(j)
                j = j + 1
            }
            i = i + 1
        }
        print(a.a);
        a.a = a.a + 1;
        print(a.a);
        a.a = a.a + 1
        i = a.a + 1;
        print(a.a);
        print(i);

        print(a.b.b);
        a.b.b = a.b.b + 1
        print(a.b.b);
        print(self.foo(a.b));

    }
}
