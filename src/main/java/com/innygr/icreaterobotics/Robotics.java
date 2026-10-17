package com.innygr.icreaterobotics;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

/** Early-alpha entry point for iCreate: Robotics. */
@Mod(Robotics.MOD_ID)
public final class Robotics {
    public static final String MOD_ID = "icreate_robotics";
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);
    private static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final DeferredHolder<Item, Item> ROBOTICS_CORE =
            ITEMS.registerSimpleItem("robotics_core");

    static {
        TABS.register("robotics", () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.icreate_robotics"))
                .icon(() -> new ItemStack(ROBOTICS_CORE.get()))
                .displayItems((parameters, output) -> output.accept(ROBOTICS_CORE.get()))
                .build());
    }

    public Robotics(IEventBus modBus) {
        ITEMS.register(modBus);
        TABS.register(modBus);
    }
}
