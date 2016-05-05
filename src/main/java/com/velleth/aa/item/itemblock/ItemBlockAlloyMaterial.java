package com.velleth.aa.item.itemblock;

import com.velleth.aa.core.ModBlocks;
import com.velleth.aa.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;

/**
 * Created by Zerren on 4/24/2016.
 */
public class ItemBlockAlloyMaterial extends ItemMultiTexture{

    public ItemBlockAlloyMaterial(Block block) {
        super(ModBlocks.alloy, ModBlocks.alloy, Names.Blocks.ALLOY_TYPES);
    }
}
