// Copyright (C) 2024 Cooper Lockrey
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <https://www.gnu.org/licenses/>.

// This class determines the behaviour of our command

package usbhub95.ticmatdump.command;

import java.util.Arrays;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import usbhub95.ticmatdump.util.Meta;

public class CommandDumpTicMats extends CommandBase {

    private final List<String> aliases = Arrays.asList(new String[]{Meta.MOD_ID, "dumptinkermaterials", "tinkermaterialdump", "dumptinkermats", "tinkermatdump", "dumpticmats", "dtm", "tmd"});

    @Override
    public String getName() {
        return "dumpticmats";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "dumpticmats";
    }

    @Override
    public List<String> getAliases() {
        return aliases;
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return true;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        // TODO add execution logic
    }

}
