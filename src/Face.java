/**
 * Created by Jp on 06/08/2018.
 */
public class Face {
    private String name;
    private char[][] matrix;
    private char faceColor;
    private int size;

    public Face(String name,char faceColor, int size){
        this.faceColor=faceColor;
        this.size=size;
        this.name=name;
        matrix=new char[size][size];
        initializeFace();
    }

    private void initializeFace(){
        for(int row=0; row<size; row++){
            for (int columns=0;columns<size;columns++){
                matrix[row][columns]=faceColor;
            }
        }
    }
}
