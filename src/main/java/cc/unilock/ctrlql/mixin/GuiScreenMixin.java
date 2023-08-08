package cc.unilock.ctrlql.mixin;

import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Keyboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(GuiScreen.class)
public class GuiScreenMixin {
    /**
     * @author unilock
     * @reason Recognize both control AND command as "ctrl" on macOS devices, instead of only command
     */
    @Overwrite
    public static boolean isCtrlKeyDown()
    {
        return Keyboard.isKeyDown(Keyboard.KEY_LCONTROL) || Keyboard.isKeyDown(Keyboard.KEY_RCONTROL) || Keyboard.isKeyDown(Keyboard.KEY_LMETA) || Keyboard.isKeyDown(Keyboard.KEY_RMETA);
    }
}
