import java.util.ArrayList;

/**
 * Created by Jp on 06/08/2018.
 */
public class Cube {

    private final char RED='r';
    private final char BLUE='b';
    private final char GREEN='g';
    private final char ORANGE='o';
    private final char WHITE='w';
    private final char YELLOW='y';
    private final int CUBE_SIZE =3;

    private final char[] COLORS={RED,BLUE,GREEN,ORANGE,WHITE,YELLOW};
    private final int NUMBER_FACES=COLORS.length;
    private ArrayList<char[][]> faces;

    public Cube(){
        faces=new ArrayList<>();
        initializeCube();
    }

    public void initializeCube(){
        for(int index=0;index<NUMBER_FACES;index++){
            char faceColor=COLORS[index];
            faces.add(initializeFace(faceColor));
        }
    }

    private char[][] initializeFace(char faceColor){
        char[][] face=new char[CUBE_SIZE][CUBE_SIZE];
        for(int row=0; row<CUBE_SIZE; row++){
            for (int columns=0;columns<CUBE_SIZE;columns++){
                face[row][columns]=faceColor;
            }
        }
        return face;
    }

    @Override
    public String toString(){
        String output="";
        int currentFace=1;

        for (char[][] face : faces) {
            output+="\nFace number "+currentFace+"\n";
            for (char[] line : face) {
                for (char square : line) {
                    output+=square+" ";
                }
                output+="\n";
            }
            currentFace++;
        }

        return output;
    }
}
