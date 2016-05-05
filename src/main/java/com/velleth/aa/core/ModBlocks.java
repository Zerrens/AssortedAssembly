package com.velleth.aa.core;

import com.velleth.aa.AssortedAssembly;
import com.velleth.aa.block.BlockAA;
import com.velleth.aa.item.itemblock.ItemBlockAlloyMaterial;
import com.velleth.aa.item.itemblock.ItemBlockMetalMaterial;
import com.velleth.aa.item.itemblock.ItemBlockNonmetalMaterial;
import com.velleth.aa.reference.Names;
import com.velleth.aa.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Zerren on 4/24/2016.
 */

public class ModBlocks {
    public static Block metal;
    public static Block nonmetal;
    public static Block alloy;

    public static void init() {
        metal =  new BlockAA(Names.Blocks.METAL, Names.Blocks.METAL_TYPES, Material.iron, 3F, 10F, Block.soundTypeMetal, Reference.Textures.Folders.METAL, AssortedAssembly.cTabAA);
        nonmetal =  new BlockAA(Names.Blocks.NONMETAL, Names.Blocks.NONMETAL_TYPES, Material.iron, 3F, 10F, Block.soundTypeStone, Reference.Textures.Folders.METAL, AssortedAssembly.cTabAA);
        alloy =  new BlockAA(Names.Blocks.ALLOY, Names.Blocks.ALLOY_TYPES, Material.iron, 3F, 10F, Block.soundTypeMetal, Reference.Textures.Folders.METAL, AssortedAssembly.cTabAA);

        register();
    }

    private static void register() {

        GameRegistry.registerBlock(metal, ItemBlockMetalMaterial.class, Names.Blocks.METAL);
        GameRegistry.registerBlock(nonmetal, ItemBlockNonmetalMaterial.class, Names.Blocks.NONMETAL);
        GameRegistry.registerBlock(alloy, ItemBlockAlloyMaterial.class, Names.Blocks.ALLOY);
    }
}
