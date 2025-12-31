package com.THproject.tharidia_things;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(TharidiaThings.MODID)
public class TharidiaThings {
    public static final String MODID = "tharidiathings";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TharidiaThings(IEventBus modEventBus, ModContainer modContainer) {
        // No registrations needed

        
        LOGGER.info("Tharidia Things - GodEye Tracking Loaded");
    }

}
