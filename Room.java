public class Room {
     private double l ;
74++++++++    private double b ;

    public void setL(double l){
        this.l = l ;
    }

    public double getL() {
        return l;
    }

    public void setB(double b){
        this.b = b ;
    }

    public double getB() {
        return b;
    }
    public void findArea(){
        System.out.println("Find Area :" +(l*b));
    }
    public void perimeter(){
        System.out.println("Perimeter:" +(2*(l+b)));
    }
    public String toString(){
        return ("Length :"+l)+"\n"+("Breath :"+b);
    }
}
public class Building {
    public static void main(String[] args) {
        Room room =new Room();

        System.out.println("Room1 Detail");
        System.out.println(room);
        //here inzitialing value
        room.setL(10);
        room.setB(20);

        System.out.println("Room1 Detail");
        System.out.println(room);

        room.findArea();
        room.perimeter();
    }
}

