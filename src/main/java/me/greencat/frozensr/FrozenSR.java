package me.greencat.frozensr;

import me.greencat.frozensr.render.RenderProxy;
import me.greencat.frozensr.render.WorldRenderer;
import me.greencat.frozensr.utils.logo.LogoString;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FrozenSR
{
    private static FrozenSR instance;
    private static boolean loaded = false;
    public static final Logger LOGGER = LogManager.getLogger("FrozenScreenRenderer");

    private WorldRenderer worldRenderer;
    private RenderProxy renderProxy;

    public static void Bootstrap(){
        if(!loaded){
            loaded = true;
            instance = new FrozenSR();
            LOGGER.info(LogoString.logo);
            LOGGER.info("FrozenSR Loaded!");
            instance.init();
        }
    }
    private void init(){
        worldRenderer = new WorldRenderer();
        renderProxy = new RenderProxy();
    }
    public static FrozenSR getInstance(){
        return instance;
    }
    public WorldRenderer getWorldRenderer() {
        return worldRenderer;
    }
    public RenderProxy getRenderProxy() {
        return renderProxy;
    }
}
