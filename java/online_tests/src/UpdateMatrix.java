import java.util.Arrays;

public class UpdateMatrix {

	public static void main(String[] args) {

		String[][] matrix = new String[3][3];
		Arrays.fill(matrix[0], "false");
		Arrays.fill(matrix[1], "false");
		Arrays.fill(matrix[2], "false");

		System.out.println(Arrays.deepToString(matrix[0]));
		System.out.println(Arrays.deepToString(matrix[1]));
		System.out.println(Arrays.deepToString(matrix[2]));

		matrix[0][0] = "true";
		
		String[][] matrixUpdate = update(matrix);
		
		System.out.println(Arrays.deepToString(matrixUpdate[0]));
		System.out.println(Arrays.deepToString(matrixUpdate[1]));
		System.out.println(Arrays.deepToString(matrixUpdate[2]));
		
	}

	private static String[][] update(String[][] matrixOriginal) {

		String[][] matrix = new String[3][3];
		Arrays.fill(matrix[0], "false");
		Arrays.fill(matrix[1], "false");
		Arrays.fill(matrix[2], "false");

		// revisar todo matrixoriginal
		for (int i = 0; i < matrixOriginal.length; i++) {
			for (int j = 0; j < matrixOriginal[i].length; j++) {
				if (matrixOriginal[i][j].contains("true")) {
					// cambiar todo el row y columns

					// cambiar vertical
					for (int x = 0; x < matrixOriginal.length; x++) {
						matrix[x][j] = "true";
					}

					// cambiar horizontal
					Arrays.fill(matrix[i], "true");

				}
			}
		}
		
		return matrix;

	}

}
