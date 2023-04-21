package me.greencat.frozensr.render;

import me.greencat.frozensr.FrozenSR;
import me.greencat.frozensr.data.VertexGroup3;

public class RenderProxy {
    private boolean useColor = false;
    private boolean useTexture = false;
    public void renderVertex(int drawMode,VertexGroup3 group){
        FrozenSR.getInstance().getWorldRenderer().render(group.getArray(),useColor,useTexture,drawMode);
    }
    public void enableColor(boolean value){
        useColor = value;
    }
    public void enableTexture(boolean value){
        useTexture = value;
    }
}
