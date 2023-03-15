public class Cube
{
    private int side;

    public Cube(){
        side = 1;
    }
    public Cube(int s){
        side = s;
        if (s < 1){
            throw new IllegalArgumentException("cube length != < 1");
        }
    }

    public void setSide(int side){
        if (side < 1){
            throw new IllegalArgumentException("cube length != < 1");
        }
        this.side = side;
    }

    public int getSide(){return side;}
    public int getSurfaceArea(){return 6 * side**2;}
    public int getVolume(){return side**3;}
    @Override
    public String toString()
    {
        return "Cube{" +
                "side=" + side +
                '}';
    }
}