package com.example.kodilla.stream.beutifier;

public class StreamMain {
    public static void main(String[] args) {                                 // [5]

        String txt = "lubie jesc mc";

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("malgosia zbiera kwiatki",(String Text) -> "$$$$$ malgosia zbiera kwiatki $$$$" );
        poemBeautifier.beautify("asia je zupe",(String Text) -> "AsIa Je ZuPe" );
        poemBeautifier.beautify("lubie jesc mc", FunctionalBeauty:: ADDA);


    }
}
