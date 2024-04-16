package org.example;

public class Label extends GUIDecorator{
    public Label(GUI gui) {
        super(gui);
    }

    @Override
    public String getStructureName() {
        return "Label";
    }

    @Override
    public float getComponentComplexityPercentage() {
        return 2.0f;
    }
}
