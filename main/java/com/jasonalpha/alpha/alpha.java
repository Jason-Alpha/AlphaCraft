package com.github.jasonalpha.alpha.alpha;

import com.github.jasonalpha.alpha.EventHandler;
import com.github.jasonalpha.alpha.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(
        modid = alpha.MODID,
        name = "Alpha",
        acceptedMinecraftVersions = "1.12.2",
        dependencies = "required:forge@[14.23.5.2847,);" + "required:gregtech")

public class alpha
{
    public static final String MODID = "alpha";
    public static final String VERSION = "0.0.1";
    public static Object FMLPreInitializationEvent;
    public Object FMLInitializationEvent;
    public Object FMLPostInitializationEvent;

    @EventHandler
    public void init(FMLInitializationEvent event, Object dirt) throws InterruptedException {

        System.out.println("DIRT BLOCK >> " +  FMLInitializationEvent());
    }

    private String FMLInitializationEvent() {
    }

    @EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        System.out.println("craft："+ FMLPreInitializationEvent);
    }

    @EventHandler
    public  void onInit(FMLInitializationEvent event) {
System.out.println("onInit"+ FMLInitializationEvent);
    }

    @EventHandler
    public  void onPostInit(FMLPostInitializationEvent event) {
System.out.println("onPostInit"+ FMLPostInitializationEvent);
    }

    private class FMLInitializationEvent {
    }

    @SidedProxy(clientSide = "com.github.jasonalpha.alpha.proxy.ClientProxy",
           serverSide = "com.github.jasonalpha.alpha.proxy.CommonProxy")
  public static com.githb.jasonalpha.alpha.proxy.commonproxy.CommonProxy proxy;}



    public void onPreInit(FMLPreInitializationEvent event)
      {
 System.out.println("proxy" + onPreInit(event));}



@EventHandler
public void onInit(FMLInitializationEvent event)

{proxy.onInit(event);}


@EventHandler
public void onPostInit(FMLPostInitializationEvent event)
        {proxy.onPostInit(event);}}

