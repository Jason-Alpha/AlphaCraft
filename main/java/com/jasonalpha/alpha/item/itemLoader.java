package com.github.jasonalpha.alpha.item;

import com.github.jasonalpha.alpha.item.ingot.ItemVibraniumIngot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class itemLoader
{
    public static Item vibraniumIngot = new ItemVibraniumIngot();

    public itemLoader(FMLPreInitializationEvent event)
    {
        register(vibraniumIngot, "vibranium_ingot");
    }

   private static void register(Item item, String name)
    {
        GameRegistry.registerItem(item.setRegistryName(name));
    }
}
    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item)
    {
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, model);
    }

    public static void registerRenders() {
    }
}