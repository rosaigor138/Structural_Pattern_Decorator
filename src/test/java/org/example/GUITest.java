package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GUITest {

    @Test
    void shouldReturnComponentsComplexity() {
        GUI gui = new MainWindow(100.0f);

        assertEquals(100.0f, gui.getComponentsComplexity());
    }
    @Test
    void shouldReturnComponentsComplexityWithLabel() {
        GUI gui = new Label(new MainWindow(100.0f));

        assertEquals(102.0f, gui.getComponentsComplexity());
    }
    @Test
    void shouldReturnComponentsComplexityWithButton() {
        GUI gui = new Button(new MainWindow(100.0f));

        assertEquals(103.0f, gui.getComponentsComplexity());
    }
    @Test
    void shouldReturnComponentsComplexityWithRadioButton() {
        GUI gui = new RadioButton(new MainWindow(100.0f));

        assertEquals(104.0f, gui.getComponentsComplexity());
    }
    @Test
    void shouldReturnComponentsComplexityWithLabelAndButton() {
        GUI gui = new Label(new Button(new MainWindow(100.0f)));

        assertEquals(105.06f, gui.getComponentsComplexity());
    }
    @Test
    void shouldReturnComponentsComplexityWithLabelAndButtonAndRadioButton() {
        GUI gui = new Label(new Button(new RadioButton(new MainWindow(100.0f))));

        assertEquals(109.26239f, gui.getComponentsComplexity());
    }
    @Test
    void shouldReturnGuiStructure() {
        GUI gui = new MainWindow();

        assertEquals("MainWindow", gui.getStructure());
    }
    @Test
    void shouldReturnGuiStructureWithLabel() {
        GUI gui = new Label(new MainWindow());

        assertEquals("MainWindow/Label", gui.getStructure());
    }
    @Test
    void shouldReturnGuiStructureWithLabelAndRadioButton() {
        GUI gui = new RadioButton(new Label(new MainWindow()));

        assertEquals("MainWindow/Label/RadioButton", gui.getStructure());
    }
    @Test
    void shouldReturnGuiStructureWithLabelAndRadioButtonAndButton() {
        GUI gui = new Button(new RadioButton(new Label(new MainWindow())));

        assertEquals("MainWindow/Label/RadioButton/Button", gui.getStructure());
    }


}