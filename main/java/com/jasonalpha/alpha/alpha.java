package com.github.jasonalpha.alpha.alpha;

import com.github.jasonalpha.alpha.EventHandler;
import com.github.jasonalpha.alpha.FMLPreInitializationEvent;
import com.github.jasonalpha.alpha.FMLTutor;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Alpha.alpha, version = alpha.0.0.1, name = FMLTutor.NAME, version = FMLTutor.VERSION, acceptedMinecraftVersions = "1.12.2", dependencies = "required-after:gregtech"))
public class alpha
{
    public static final String MODID = "alpha";
    public static final String VERSION = "0.0.1";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		//
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.func_149730_j());
    }
}
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    private class FMLInitializationEvent {
    }
}
@SidedProxy(clientSide = "com.github.jasonalpha.alpha.alpha",
        serverSide = "com.github.jasonalpha.alpha.alpha")
public static CommonProxy proxy;

@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
        {
        proxy.preInit(event);
        }

@EventHandler
public void init(FMLInitializationEvent event)
        {
        proxy.init(event);
        }

@EventHandler
public void postInit(FMLPostInitializationEvent event)
        {
        proxy.postInit(event);
        }
