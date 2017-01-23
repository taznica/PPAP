package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPen extends Item {
    public ItemPen() {
        super();
        setUnlocalizedName(ExampleMod.MODID + "_itemPen");
        setTextureName(ExampleMod.MODID + ":itemPen");
        setCreativeTab(CreativeTabs.tabTools);
    }
}
