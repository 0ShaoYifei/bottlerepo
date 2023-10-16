import java.util.Scanner;

public class bottle {
    private float height;
    private int volume;
    bottle(){}
    bottle(float height ,int volume){
        this.height=height;
        this.volume=volume;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public  void setDetails(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a Height:");
        float tempHeight=input.nextFloat();
        this.height=tempHeight;
        System.out.println("Please enter a Volume :");
        int tempVolume=input.nextInt();
        this.volume=tempVolume;
    }
    public float getHeight(float height){return this.height;}
    public int getVolume(int volume){return this.volume;}
    public void print(){
        System.out.println("The Bottle Height is"+this.height+"cm");
        System.out.println("The Bottle Volume is"+this.volume+"ml");
    }

}