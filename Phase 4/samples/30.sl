class Main{
	public initialize(){
		int[1][2][3][4][5] x
		int i1, i2, i3, i4, i5
		(0..0).each do |i1|{
            (0..1).each do |i2|{
                (0..2).each do |i3|{
                    (0..3).each do |i4|{
                        (0..4).each do |i5|{
                               x[i1][i2][i3][i4][i5] = i3 * i4 * i5
                        }
                    }
                }
            }
		}
		(0..0).each do |i1|{
                    (0..1).each do |i2|{
                        (0..2).each do |i3|{
                            (0..3).each do |i4|{
                                (0..4).each do |i5|{
                                       print(x[i1][i2][i3][i4][i5])
                                }
                            }
                        }
                    }
        		}
	}
}
