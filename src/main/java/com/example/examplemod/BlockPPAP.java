package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockPPAP extends Block {
    public BlockPPAP() {
        super(Material.rock);
        setBlockName(ExampleMod.MODID + "_blockPPAP");
        setBlockTextureName(ExampleMod.MODID + ":blockPPAP");
        setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        player.openGui(ExampleMod.INSTANCE, ExampleMod.GUI_ID, world, x, y, z);
        return true;
    }
}
