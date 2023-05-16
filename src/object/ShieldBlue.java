package object;

import entity.Entity;
import main.GamePanel;

public class ShieldBlue extends Entity {

  public static final String objName = "Blue Shield";

  public ShieldBlue(GamePanel gp) {
    super(gp);

    type = type_shield;
    name = objName;
    down1 = setup("res/objects/shield_blue", gp.tileSize, gp.tileSize);
    defenseValue = 2;
    description = "[" + name + "]\nA shiny blue shield.";
    price = 150;
  }
}
