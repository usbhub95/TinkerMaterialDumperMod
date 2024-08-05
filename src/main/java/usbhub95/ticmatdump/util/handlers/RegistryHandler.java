package usbhub95.ticmatdump.util.handlers;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import usbhub95.ticmatdump.command.CommandDumpTicMats;

@EventBusSubscriber
public class RegistryHandler {

    public static void serverRegistries(FMLServerStartingEvent event) {
        event.registerServerCommand(new CommandDumpTicMats());
    }
}
