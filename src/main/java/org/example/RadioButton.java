package org.example;

public class RadioButton extends GUIDecorator{
    public RadioButton(GUI gui) {
        super(gui);
    }

    @Override
    public String getStructureName() {
        return "RadioButton";
    }

    @Override
    public float getComponentComplexityPercentage() {
        return 4.0f;
    }
}
