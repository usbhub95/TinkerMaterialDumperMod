package usbhub95.ticmatdump.util;

public class Meta {
    // metadata class for info given to @Mod
    private Meta() {
        throw new IllegalStateException("Attempted to instantiate the Meta class.");
    }

    public static final String MOD_ID = "ticmatdump";
    public static final boolean USE_METADATA = true;
    public static final String COMMON_PROXY = "usbhub95.ticmatdump.proxy.CommonProxy";
    public static final String CLIENT_PROXY = "usbhub95.ticmatdump.proxy.ClientProxy";
}
