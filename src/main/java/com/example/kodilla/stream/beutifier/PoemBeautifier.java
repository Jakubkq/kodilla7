package com.example.kodilla.stream.beutifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator) {
        String newText = poemDecorator.decorate(text);
        System.out.println("results :" + newText);
    }
}
