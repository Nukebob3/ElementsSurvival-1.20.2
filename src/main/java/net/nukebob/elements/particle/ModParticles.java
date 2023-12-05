package net.nukebob.elements.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nukebob.elements.ElementsSurvival;

public class ModParticles {
    public static final DefaultParticleType FIRE_CIRCLE_PARTICLE = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(ElementsSurvival.MOD_ID, "fire_circle_particle"),
                FIRE_CIRCLE_PARTICLE);
    }
}
