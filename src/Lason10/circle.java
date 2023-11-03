package Lason10;

 class circle  extends  Figure{
    private double radius;
    public circle  (double radius){
        this.radius=radius;
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    @Override

    public  double area(){
        return Math.PI * radius * radius;
    }
}
