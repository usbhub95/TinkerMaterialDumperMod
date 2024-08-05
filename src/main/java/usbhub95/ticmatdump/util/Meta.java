// Copyright (C) 2024 Cooper Lockrey
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <https://www.gnu.org/licenses/>.

// This is a utility class that contains metadata used in other places

package usbhub95.ticmatdump.util;

public class Meta {

    // metadata class for info given to @Mod
    private Meta() {
        throw new IllegalStateException("Attempted to instantiate usbhub95.ticmatdump.util.Meta");
    }

    public static final String MOD_ID = "ticmatdump";
    public static final boolean USE_METADATA = true;
    public static final String COMMON_PROXY = "usbhub95.ticmatdump.proxy.CommonProxy";
    public static final String CLIENT_PROXY = "usbhub95.ticmatdump.proxy.ClientProxy";

}
