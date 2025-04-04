package net.isakgronlund.mekanismoreprocessingaddon;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraft.world.item.CreativeModeTabs;

@Mod(mekanismoreprocessingaddon.MOD_ID)
public class mekanismoreprocessingaddon {
    public static final String MOD_ID = "mekanismoreprocessingaddon";
    private static final Logger LOGGER = LogUtils.getLogger();

    public mekanismoreprocessingaddon() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);

        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientSetup);
        modEventBus.addListener(ModItems::registerCreativeTabs);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void clientSetup(final FMLClientSetupEvent event) {
    }
}
