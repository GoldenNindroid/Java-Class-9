package codingal.SecondSetOfClasses.classNine;

class volume{

    public double getvolume(){
        return 0;
    }
    
}


class prism extends volume{
    private double base;
    private double height;
    private double length;
    public prism(double base, double height, double length){
        this.base = base;
        this.height = height;
        this.length = length;
    }

    public double getvolume() {
        return 0.5 * base * height * length;
    }    
}

class cube extends volume{
    private double side;
    public cube(double side) {
        this.side = side;
    }

    public double getvolume(){
        return side * side * side;
    }

}

class Main{
    public static void main(String[] args) {
        
    
    volume[] obj = new volume[2];

    obj[0] = new prism(7, 5, 2);
    obj[1] = new cube(4);

    System.out.println("Volume of triangle = " + obj[0].getvolume());
    System.out.println("Volume of square = " + obj[1].getvolume());
    }
}
