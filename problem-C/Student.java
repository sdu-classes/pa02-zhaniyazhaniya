public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(String n, String a, int y, double f){
        super(n, a);
        this.year = y;
        this.fee = f;
    }

    public String getProgram(){
        return this.program;
    }

    public void setProgram(String p){
        this.program= p;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int y){
        this.year = y;
    }

    public double getFee(){
        return this.fee;
    }

    public void setFee(double f){
        this.fee = f;
    }

    @Override
    public String toString(){
        return "Student[" + super.toString()+ ",program=" + this.program+ ",year=" + this.year + ",fee=" + this.fee + "]";
    }
}
