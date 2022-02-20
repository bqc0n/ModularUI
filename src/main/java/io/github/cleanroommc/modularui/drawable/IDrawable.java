package io.github.cleanroommc.modularui.drawable;

import io.github.cleanroommc.modularui.api.math.Pos2d;
import io.github.cleanroommc.modularui.api.math.Size;
import io.github.cleanroommc.modularui.widget.DrawableWidget;

import javax.annotation.Nullable;

@FunctionalInterface
public interface IDrawable {

	IDrawable EMPTY = (pos, size, partialTicks) -> { };

	void draw(Pos2d pos, Size size, float partialTicks);

	default void tick() {
	}

	@Nullable
	default Size estimateSize() {
		return null;
	}

	default DrawableWidget asWidget() {
		return new DrawableWidget().setDrawable(this);
	}
}
