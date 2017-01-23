package com.example.examplemod;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;

public class PPAPGuiContainer extends GuiContainer {
//    private static final ResourceLocation TEXTURE = new ResourceLocation("<DomainName>", "textures/gui/gui_texture.png");
    private static final ResourceLocation TEXTURE = new ResourceLocation("textures/gui/container/generic_54.png");

    public PPAPGuiContainer(int x, int y, int z) {
        super(new PPAPContainer(x, y, z));
    }

    // 文字等の描画
    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseZ) {
        super.drawGuiContainerForegroundLayer(mouseX, mouseZ);
    }

    // 背景の描画
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTick, int mouseX, int mouseZ) {
        this.mc.renderEngine.bindTexture(TEXTURE);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, xSize, ySize);
    }

    // ゲームの処理を止めるかどうか
    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
