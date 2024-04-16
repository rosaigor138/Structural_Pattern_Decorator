package org.example;

public class MainWindow implements GUI{
    float componentComplexity;

    public MainWindow() {}
    public MainWindow(float componentComplexity) {
        this.componentComplexity = componentComplexity;
    }

    @Override
    public String getStructure() {
        return "MainWindow";
    }

    @Override
    public float getComponentsComplexity() {
        return this.componentComplexity;
    }
}
