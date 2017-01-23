package com.example.examplemod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;


public class PPAPContainer extends Container {
    int coordX, coordY, coordZ;

    public PPAPContainer(int x, int y, int z) {
        this.coordX = x;
        this.coordY = y;
        this.coordZ = z;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }
}
