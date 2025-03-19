package net.aluminis.eclipsemine.service.provider;

import net.aluminis.eclipsemine.model.keybinding.VeinminingKeybinding;
import net.minecraft.client.option.KeyBinding;

import javax.inject.Provider;
import java.util.Set;

public class KeybindingProvider implements Provider<Set<KeyBinding>> {
    private final Set<KeyBinding> keybindings = Set.of(new KeyBinding[]{
            new VeinminingKeybinding()
    });

    @Override
    public Set<KeyBinding> get() {
        return keybindings;
    }
}
