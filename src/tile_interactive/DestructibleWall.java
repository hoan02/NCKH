package tile_interactive;

import entity.Entity;
import main.GamePanel;
import object.CoinBronze;
import object.Heart;
import object.ManaCrystal;

import java.awt.*;
import java.util.Random;

public class DestructibleWall extends InteractiveTile {

  GamePanel gp;

  public DestructibleWall(GamePanel gp, int col, int row) {
    super(gp, col, row);
    this.gp = gp;

    this.worldX = gp.tileSize * col;
    this.worldY = gp.tileSize * row;

    down1 = setup("res/tiles_interactive/destructiblewall", gp.tileSize, gp.tileSize);
    destructible = true;
    life = 3;
  }

  public boolean isCorrectItem(Entity entity) {
    boolean isCorrectItem = false;
    if (entity.currentWeapon.type == type_pickaxe) {
      isCorrectItem = true;
    }
    return isCorrectItem;
  }

  public void playSE() {
    gp.playSE(20);
  }

  public InteractiveTile getDestroyedForm() {
    InteractiveTile tile = null;
    return tile;
  }

  public Color getParticleColor() {
    Color color = new Color(65, 65, 65);
    return color;
  }

  public int getParticleSize() {
    int size = 6; // pixels
    return size;
  }

  public int getParticleSpeed() {
    int speed = 1;
    return speed;
  }

  public int getParticleMaxLife() {
    int maxLife = 20;
    return maxLife;
  }
  // for mining stuff u can use it in damageInteractiveTile in Player class
  /*
   * public void checkDrop()
   * {
   * //CAST A DIE
   * int i = new Random().nextInt(100)+1;
   * 
   * //SET THE TILE DROP
   * if(i < 50)
   * {
   * dropItem(new CoinBronze(gp));
   * }
   * if(i >= 50 && i < 75)
   * {
   * dropItem(new Heart(gp));
   * }
   * if(i >= 75 && i < 100)
   * {
   * dropItem(new ManaCrystal(gp));
   * }
   * }
   */
}