package object;

import entity.Entity;
import main.GamePanel;

public class BlueHeart extends Entity {

  GamePanel gp;
  public static final String objName = "Blue Heart";

  public BlueHeart(GamePanel gp) {
    super(gp);

    this.gp = gp;

    type = type_pickupOnly;
    name = objName;
    down1 = setup("res/objects/blueheart", gp.tileSize, gp.tileSize);
    setDialogues();
  }

  public void setDialogues() {
    dialogues[0][0] = "You pick up a beautiful blue gem.";
    dialogues[0][1] = "You find the Blue Heart, the legendary treasure!";
  }

  public boolean use(Entity entity) // when pickup this method will be called
  {
    gp.gameState = gp.cutsceneState;
    gp.csManager.sceneNum = gp.csManager.ending;
    return true;
  }

}