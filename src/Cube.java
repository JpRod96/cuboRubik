import java.util.ArrayList;

/**
 * Created by Jp on 06/08/2018.
 */
public class Cube {

    private final String[] FACES_NAMES={"Front","Back","Left","Right","Top","Bottom"};
    private final char RED='r';
    private final char BLUE='b';
    private final char GREEN='g';
    private final char ORANGE='o';
    private final char WHITE='w';
    private final char YELLOW='y';
    private final int CUBE_SIZE = 3;

    private final char[] COLORS={RED,BLUE,GREEN,ORANGE,WHITE,YELLOW};
    private final int NUMBER_FACES=COLORS.length;
    private ArrayList<Face> faces;

    public Cube(){
        faces=new ArrayList<>();
        initializeCube();
    }

    public void initializeCube(){
        for(int index=0;index<NUMBER_FACES;index++){
            char faceColor=COLORS[index];
            String faceName=FACES_NAMES[index];
            faces.add(new Face(faceName,faceColor,CUBE_SIZE));
        }
    }

    @Override
    public String toString(){
        String output="";

        for (Face face : faces) {
            String faceName=face.getName();
            output+="\n"+faceName+" face \n"+face;
        }

        return output;
    }
}
