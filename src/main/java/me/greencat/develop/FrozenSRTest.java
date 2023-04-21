package me.greencat.develop;

import me.greencat.frozensr.FrozenSR;
import me.greencat.frozensr.data.Vertex3f;
import me.greencat.frozensr.data.VertexGroup3;
import me.greencat.frozensr.render.RenderProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.Vec3;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

@Mod(modid = FrozenSRTest.MODID, version = FrozenSRTest.VERSION)
public class FrozenSRTest {
    public static final String MODID = "frozensrtest";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(this);
        FrozenSR.Bootstrap();
    }
    @SubscribeEvent
    public void renderGameOverlay(RenderWorldLastEvent event){
        GL11.glPushMatrix();
        VertexGroup3 group = new VertexGroup3();
        Vec3 playerVec = Minecraft.getMinecraft().thePlayer.getPositionVector();
        GL11.glColor3f(1.0F,1.0F,1.0F);
        GL11.glDisable(GL11.GL_LIGHTING);
        group.add(new Vertex3f((float) playerVec.xCoord + 5,(float) playerVec.yCoord ,(float) playerVec.zCoord + 5 ).setColor(0.0F,1.0F,0.0F));
        group.add(new Vertex3f((float) playerVec.xCoord + 5,(float) playerVec.yCoord ,(float) playerVec.zCoord - 5 ).setColor(0.0F,1.0F,0.0F));
        group.add(new Vertex3f((float) playerVec.xCoord - 5,(float) playerVec.yCoord ,(float) playerVec.zCoord - 5 ).setColor(0.0F,1.0F,0.0F));
        group.add(new Vertex3f((float) playerVec.xCoord - 5,(float) playerVec.yCoord ,(float) playerVec.zCoord + 5 ).setColor(0.0F,1.0F,0.0F));
        group.translateWorldToScreen();
        RenderProxy proxy = FrozenSR.getInstance().getRenderProxy();
        proxy.enableColor(true);
        proxy.enableTexture(false);
        proxy.renderVertex(GL11.GL_QUADS,group);
        GL11.glPopMatrix();
    }
}
