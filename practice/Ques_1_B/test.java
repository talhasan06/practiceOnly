package practice.Ques_1_B;

public class test extends demo{
    public static void main(String[] args) {
        Vehicle cng=new demo(){
            public void fuelType(){
                System.out.println("Uses LPG");
            }
        };
        cng.fuelType();
        Vehicle airplane =new demo(){
            public void fuelType(){
                System.out.println("Uses Jet Fuel");
            }
        };
        airplane.fuelType();
    }
}
