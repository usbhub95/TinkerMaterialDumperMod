// Copyright (C) 2024 Cooper Lockrey
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <https://www.gnu.org/licenses/>.

// This is the main class of the mod

package usbhub95.ticmatdump;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import usbhub95.ticmatdump.proxy.CommonProxy;
import usbhub95.ticmatdump.util.Meta;
import usbhub95.ticmatdump.util.handlers.RegistryHandler;

@Mod(modid = Meta.MOD_ID, useMetadata = Meta.USE_METADATA)
public class Main {

    // main class of the mod, mod siding, events and such
    @Instance
    public static Main instance;

    // configure sides
    @SidedProxy(clientSide = Meta.CLIENT_PROXY, serverSide = Meta.COMMON_PROXY)
    public static CommonProxy proxy;

    // register event necessary event handlers
    @EventHandler
    public static void serverInit(FMLServerStartingEvent event) {
        RegistryHandler.serverRegistries(event);
    }

}
