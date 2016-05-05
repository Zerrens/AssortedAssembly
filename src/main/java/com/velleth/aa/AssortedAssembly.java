package com.velleth.aa;

import com.velleth.aa.core.ModBlocks;
import com.velleth.aa.core.ModItems;
import com.velleth.aa.core.proxy.CommonProxy;
import com.velleth.aa.handler.ConfigHandler;
import com.velleth.aa.reference.AADictionary;
import com.velleth.aa.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.Logger;

/**
 * Created by Zerren on 4/24/2016.
 */

@Mod(modid= Reference.ModInfo.MOD_ID, name=Reference.ModInfo.MOD_NAME, version=Reference.ModInfo.VERSION)
public class AssortedAssembly {

    @Mod.Instance(Reference.ModInfo.MOD_ID)
    public static AssortedAssembly instance;

    @SidedProxy(modId = Reference.ModInfo.MOD_ID, clientSide = Reference.ModInfo.CLIENTPROXY_CLASS, serverSide = Reference.ModInfo.COMMONPROXY_CLASS)
    public static CommonProxy proxy;

    public static Logger log;

    public static CreativeTabs cTabAA = new CreativeTabs(Reference.ModInfo.MOD_ID) {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() { return null; }

        @Override
        @SideOnly(Side.CLIENT)
        public ItemStack getIconItemStack() {
            return new ItemStack(ModItems.screw, 1, 0);
        }
    };

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        log = event.getModLog();

        ModBlocks.init();
        ModItems.init();

        AADictionary.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
