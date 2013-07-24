package aaher2.mods.techyfox;

import aaher2.mods.techyfox.config.ConfigHandler;
import aaher2.mods.techyfox.network.PacketHandler;
import aaher2.mods.techyfox.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(channels = {ModInfo.CHANNEL}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)

public class TechyFox {

	
	@Instance(ModInfo.ID)
	public static TechyFox instance;
	
	
	@SidedProxy(clientSide = "aaher2.mods.techyfox.proxies.ClientProxy", serverSide = "aaher2.mods.techyfox.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		
		
		proxy.initSounds();
		proxy.initRenderers();
		
		



	}

	@EventHandler
	public static void load(FMLInitializationEvent event) {
   
		
		
	}

	@EventHandler
	public static void modsLoaded(FMLPostInitializationEvent event) {

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
