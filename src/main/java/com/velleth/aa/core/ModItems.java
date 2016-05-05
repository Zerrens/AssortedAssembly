package com.velleth.aa.core;

import com.velleth.aa.AssortedAssembly;
import com.velleth.aa.item.ItemAABase;
import com.velleth.aa.reference.Names;
import com.velleth.aa.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Zerren on 4/24/2016.
 */
public class ModItems {

    public static Item plate;
    public static Item screw;
    public static Item circuit;
    public static Item wire;

    public static void init() {
        register(plate = new ItemAABase(Names.Items.PLATE, Names.Items.PLATE_TYPES, Reference.Textures.Folders.PLATE, AssortedAssembly.cTabAA), Names.Items.PLATE);
        register(screw = new ItemAABase(Names.Items.SCREW, Names.Items.SCREW_TYPES, Reference.Textures.Folders.SCREW, AssortedAssembly.cTabAA), Names.Items.SCREW);
        register(circuit = new ItemAABase(Names.Items.CIRCUIT, Names.Items.CIRCUIT_TYPES, Reference.Textures.Folders.CIRCUIT, AssortedAssembly.cTabAA), Names.Items.CIRCUIT);
        register(wire = new ItemAABase(Names.Items.WIRE, Names.Items.WIRE_TYPES, Reference.Textures.Folders.WIRE, AssortedAssembly.cTabAA), Names.Items.WIRE);
    }

    private static void register(Item item, String name) {
        GameRegistry.registerItem(item, name);
    }
}
