import java.util.Scanner;
public class Driver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        bottle bottle1=new bottle();
        System.out.println("Bottle App V 1.0");
        bottle1.setDetails();
        bottle1.print();
        bottle bottle2=new bottle(99,99);
        bottle2.print();
        
    }
}
