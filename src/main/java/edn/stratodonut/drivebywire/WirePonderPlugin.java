package edn.stratodonut.drivebywire;

import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.minecraft.resources.ResourceLocation;

public class WirePonderPlugin implements PonderPlugin {

    @Override
    public String getModId() {
        return DriveByWireMod.MOD_ID;
    }

    @Override
    public void registerScenes(PonderSceneRegistrationHelper<ResourceLocation> helper) {
        WirePonders.register(helper);
    }
}
