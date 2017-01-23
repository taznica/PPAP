package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemApplePen extends Item {
    public ItemApplePen() {
        super();
        setUnlocalizedName(ExampleMod.MODID + "_itemApplePen");
        setTextureName(ExampleMod.MODID + ":itemApplePen");
        setCreativeTab(CreativeTabs.tabFood);
    }
}
