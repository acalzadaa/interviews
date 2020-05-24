package com.alex;

public class RoutePlanner {

	public static boolean routeExists(int fromRow, int fromColumn, int toRow, int toColumn, boolean[][] mapMatrix) {
		boolean flagX = false;
		boolean flagY = false;

		if (!mapMatrix[fromRow][fromColumn]) {
			return false;
		}

		// debo ir a la arriba?
		if (fromRow > toRow)
			if (mapMatrix[fromRow - 1][fromColumn]) {
				fromRow--;
				flagX = true;
			}
		
		// debo ir a abajo?
		if (fromRow < toRow)
			if (mapMatrix[fromRow + 1][fromColumn]) {
				fromRow++;
				flagX = true;
			}

		// si vas a ir arriba/abajo no buscar ir arriba/abajo

		if (!flagX) {

			// debo ir izquierda?
			if (fromColumn < toColumn)
				if (mapMatrix[fromRow][fromColumn + 1]) {
					fromColumn++;
					flagY = true;
				}

			// debo ir derecha?
			if (fromColumn > toColumn)
				if (mapMatrix[fromRow][fromColumn - 1]) {
					fromColumn--;
					flagY = true;
				}
		}
		
		// ya llegue?
		if (fromRow == toRow && fromColumn == toColumn)
			return true;

		// si no me muevo en ningun eje... enviar falso

		if (flagX == false && flagY == false)
			return false;
		else
			return routeExists(fromRow, fromColumn, toRow, toColumn, mapMatrix);

	}

	public static void main(String[] args) {
		boolean[][] mapMatrix = { { true, false, false }, { true, false, false }, { true, false, true } };

		System.out.println(routeExists(0, 0, 2, 2, mapMatrix));
	}
}