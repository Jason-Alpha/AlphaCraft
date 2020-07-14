package com.github.jasonalpha.alpha.alpha;

import com.github.jasonalpha.alpha.EventHandler;
import com.github.jasonalpha.alpha.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import gregtech.api.GTValues;
import gregtech.api.util.GTLog;
import gregtech.common.blocks.VariantItemBlock;
@Mod(
        modid = alpha.MODID,
        name = "Alpha",
        acceptedMinecraftVersions = "1.12.2",
        dependencies = "required:forge@[14.23.5.2847,);" + "required:gregtech")

public class alpha
{
    public static final String MODID = "alpha";
    public static final String VERSION = "0.0.1";

    @EventHandler
    public static void init(FMLInitializationEvent event)
    {

        System.out.println("DIRT BLOCK >> "+Blocks.dirt.func_149730_j());
    }
}
    @EventHandler
    public static void onPreInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public static void onInit(FMLInitializationEvent event) {

    }

    @EventHandler
    public static void onPostInit(FMLPostInitializationEvent event) {

    }

    private class FMLInitializationEvent {
    }
}
@SidedProxy(clientSide = "com.github.jasonalpha.alpha.alpha",
        serverSide = "com.github.jasonalpha.alpha.alpha")
public static CommonProxy proxy;

@Mod.EventHandler
public static void onPreInit(FMLPreInitializationEvent event)
        {
         proxy.onPreInit(event);
        }

@Mod.EventHandler
public static void onInit(FMLInitializationEvent event)
        {
        proxy.onInit(event);
        }

@Mod.EventHandler
public static void onPostInit(FMLPostInitializationEvent event)
        {
        proxy.onPostInit(event);
        }
