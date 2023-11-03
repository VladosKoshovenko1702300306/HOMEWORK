package Lason10;

 class  tringl extends Figure {
    private double SideA;
    private double SideB;
    private double SideC;
    public tringl (double SideA, double SideB, double SideC){
        this.SideA = SideA;
        this.SideB = SideB;
        this.SideC = SideC;
    }
    @Override
    public double perimeter() {
        return SideA + SideB + SideC;
    }

    public double area () {
        double s= perimeter() /2;
        return Math.sqrt( s * (s - SideA) * (s - SideB) * (s - SideC));
    }

    public  double areatwo () {
        double arc = Math.acos((SideB * SideB + SideC * SideC - SideA * SideA) / (2 * SideB * SideC));
        return  0.5 * SideB * SideC * Math.sin(arc);
    }
    public double arathre () {
        double up = 2 * area() / SideA;
        return  0.5 * SideA * up;
    }
}
