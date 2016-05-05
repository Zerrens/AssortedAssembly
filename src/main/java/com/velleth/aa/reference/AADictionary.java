package com.velleth.aa.reference;

import com.velleth.aa.AssortedAssembly;
import com.velleth.aa.core.ModBlocks;
import com.velleth.aa.core.ModItems;
import com.velleth.aa.handler.ConfigHandler;
import net.minecraft.block.Block;
import net.minecraft.inventory.ContainerFurnace;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Velleth on 4/24/2016.
 */
public class AADictionary {

    public static void init() {
        registerBlocks();
        registerItems();
    }

    private static void registerBlocks() {
        register("block", Names.Blocks.METAL_TYPES, ModBlocks.metal);
        register("block", Names.Blocks.NONMETAL_TYPES, ModBlocks.nonmetal);
        register("block", Names.Blocks.ALLOY_TYPES, ModBlocks.alloy);
    }

    private static void registerItems() {
        register("plate", Names.Items.PLATE_TYPES, ModItems.plate);
        register("screw", Names.Items.SCREW_TYPES, ModItems.screw);
        register("wire", Names.Items.WIRE_TYPES, ModItems.wire);
        register("circuit", Names.Items.CIRCUIT_TYPES, ModItems.circuit);
    }

    private static void register(String type, String[] types, Block block) {
        for (int i = 0; i < types.length; i++) {
            //type name + capitalized first letter of material + rest of material
            String fullname = type.concat(types[i].substring(0, 1).toUpperCase().concat(types[i].substring(1)));
            OreDictionary.registerOre(fullname, new ItemStack(block, 1, i));
            if (ConfigHandler.devDebug){
                AssortedAssembly.log.info(fullname);
            }
        }
    }

    private static void register(String type, String[] types, Item item) {
        for (int i = 0; i < types.length; i++) {
            String fullname = type.concat(types[i].substring(0, 1).toUpperCase().concat(types[i].substring(1)));
            OreDictionary.registerOre(fullname, new ItemStack(item, 1, i));
            AssortedAssembly.log.info(fullname);
        }
    }
}
