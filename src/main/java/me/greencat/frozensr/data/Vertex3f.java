package me.greencat.frozensr.data;

import net.minecraft.client.Minecraft;

public class Vertex3f {
    private float xPos;
    private float yPos;
    private float zPos;
    private float colorR;
    private float colorG;
    private float colorB;
    private float colorAlpha;
    private float textureU;
    private float textureV;

    public Vertex3f(float x, float y, float z) {
        xPos = x;
        yPos = y;
        zPos = z;
        colorR = 1.0F;
        colorG = 1.0F;
        colorB = 1.0F;
        colorAlpha = 1.0F;
        textureU = 0.0F;
        textureV = 0.0F;
    }

    public Vertex3f setXPos(float x) {
        this.xPos = x;
        return this;
    }

    public Vertex3f setYPos(float y) {
        this.yPos = y;
        return this;
    }

    public Vertex3f setZPos(float z) {
        this.zPos = z;
        return this;
    }

    public Vertex3f setVertex(float x, float y, float z) {
        xPos = x;
        yPos = y;
        zPos = z;
        return this;
    }

    public float getVertexX() {
        return xPos;
    }

    public float getVertexY() {
        return yPos;
    }

    public float getVertexZ() {
        return zPos;
    }

    public Vertex3f setColor(float colorR, float colorG, float colorB) {
        this.colorR = colorR;
        this.colorG = colorG;
        this.colorB = colorB;
        return this;
    }

    public Vertex3f setColor(float colorR, float colorG, float colorB, float alpha) {
        this.colorR = colorR;
        this.colorG = colorG;
        this.colorB = colorB;
        this.colorAlpha = alpha;
        return this;
    }

    public float getColorR() {
        return colorR;
    }

    public float getColorG() {
        return colorG;
    }

    public float getColorB() {
        return colorB;
    }

    public float getColorAlpha() {
        return colorAlpha;
    }

    public Vertex3f setTextureUV(float u, float v) {
        this.textureU = u;
        this.textureV = v;
        return this;
    }

    public float getTextureU() {
        return textureU;
    }

    public float getTextureV() {
        return textureV;
    }

    public Vertex3f translateWorldToScreen() {
        this.xPos = (float) (this.xPos - Minecraft.getMinecraft().getRenderManager().viewerPosX);
        this.yPos = (float) (this.yPos - Minecraft.getMinecraft().getRenderManager().viewerPosY);
        this.zPos = (float) (this.zPos - Minecraft.getMinecraft().getRenderManager().viewerPosZ);
        return this;
    }

}
