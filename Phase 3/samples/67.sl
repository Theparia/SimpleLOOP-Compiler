# Main mix


class D{
    private int z
}

class S < D{
    private int x
    public int y
    public initialize(){
        2 = x
        self.z = 5
    }

}

class Main{

    public initialize(){
        S s
        int x
        x = s.x
        y = s.x
        s = S.new(1)
        s = s.z
    }

}
