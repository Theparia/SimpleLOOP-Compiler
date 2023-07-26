# Difficult

class S {
    public initialize() {
        print(20)
    }

    public fptr<int,int,int -> bool> f() {
        fptr<int,int,int -> bool> fl
        return fl
    }
}

class Main {
    public initialize() {
        D s
        bool x
        fptr<int,int,int -> bool> f
        f = s.f()
        f = self.set_test
        s = 2
        x = f == self.set_test
        x = self.set_test(1, 2, 3)
        x = self.set_test(1, 2)
        x = self.set_test(1)
        print(f(1,2, x))
        print(f(1))
    }

    private bool set_test(int x, int y, int z=12) {
        return x==2 && y==1 || z==y
    }
}
