package com.velleth.aa.item.itemblock;

import com.velleth.aa.core.ModBlocks;
import com.velleth.aa.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;

/**
 * Created by Zerren on 4/24/2016.
 */
public class ItemBlockNonmetalMaterial extends ItemMultiTexture{

    public ItemBlockNonmetalMaterial(Block block) {
        super(ModBlocks.nonmetal, ModBlocks.nonmetal, Names.Blocks.NONMETAL_TYPES);
    }
}
