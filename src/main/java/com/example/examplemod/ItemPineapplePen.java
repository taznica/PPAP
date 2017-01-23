package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPineapplePen extends Item {
    public ItemPineapplePen() {
        super();
        setUnlocalizedName(ExampleMod.MODID + "_itemPineapplePen");
        setTextureName(ExampleMod.MODID + ":itemPineapplePen");
        setCreativeTab(CreativeTabs.tabFood);
    }
}
