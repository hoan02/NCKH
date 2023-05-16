package main;

import entity.Entity;
import object.*;

public class EntityGenerator {

  GamePanel gp;

  public EntityGenerator(GamePanel gp) {
    this.gp = gp;
  }

  public Entity getObject(String itemName) {
    Entity obj = null;

    switch (itemName) {
      case Axe.objName:
        obj = new Axe(gp);
        break;
      case BlueHeart.objName:
        obj = new BlueHeart(gp);
        break;
      case Boots.objName:
        obj = new Boots(gp);
        break;
      case Chest.objName:
        obj = new Chest(gp);
        break;
      case CoinBronze.objName:
        obj = new CoinBronze(gp);
        break;
      case Door.objName:
        obj = new Door(gp);
        break;
      case DoorIron.objName:
        obj = new DoorIron(gp);
        break;
      case Fireball.objName:
        obj = new Fireball(gp);
        break;
      case Heart.objName:
        obj = new Heart(gp);
        break;
      case Key.objName:
        obj = new Key(gp);
        break;
      case Lantern.objName:
        obj = new Lantern(gp);
        break;
      case ManaCrystal.objName:
        obj = new ManaCrystal(gp);
        break;
      case Pickaxe.objName:
        obj = new Pickaxe(gp);
        break;
      case PotionRed.objName:
        obj = new PotionRed(gp);
        break;
      case Rock.objName:
        obj = new Rock(gp);
        break;
      case ShieldBlue.objName:
        obj = new ShieldBlue(gp);
        break;
      case ShieldWood.objName:
        obj = new ShieldWood(gp);
        break;
      case SwordNormal.objName:
        obj = new SwordNormal(gp);
        break;
      case Tent.objName:
        obj = new Tent(gp);
        break;

    }
    return obj;
  }

}
