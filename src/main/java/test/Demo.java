package test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Demo {

    public int x;
    public int y;

    public int sumOfSquare(int x, int y) {
        return (x * x) + (y * y);
    }


}
