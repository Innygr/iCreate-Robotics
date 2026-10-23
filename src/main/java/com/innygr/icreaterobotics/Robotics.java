package com.innygr.icreaterobotics;

import java.util.List;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
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

    public static final DeferredHolder<Item, Item> ROBOTICS_CORE = item("robotics_core");
    public static final DeferredHolder<Item, Item> ROBOT_CHASSIS = item("robot_chassis");
    public static final DeferredHolder<Item, Item> ROBOTIC_ARM = item("robotic_arm");

    private static DeferredHolder<Item, Item> item(String name) {
        return ITEMS.register(name, () -> new DescribedItem(name));
    }

    static {
        TABS.register("robotics", () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.icreate_robotics"))
                .icon(() -> new ItemStack(ROBOTICS_CORE.get()))
                .displayItems((parameters, output) -> {
                    output.accept(ROBOTICS_CORE.get());
                    output.accept(ROBOT_CHASSIS.get());
                    output.accept(ROBOTIC_ARM.get());
                }).build());
    }

    public Robotics(IEventBus modBus) {
        ITEMS.register(modBus);
        TABS.register(modBus);
    }

    private static final class DescribedItem extends Item {
        private final String descriptionKey;

        private DescribedItem(String path) {
            super(new Item.Properties());
            this.descriptionKey = "tooltip." + MOD_ID + "." + path;
        }

        @Override
        public void appendHoverText(ItemStack stack, Item.TooltipContext context,
                                    List<Component> tooltip, TooltipFlag flag) {
            super.appendHoverText(stack, context, tooltip, flag);
            tooltip.add(Component.translatable(descriptionKey).withStyle(ChatFormatting.GRAY));
            tooltip.add(Component.translatable("tooltip." + MOD_ID + ".alpha_notice")
                    .withStyle(ChatFormatting.DARK_GRAY, ChatFormatting.ITALIC));
        }
    }
}
