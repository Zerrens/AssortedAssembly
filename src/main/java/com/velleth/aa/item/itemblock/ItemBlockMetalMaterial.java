package com.velleth.aa.item.itemblock;

import com.velleth.aa.core.ModBlocks;
import com.velleth.aa.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;

/**
 * Created by Zerren on 4/24/2016.
 */
public class ItemBlockMetalMaterial extends ItemMultiTexture{

    public ItemBlockMetalMaterial(Block block) {
        super(ModBlocks.metal, ModBlocks.metal, Names.Blocks.METAL_TYPES);
    }
}
