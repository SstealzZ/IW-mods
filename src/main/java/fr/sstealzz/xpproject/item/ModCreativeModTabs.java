package fr.sstealzz.xpproject.item;

import net.minecraft.world.level.block.Blocks;
import fr.sstealzz.xpproject.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static fr.sstealzz.xpproject.XpProject.MODID;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Blocks.DIRT))
                    .title(Component.translatable("creativetab.mod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // pOutput.accept(new ItemStack(ModItems.SAPPHIRE.get()));
                        // pOutput.accept(new ItemStack(ModItems.RAW_SAPPHIRE.get()));

                        // pOutput.accept(new ItemStack(ModBlocks.SAPPHIRE_BLOCK.get()));
                        // pOutput.accept(new ItemStack(ModBlocks.RAW_SAPPHIRE_BLOCK.get()));
                    })
                    .build());

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }
}
