public class Point2 {

    public double c;
    public double d;

    public Point2(double c, double d){
        this.c = c;
        this.d = d;
    }

    public double secondcoords (){return this.c * this.c - this.d * this.d;}
    /*
    public double squaresecondcoords(){return Math.sqrt(secondcoords());}

     */
}
