package net.aluminis.eclipsemine.service.factory;

import com.google.inject.Inject;
import net.aluminis.eclipsemine.service.provider.KeybindingProvider;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;

public class KeybindingFactory {
    @Inject
    public KeybindingFactory(KeybindingProvider keybindingProvider) {
        for (KeyBinding keyBinding : keybindingProvider.get()) {
            KeyBindingHelper.registerKeyBinding(keyBinding);
        }
    }
}
