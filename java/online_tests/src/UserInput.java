import java.util.ArrayList;
import java.util.stream.Collectors;

public class UserInput {

	public static class TextInput {

		ArrayList<Character> listOfNames = new ArrayList<Character>();

		public void add(Character c) {
			listOfNames.add(c);
		}
		
		public String getValue() {
			return listOfNames.stream().map(String::valueOf).collect(Collectors.joining());
		}
	}

	public static class NumericInput extends TextInput {

		@Override
		public void add(Character c) {
			if (Character.isDigit(c)) {
				listOfNames.add(c);
			}
		}
	}

	public static void main(String[] args) {
		TextInput input = new NumericInput();
		input.add('1');
		input.add('a');
		input.add('0');
		input.add('0');
		input.add('a');
		input.add('0');
		input.add('0');
		input.add('a');
		input.add('a');
		input.add('a');
		input.add('a');
		input.add('0');
		input.add('1');
		input.add('1');
		input.add('1');
		input.add('1');
		input.add('1');
        System.out.println(input.getValue());

	}
}