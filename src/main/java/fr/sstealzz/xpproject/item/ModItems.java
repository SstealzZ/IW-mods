package fr.sstealzz.xpproject.item;

import fr.sstealzz.xpproject.XpProject;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, XpProject.MODID);

        // Add your items here

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}
