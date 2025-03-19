package net.aluminis.eclipsemine.model.keybinding;

import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class VeinminingKeybinding extends KeyBinding {
    public VeinminingKeybinding() {
        super("keybind.eclipsemine.veinmine", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_GRAVE_ACCENT, "category.eclipsemine");
    }
}
