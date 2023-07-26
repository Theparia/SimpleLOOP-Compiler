class Main{
    public initialize() {
        int x, y
        Point p
        Coordinate c
        c = Coordinate.new()
        x = 0
        y = 0
        p = Point.new(x, y)
        c.rec[0] = p.x
        p = Point.new(x + 1, y+1)
        c.rec[1] = p.y
        c.rec[2] = p.x
        print(c.rec[x + 1])
    }
}

class Point {
    public int x,y

    public initialize(int x, int y) {
        self.x = x
        self.y = y
    }

}

class Coordinate {
    public int[4] rec
}
