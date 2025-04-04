package net.isakgronlund.mekanismoreprocessingaddon;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, mekanismoreprocessingaddon.MOD_ID);

	public static final RegistryObject<CreativeModeTab> MEKANISMOREPROCESSINGADDONTAB = CREATIVE_MODE_TABS.register("mekanismoreprocessingaddon", () -> CreativeModeTab.builder()
		.icon(() -> new ItemStack(ModItems.CUSTOM_ITEM.get()))
		.title(Component.translatable("itemGroup.mekanismoreprocessingaddon.mekanismoreprocessingaddon"))
		.displayItems(((itemDisplayParameters, output) -> {
			output.accept(ModItems.CUSTOM_ITEM.get());
		}))
		.build()
	);
}
