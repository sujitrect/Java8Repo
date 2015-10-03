package com.sujit.j8.funciface;

public class FIfaceIntro {
	public static void main(String[] args) {
		Converter<String, Integer> converter = (from) -> Integer.parseInt(from);
		Integer converted = converter.convert("123");
		System.out.println(converted);    // 123
	}
}

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
