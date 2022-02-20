package io.github.cleanroommc.modularui.widget;

public interface IWidgetDrawable {

    void drawInBackground(float partialTicks);

    default void drawInForeground(float partialTicks) {

    }
}
