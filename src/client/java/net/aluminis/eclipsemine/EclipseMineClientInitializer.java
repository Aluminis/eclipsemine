package net.aluminis.eclipsemine;

import com.google.inject.Guice;
import com.google.inject.Injector;
import net.aluminis.eclipsemine.module.CoreModule;
import net.aluminis.eclipsemine.service.factory.KeybindingFactory;
import net.fabricmc.api.ClientModInitializer;

public class EclipseMineClientInitializer implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		Injector injector = Guice.createInjector(new CoreModule());
		injector.getInstance(KeybindingFactory.class);
	}
}