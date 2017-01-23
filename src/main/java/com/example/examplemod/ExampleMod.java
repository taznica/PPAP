package com.example.examplemod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";

    public static ExampleMod INSTANCE;
    public static final int GUI_ID = 0;

    public static final Block blockPPAP = new BlockPPAP();
    public static final Item itemPen = new ItemPen();

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        GameRegistry.registerBlock(blockPPAP, "blockPPAP");
        GameRegistry.registerItem(itemPen, "itemPen");
    }
}
