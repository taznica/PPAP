package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPineapple extends Item {
    public ItemPineapple() {
        super();
        setUnlocalizedName(ExampleMod.MODID + "_itemPineapple");
        setTextureName(ExampleMod.MODID + ":itemPineapple");
        setCreativeTab(CreativeTabs.tabFood);
    }
}
