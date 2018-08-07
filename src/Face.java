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

    public char[] getRow(int rowNumber){
        return matrix[rowNumber];
    }

    public char[] getColumn(int columnNumber){
        char[] column=new char[3];
        for (int row=0; row<size;row++){
            column[row]=matrix[row][columnNumber];
        }
        return column;
    }

    public void setRow(int rowNumber, char[] newRow){
        matrix[rowNumber]=newRow;
    }

    public void setColumn(int columnNumber, char[] newColumn){
        for (int row=0; row<size;row++){
            matrix[row][columnNumber]=newColumn[row];
        }
    }

    public void rotateRight()
    {
        int newRow=0, newColumn;
        char[][] resultingMatrix = new char [size][size];
        for(int column=0; column<size;column++){
            newColumn=0;
            for(int row=size-1; row>=0;row--){
                resultingMatrix[newRow][newColumn]=matrix[row][column];
                newColumn++;
            }
            newRow++;
        }
        matrix=resultingMatrix;
    }

    public void rotateLeft()
    {
        int newRow=0, newColumn;
        char[][] resultingMatrix = new char [size][size];
        for(int column=size-1; column>=0;column--){
            newColumn=0;
            for(int row=0; row<size;row++){
                resultingMatrix[newRow][newColumn]=matrix[row][column];
                newColumn++;
            }
            newRow++;
        }
        matrix=resultingMatrix;
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
}
