package net.aluminis.eclipsemine.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import net.aluminis.eclipsemine.annotation.ModId;
import net.aluminis.eclipsemine.service.provider.ItemsProvider;

public class CoreModule extends AbstractModule {
    @Provides
    @ModId
    static String provideModId() {
        return "eclipsemine";
    }
}
