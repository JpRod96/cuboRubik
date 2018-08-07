import java.util.ArrayList;

/**
 * Created by Jp on 06/08/2018.
 */
public class Cube {

    private final String[] FACES_NAMES={"Front","Right","Back","Left","Top","Bottom"};
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

    public void moveFirstRowRight(){
        int firstRow=0;
        moveRow(firstRow,true);
    }

    public void moveFirstRowLeft(){
        int firstRow=0;
        moveRow(firstRow,false);
    }

    //TODO haz lo que queda huaquita, confio en ti <3
    /*public void moveFirstColumnUp(){
        int firstColumn=0;
        moveColumn(firstColumn,true);
    }

    private void moveColumn(){

    }*/

    private void moveRow(int rowNumber, boolean direction){
        if(direction){
            char[] switchingRow=faces.get(3).getRow(rowNumber);
            for(int faceNumber=0;faceNumber<4;faceNumber++){
                Face currentFace=faces.get(faceNumber);
                char[] oldRow=currentFace.getRow(rowNumber);
                currentFace.setRow(rowNumber,switchingRow);
                switchingRow=oldRow;
            }
            if(rowNumber==0){
                faces.get(4).rotateRight();
            }
            if(rowNumber==CUBE_SIZE-1){
                faces.get(5).rotateRight();
            }
        }
        else{
            char[] switchingRow=faces.get(1).getRow(rowNumber);
            for(int faceNumber=3;faceNumber>=0;faceNumber--){
                Face currentFace=faces.get(faceNumber);
                char[] oldRow=currentFace.getRow(rowNumber);
                currentFace.setRow(rowNumber,switchingRow);
                switchingRow=oldRow;
            }
            if(rowNumber==0){
                faces.get(4).rotateLeft();
            }
            if(rowNumber==CUBE_SIZE-1){
                faces.get(5).rotateLeft();
            }
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
