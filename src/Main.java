/**
 * Created by Jp on 06/08/2018.
 */
public class Main {

    public static void main(String[] args){
        Cube cube=new Cube();
        System.out.println(cube);
        //cube.moveFirstRowLeft();
        //cube.moveFirstColumnUp();
        cube.moveFirstColumnDown();
        System.out.println("///////////////////////////");
        System.out.println(cube);
    }
}
