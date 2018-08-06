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

    @Override
    public String toString(){
        String output="";
        for (char[] line : matrix) {
            for (char square:line){
                output+=square+" ";
            }
            output+="\n";
        }
        return output;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getFaceColor() {
        return faceColor;
    }

    public void setFaceColor(char faceColor) {
        this.faceColor = faceColor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
