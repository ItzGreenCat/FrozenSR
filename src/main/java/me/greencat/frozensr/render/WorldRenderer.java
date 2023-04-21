package me.greencat.frozensr.render;

import me.greencat.frozensr.data.Vertex3f;

import java.util.Arrays;

import static org.lwjgl.opengl.GL11.*;

public class WorldRenderer {
    public void render(Vertex3f[] vertices, boolean useColors, boolean useUV, int drawMode) {
        glBegin(drawMode);
        Arrays.stream(vertices).forEach(it -> {
            glVertex3f(it.getVertexX(),it.getVertexY(),it.getVertexZ());
            if(useColors){
                glColor4f(it.getColorR(),it.getColorG(),it.getColorB(),it.getColorAlpha());
            }
            if(useUV){
                glTexCoord2f(it.getTextureU(),it.getTextureV());
            }
        });
        glEnd();
    }
}
