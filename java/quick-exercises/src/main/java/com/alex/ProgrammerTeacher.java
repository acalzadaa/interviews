package com.alex;
import java.util.*;

class Programmer {
	private Set<String> languages = new HashSet<>();

	public Collection<String> getLanguages() {
		return languages;
	}

	public void addLanguage(String language) {
		languages.add(language);
	}

}

class ProgrammerTeacher extends Programmer {
	public static void main(String[] args) {
		ProgrammerTeacher teacher = new ProgrammerTeacher();
		teacher.addLanguage("Java");
		teacher.addLanguage("c");

		System.out.println(teacher.teach(teacher, "Java"));

		for (String language : teacher.getLanguages())
			System.out.println(language);

	}

	public boolean teach(Programmer programmer, String language) {
		return programmer.getLanguages().contains(language);
	}
}