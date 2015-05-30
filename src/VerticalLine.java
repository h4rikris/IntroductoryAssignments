/**
 * Created by harikris on 30/05/15.
 */
public class VerticalLine extends Line {
    VerticalLine(Integer size) {
        super(size);
    }

    void draw() {
        for (Integer i = 0; i < size; i++) {
            System.out.println("*");
        }
    }
}
