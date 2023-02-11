public class Square extends Rectangle{
    public Square(){
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);

    }

    @Override
    public void setWidth(double side){
        this.setWidth(side);
    }

    @Override
    public void setLength(double side){
        this.setLength(side);
    }

    @Override
    public String toString(){
        return String.format("A Square with side=%.2f, which is a subclass of %s",
                super.getWidth(),
                super.toString());
    }
}
