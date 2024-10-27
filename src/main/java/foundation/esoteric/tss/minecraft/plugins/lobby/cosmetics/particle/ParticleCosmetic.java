package foundation.esoteric.tss.minecraft.plugins.lobby.cosmetics.particle;

import foundation.esoteric.tss.minecraft.plugins.lobby.cosmetics.Cosmetic;
import org.bukkit.Particle;

public interface ParticleCosmetic extends Cosmetic {
  Particle getParticle();

  boolean shouldSpawnWhenNotMoving();
}
