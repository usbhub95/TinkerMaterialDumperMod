// Copyright (C) 2024 Cooper Lockrey
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <https://www.gnu.org/licenses/>.

// This is where we register our command with minecraft

package usbhub95.ticmatdump.util.handlers;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import usbhub95.ticmatdump.command.CommandDumpTicMats;

@EventBusSubscriber
public class RegistryHandler {

    private RegistryHandler() {
        throw new IllegalStateException("Attempted to instantiate usbhub95.ticmatdump.util.handlers.RegistryHandler");
    }

    public static void serverRegistries(FMLServerStartingEvent event) {
        event.registerServerCommand(new CommandDumpTicMats());
    }

}
