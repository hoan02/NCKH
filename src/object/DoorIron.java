package object;

import entity.Entity;
import main.GamePanel;

public class DoorIron extends Entity {

  GamePanel gp;
  public static final String objName = "Iron Door";

  public DoorIron(GamePanel gp) {
    super(gp);
    this.gp = gp;
    type = type_obstacle;
    name = objName;
    down1 = setup("res/objects/door_iron", gp.tileSize, gp.tileSize);
    collision = true;

    solidArea.x = 0;
    solidArea.y = 16;
    solidArea.width = 48;
    solidArea.height = 32;
    solidAreaDefaultX = solidArea.x;
    solidAreaDefaultY = solidArea.y;
    price = 35;
    setDialogue();
  }

  public void setDialogue() {
    dialogues[0][0] = "It won't budge.";
  }

  public void interact() {
    startDialogue(this, 0);
  }
}
