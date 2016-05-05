package com.velleth.aa.reference;

import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Zerren on 4/24/2016.
 */
public class Reference {

    public static final class ModInfo {
        public static final String MOD_ID = "AssortedAssembly";
        public static final String MOD_NAME = "Assorted Assembly";
        public static final String VERSION = "1.7.10-1.0.0";
        public static final String CLIENTPROXY_CLASS = "com.velleth.aa.core.proxy.ClientProxy";
        public static final String COMMONPROXY_CLASS = "com.velleth.aa.core.proxy.CommonProxy";
        public static final String GUIFACTORY_CLASS = "com.velleth.aa.client.gui.GuiFactory";

        public static final String CR_RESOURCE_PREFIX = Reference.ModInfo.MOD_ID.toLowerCase() + ":";
    }

    public static final class Textures {


        public static final class Folders {
            public static final String METAL = "metals/";
            public static final String PLATE = "plates/";
            public static final String SCREW = "screws/";
            public static final String CIRCUIT = "circuits/";
            public static final String WIRE = "wires/";
        }

        public static final class GUIs {
            public static final String GUI_SHEET_LOCATION = "textures/gui/";

            public static final ResourceLocation WIDGETS = getResourceLocation(GUI_SHEET_LOCATION + "widgets.png");
            public static final ResourceLocation POTIONS = getResourceLocation(GUI_SHEET_LOCATION + "potions.png");
            public static final ResourceLocation KEY = getResourceLocation(GUI_SHEET_LOCATION + "key.png");
            public static final ResourceLocation VAULT = getResourceLocation(GUI_SHEET_LOCATION + "vault.png");
            public static final ResourceLocation CHEST_BRICK = getResourceLocation(GUI_SHEET_LOCATION + "chest_brick.png");
            public static final ResourceLocation CHEST_THAUMIUM = getResourceLocation(GUI_SHEET_LOCATION + "chest_thaumium.png");
            public static final ResourceLocation CHEST_VOID = getResourceLocation(GUI_SHEET_LOCATION + "chest_voidmetal.png");
            public static final ResourceLocation PRESSURIZED_WATER_REACTOR = getResourceLocation(GUI_SHEET_LOCATION + "pressurizedWaterReactor.png");
        }

        public static final class Models {
            public static final String MODEL_LOCATION = "textures/models/";
            public static final String ARMOR_LOCATION = MODEL_LOCATION + "armor/";

            public static final ResourceLocation CHEST_BRICK = getResourceLocation(MODEL_LOCATION + "chest_brick.png");
            public static final ResourceLocation CHEST_THAUMIUM = getResourceLocation(MODEL_LOCATION + "chest_thaumium.png");
            public static final ResourceLocation CHEST_VOID = getResourceLocation(MODEL_LOCATION + "chest_voidmetal.png");
            public static final ResourceLocation HEAT_EXCHANGER  = getResourceLocation(MODEL_LOCATION + "exchanger.png");
            public static final ResourceLocation TUBES  = getResourceLocation(MODEL_LOCATION + "tubes.png");
            public static final ResourceLocation GAS_TANK  = getResourceLocation(MODEL_LOCATION + "gasTank.png");
            public static final ResourceLocation PRESSURIZED_WATER_REACTOR  = getResourceLocation(MODEL_LOCATION + "pressurizedWaterReactor.png");
            public static final ResourceLocation TELEPORTER  = getResourceLocation(MODEL_LOCATION + "teleporter.png");

            //Armor
            public static final ResourceLocation O2_MASK  = getResourceLocation(ARMOR_LOCATION + "o2mask.png");
            public static final ResourceLocation THRUST_PACK  = getResourceLocation(ARMOR_LOCATION + "thrustpack.png");
        }

        public static final class Misc {
            public static final String MISC_LOCATION = "textures/misc/";

            public static final ResourceLocation PARTICLES = getResourceLocation(MISC_LOCATION + "particles.png");
            public static final ResourceLocation DEFAULT_BLOCK_TEXTURES = TextureMap.locationBlocksTexture;
        }
    }

    public static ResourceLocation getResourceLocation(String path) {
        return new ResourceLocation(ModInfo.MOD_ID.toLowerCase(), path);
    }
}
