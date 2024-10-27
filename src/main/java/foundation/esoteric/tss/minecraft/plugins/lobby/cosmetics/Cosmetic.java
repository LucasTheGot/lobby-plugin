package foundation.esoteric.tss.minecraft.plugins.lobby.cosmetics;

import foundation.esoteric.tss.minecraft.plugins.lobby.TSSLobbyPlugin;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface Cosmetic {
  ItemStack getDisplayItem(Player player, TSSLobbyPlugin plugin);

  int getRequiredRankWeight();
}
