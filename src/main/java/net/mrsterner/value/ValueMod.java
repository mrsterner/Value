package net.mrsterner.value;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.mrsterner.value.setup.Registration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ValueMod.MOD_ID)
public class ValueMod {
    public static final String MOD_ID = "value";

    private static final Logger LOGGER = LogManager.getLogger();

    public ValueMod() {
        Registration.register();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}
