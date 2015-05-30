/**
 * Created by harikris on 30/05/15.
 */
public class Diamond extends Shape {
    public Diamond(Integer size) {
        super(size);
    }

    @Override
    void draw() {
        Integer numAst = 1;
        for (Integer i = size; i > 0; i--) {
            for (Integer eSpace = 0; eSpace < i - 1; eSpace++) {
                System.out.print(" ");
            }
            for (Integer ast = 0; ast < numAst; ast++) {
                System.out.print("*");
            }
            System.out.println();
            numAst += 2;
        }
        numAst -= 4;
        for (Integer i = 1; i < size; i++) {
            for (Integer eSpace = 0; eSpace < i; eSpace++) {
                System.out.print(" ");
            }
            for (Integer ast = 0; ast < numAst; ast++) {
                System.out.print("*");
            }
            System.out.println();
            numAst -= 2;
        }
    }
}
