package Lason10;

 class sqwear extends  Figure {
     private double side;

     public  sqwear  (double side){
         this.side = side;
     }
     @Override
     public double perimeter () {
         return 4 * side;
     }
     @Override
     public  double area (){
         return side * side;
     }
}
