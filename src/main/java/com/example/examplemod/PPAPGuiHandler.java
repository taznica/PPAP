package com.example.examplemod;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class PPAPGuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        if(id == ExampleMod.GUI_ID) {
            return new PPAPContainer(x, y, z);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        if(id == ExampleMod.GUI_ID) {
            return new PPAPGuiContainer(x, y, z);
        }
        return null;
    }
}
