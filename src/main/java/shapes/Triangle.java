package shapes;

/**
 * Created by Guest on 7/31/17.
 */
public class Triangle {
    public int sideA;
    public int sideB;
    public int sideC;

    public Triangle(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public boolean isAtriangle(){
        return ((sideA + sideB) > sideC) &&((sideA + sideC) > sideB) && ((sideB + sideC) > sideA);
    }
    public boolean isScalene(){
        return ((sideA != sideB) && (sideA!=sideC) && (sideB != sideC));
    }
    public boolean isIsosceles(){
        return ((sideA == sideB) || (sideB== sideC)||(sideA== sideC));
    }
    public boolean isEquilateral(){
        return ((sideA == sideB)&&(sideB == sideC));
    }
}
