package com.sujit.j8.funciface;

class FIfaceIntroDCOLKeyWord {
	public static void main(String[] args) {
		Something something = new Something();
		Converter<String, String> converter = something::startsWith;
		String converted = converter.convert("Java");
		System.out.println(converted);  
	}
}

class Something {
    String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }
}
