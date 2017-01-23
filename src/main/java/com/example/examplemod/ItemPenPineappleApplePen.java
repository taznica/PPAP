package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPenPineappleApplePen extends Item {
    public ItemPenPineappleApplePen() {
        super();
        setUnlocalizedName(ExampleMod.MODID + "_itemPenPineappleApplePen");
        setTextureName(ExampleMod.MODID + ":itemPenPineappleApplePen");
        setCreativeTab(CreativeTabs.tabFood);
    }
}
