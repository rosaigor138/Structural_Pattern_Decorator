package org.example;

public abstract class GUIDecorator implements GUI{
    private GUI gui;
    public String Structure;

    public GUIDecorator(GUI gui) {
        this.gui = gui;
    }

    public abstract String getStructureName();
    public abstract float getComponentComplexityPercentage();

    public GUI getGui() {
        return gui;
    }

    public void setGui(GUI gui) {
        this.gui = gui;
    }
    public String getStructure() {
        return this.gui.getStructure() + "/" + this.getStructureName();
    }

    @Override
    public float getComponentsComplexity() {
        return this.gui.getComponentsComplexity() * (1 + (this.getComponentComplexityPercentage() / 100));
    }
}
