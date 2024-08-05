package usbhub95.ticmatdump;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import usbhub95.ticmatdump.util.Meta;

@Mod(modid = Meta.MOD_ID, useMetadata = Meta.USE_METADATA)
public class Main {
    // main class of the mod, mod siding, events and such
    @Instance
    public static Main instance;

    // configure sides
    @SidedProxy(clientSide = Meta.CLIENT_PROXY, serverSide = Meta.COMMON_PROXY)
    public static CommonProxy proxy;

    // register loading events
    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {}
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {}
    @EventHandler
    public static void init(FMLInitializationEvent event) {}
}
