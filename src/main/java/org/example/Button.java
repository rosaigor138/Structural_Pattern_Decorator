package org.example;

public class Button extends GUIDecorator{
    public Button(GUI gui){
        super(gui);
    }

    @Override
    public String getStructureName() {
        return "Button";
    }

    @Override
    public float getComponentComplexityPercentage() {
        return 3.0f;
    }

}
