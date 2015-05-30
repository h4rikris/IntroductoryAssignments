/**
 * Created by harikris on 30/05/15.
 */
public class RightTriangle extends Triangle{
    public RightTriangle(Integer size) {
        super(size);
    }
    public void draw(){
        for(Integer i=1;i<=size;i++){
            for (Integer eachRow=0;eachRow<i;eachRow++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
