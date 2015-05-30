/**
 * Created by harikris on 30/05/15.
 */
public class HorizontalLine extends Line {
    HorizontalLine(Integer size) {
        super(size);
    }

    void draw() {
        for (Integer i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
