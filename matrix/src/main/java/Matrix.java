
class Matrix {

    private int[][] matrix;

    Matrix(String matrixAsString) {
        String[] tempLine = matrixAsString.split("\n");
        matrix = new int[tempLine.length][tempLine[0].split(" ").length];
        for(int i = 0; i < matrix.length; i++) {
            String[] strRow = tempLine[i].split(" ");
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(strRow[j]);
            }
        }
    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber-1];
    }

    int[] getColumn(int columnNumber) {
        int[] column = new int[matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            column[i] = matrix[i][columnNumber - 1];
        }
        return column;
    }
}
