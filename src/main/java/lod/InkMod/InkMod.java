package lod.InkMod;

import legend.game.modding.events.characters.CharacterStatsEvent;
import legend.game.modding.Mod;
import legend.game.modding.events.EventListener;

@Mod(id = InkMod.MOD_ID)
@EventListener
public class InkMod {
  public static final String MOD_ID = "InkMod";

  public InkMod() {
    System.out.println("hello LoD discord");
  }

  @EventListener
  public static void registerCharacterStats(final CharacterStatsEvent event) {
    event.hp = 450;
    event.maxHp = 900;
  }
}

