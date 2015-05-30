/**
 * Created by harikris on 30/05/15.
 */
public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(Integer size) {
        super(size);
    }
    void draw(){
        Integer numAst=1;
        for(Integer i=size;i>0;i--){
            for(Integer eSpace=0;eSpace<i-1;eSpace++){
                System.out.print(" ");
            }
            for(Integer ast=0;ast<numAst;ast++){
                System.out.print("*");
            }
            System.out.println();
            numAst+=2;
        }
    }

}
