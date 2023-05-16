package entity;

import main.GamePanel;
import object.*;

import java.awt.*;

public class Merchant extends Entity {
  public Merchant(GamePanel gp) {
    super(gp);
    direction = "down";
    speed = 1;

    getImage();
    setDialogue();
    setItems();

    solidArea = new Rectangle();
    solidArea.x = 8;
    solidArea.y = 16;
    solidArea.width = 32;
    solidArea.height = 32;

    solidAreaDefaultX = 8;
    solidAreaDefaultY = 16;
  }

  public void getImage() {
    up1 = setup("res/npc/merchant_down_1", gp.tileSize, gp.tileSize);
    up2 = setup("res/npc/merchant_down_2", gp.tileSize, gp.tileSize);
    down1 = setup("res/npc/merchant_down_1", gp.tileSize, gp.tileSize);
    down2 = setup("res/npc/merchant_down_2", gp.tileSize, gp.tileSize);
    left1 = setup("res/npc/merchant_down_1", gp.tileSize, gp.tileSize);
    left2 = setup("res/npc/merchant_down_2", gp.tileSize, gp.tileSize);
    right1 = setup("res/npc/merchant_down_1", gp.tileSize, gp.tileSize);
    right2 = setup("res/npc/merchant_down_2", gp.tileSize, gp.tileSize);
  }

  public void setDialogue() {
    dialogues[0][0] = "He he ha, so you found me.\nI have some good stuff. \nDo you want to trade?";
    dialogues[1][0] = "Come again, hehe!";
    dialogues[2][0] = "You need more coin to buy that!";
    dialogues[3][0] = "You can not carry any more!";
    dialogues[4][0] = "You can not sell an equipped item!";
  }

  public void setItems() {
    inventory.add(new PotionRed(gp));
    inventory.add(new Axe(gp));
    inventory.add(new ShieldBlue(gp));
    inventory.add(new Tent(gp));
  }

  public void speak() {
    facePlayer();
    gp.gameState = gp.tradeState;
    gp.ui.npc = this;
  }
}
