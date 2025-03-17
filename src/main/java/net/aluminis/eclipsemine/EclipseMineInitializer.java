package net.aluminis.eclipsemine;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import net.aluminis.eclipsemine.module.CoreModule;
import net.aluminis.eclipsemine.service.factory.ItemFactory;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EclipseMineInitializer implements ModInitializer {
	public static final String MOD_ID = "eclipsemine";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Injector injector = Guice.createInjector(new CoreModule());
		injector.getInstance(ItemFactory.class);
	}
}