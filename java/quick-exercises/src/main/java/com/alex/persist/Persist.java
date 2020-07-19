package com.alex.persist;

public class Persist {

	public static int persistence(long number) {

		if (number < 10) {
			return 0;
		}

		int acum = 1;
		long result = 0;
		long reminder = 0;
		while (number > 0) {
			// cual es el resultado?
			result = number / 10;
			// cual es el residuo?
			reminder = number % 10;
			// agregar acumulador
			acum *= reminder;
			if (reminder == 0) {
				return 1;
			}

			number -= reminder;
			number /= 10;

		}

		return 1 + persistence(acum);
	}

}
