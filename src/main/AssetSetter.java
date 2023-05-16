package main;

import data.Progress;
import entity.BigRock;
import entity.Merchant;
import entity.OldMan;
import monster.*;
import object.*;
import tile_interactive.DestructibleWall;
import tile_interactive.DryTree;
import tile_interactive.MetalPlate;

public class AssetSetter {

  GamePanel gp;

  public AssetSetter(GamePanel gp) {
    this.gp = gp;
  }

  public void setObject() {
    int mapNum = 0;
    int i = 0;

    gp.obj[mapNum][i] = new Axe(gp);
    gp.obj[mapNum][i].worldX = gp.tileSize * 33;
    gp.obj[mapNum][i].worldY = gp.tileSize * 7;
    i++;
    gp.obj[mapNum][i] = new Lantern(gp);
    gp.obj[mapNum][i].worldX = gp.tileSize * 31;
    gp.obj[mapNum][i].worldY = gp.tileSize * 12;
    i++;
    gp.obj[mapNum][i] = new Tent(gp);
    gp.obj[mapNum][i].worldX = gp.tileSize * 26;
    gp.obj[mapNum][i].worldY = gp.tileSize * 16;
    i++;
    gp.obj[mapNum][i] = new Door(gp);
    gp.obj[mapNum][i].worldX = gp.tileSize * 14;
    gp.obj[mapNum][i].worldY = gp.tileSize * 28;
    i++;
    gp.obj[mapNum][i] = new Door(gp);
    gp.obj[mapNum][i].worldX = gp.tileSize * 12;
    gp.obj[mapNum][i].worldY = gp.tileSize * 12;
    i++;
    gp.obj[mapNum][i] = new Key(gp);
    gp.obj[mapNum][i].worldX = gp.tileSize * 22;
    gp.obj[mapNum][i].worldY = gp.tileSize * 41;
    i++;
    gp.obj[mapNum][i] = new Key(gp);
    gp.obj[mapNum][i].worldX = gp.tileSize * 38;
    gp.obj[mapNum][i].worldY = gp.tileSize * 40;
    i++;

    mapNum = 1;// adding object to second map
    i = 0;
    gp.obj[mapNum][i] = new CoinBronze(gp);
    gp.obj[mapNum][i].worldX = gp.tileSize * 10;
    gp.obj[mapNum][i].worldY = gp.tileSize * 10;
    i++;

    mapNum = 2;
    i = 0;
    gp.obj[mapNum][i] = new Chest(gp);
    gp.obj[mapNum][i].setLoot(new Pickaxe(gp));
    gp.obj[mapNum][i].worldX = gp.tileSize * 40;
    gp.obj[mapNum][i].worldY = gp.tileSize * 41;
    i++;
    gp.obj[mapNum][i] = new Chest(gp);
    gp.obj[mapNum][i].setLoot(new PotionRed(gp));
    gp.obj[mapNum][i].worldX = gp.tileSize * 13;
    gp.obj[mapNum][i].worldY = gp.tileSize * 16;
    i++;
    gp.obj[mapNum][i] = new Chest(gp);
    gp.obj[mapNum][i].setLoot(new PotionRed(gp));
    gp.obj[mapNum][i].worldX = gp.tileSize * 26;
    gp.obj[mapNum][i].worldY = gp.tileSize * 34;
    i++;
    gp.obj[mapNum][i] = new Chest(gp);
    gp.obj[mapNum][i].setLoot(new PotionRed(gp));
    gp.obj[mapNum][i].worldX = gp.tileSize * 27;
    gp.obj[mapNum][i].worldY = gp.tileSize * 15;
    i++;
    gp.obj[mapNum][i] = new DoorIron(gp);
    gp.obj[mapNum][i].worldX = gp.tileSize * 18;
    gp.obj[mapNum][i].worldY = gp.tileSize * 23;
    i++;

    mapNum = 3;
    i = 0;
    gp.obj[mapNum][i] = new DoorIron(gp);
    gp.obj[mapNum][i].worldX = gp.tileSize * 25;
    gp.obj[mapNum][i].worldY = gp.tileSize * 15;
    i++;

    gp.obj[mapNum][i] = new BlueHeart(gp);
    gp.obj[mapNum][i].worldX = gp.tileSize * 25;
    gp.obj[mapNum][i].worldY = gp.tileSize * 8;
    i++;
  }

  public void setNPC() {
    int mapNum = 0;
    int i = 0;

    // MAP = 0
    gp.npc[mapNum][i] = new OldMan(gp);
    gp.npc[mapNum][i].worldX = gp.tileSize * 21;
    gp.npc[mapNum][i].worldY = gp.tileSize * 21;
    i++;

    // MAP = 1
    mapNum = 1;
    i = 0;

    gp.npc[mapNum][i] = new Merchant(gp);
    gp.npc[mapNum][i].worldX = gp.tileSize * 12;
    gp.npc[mapNum][i].worldY = gp.tileSize * 7;
    i++;

    mapNum = 2;
    i = 0;

    gp.npc[mapNum][i] = new BigRock(gp);
    gp.npc[mapNum][i].worldX = gp.tileSize * 20;
    gp.npc[mapNum][i].worldY = gp.tileSize * 25;
    i++;
    gp.npc[mapNum][i] = new BigRock(gp);
    gp.npc[mapNum][i].worldX = gp.tileSize * 11;
    gp.npc[mapNum][i].worldY = gp.tileSize * 18;
    i++;
    gp.npc[mapNum][i] = new BigRock(gp);
    gp.npc[mapNum][i].worldX = gp.tileSize * 23;
    gp.npc[mapNum][i].worldY = gp.tileSize * 14;
    i++;

  }

  public void setMonster() {
    int mapNum = 0;
    int i = 0;
    gp.monster[mapNum][i] = new GreenSlime(gp);
    gp.monster[mapNum][i].worldX = gp.tileSize * 23;
    gp.monster[mapNum][i].worldY = gp.tileSize * 36;
    i++;

    gp.monster[mapNum][i] = new GreenSlime(gp);
    gp.monster[mapNum][i].worldX = gp.tileSize * 23;
    gp.monster[mapNum][i].worldY = gp.tileSize * 37;
    i++;

    gp.monster[mapNum][i] = new GreenSlime(gp);
    gp.monster[mapNum][i].worldX = gp.tileSize * 24;
    gp.monster[mapNum][i].worldY = gp.tileSize * 37;
    i++;

    gp.monster[mapNum][i] = new GreenSlime(gp);
    gp.monster[mapNum][i].worldX = gp.tileSize * 34;
    gp.monster[mapNum][i].worldY = gp.tileSize * 42;
    i++;

    gp.monster[mapNum][i] = new GreenSlime(gp);
    gp.monster[mapNum][i].worldX = gp.tileSize * 38;
    gp.monster[mapNum][i].worldY = gp.tileSize * 42;
    i++;

    gp.monster[mapNum][i] = new Orc(gp);
    gp.monster[mapNum][i].worldX = gp.tileSize * 12;
    gp.monster[mapNum][i].worldY = gp.tileSize * 33;
    i++;

    gp.monster[mapNum][i] = new RedSlime(gp);
    gp.monster[mapNum][i].worldX = gp.tileSize * 34;
    gp.monster[mapNum][i].worldY = gp.tileSize * 11;
    i++;

    gp.monster[mapNum][i] = new RedSlime(gp);
    gp.monster[mapNum][i].worldX = gp.tileSize * 38;
    gp.monster[mapNum][i].worldY = gp.tileSize * 7;
    i++;

    gp.monster[mapNum][i] = new RedSlime(gp);
    gp.monster[mapNum][i].worldX = gp.tileSize * 37;
    gp.monster[mapNum][i].worldY = gp.tileSize * 9;
    i++;

    mapNum = 2;
    i = 0;

    gp.monster[mapNum][i] = new Bat(gp);
    gp.monster[mapNum][i].worldX = gp.tileSize * 34;
    gp.monster[mapNum][i].worldY = gp.tileSize * 39;
    i++;

    gp.monster[mapNum][i] = new Bat(gp);
    gp.monster[mapNum][i].worldX = gp.tileSize * 36;
    gp.monster[mapNum][i].worldY = gp.tileSize * 25;
    i++;

    gp.monster[mapNum][i] = new Bat(gp);
    gp.monster[mapNum][i].worldX = gp.tileSize * 39;
    gp.monster[mapNum][i].worldY = gp.tileSize * 26;
    i++;

    gp.monster[mapNum][i] = new Bat(gp);
    gp.monster[mapNum][i].worldX = gp.tileSize * 28;
    gp.monster[mapNum][i].worldY = gp.tileSize * 11;
    i++;

    gp.monster[mapNum][i] = new Bat(gp);
    gp.monster[mapNum][i].worldX = gp.tileSize * 10;
    gp.monster[mapNum][i].worldY = gp.tileSize * 19;
    i++;

    mapNum = 3;
    i = 0;

    if (Progress.skeletonLordDefeated == false) {
      gp.monster[mapNum][i] = new SkeletonLord(gp);
      gp.monster[mapNum][i].worldX = gp.tileSize * 23;
      gp.monster[mapNum][i].worldY = gp.tileSize * 16;
      i++;
    }

  }

  public void setInteractiveTile() {
    int mapNum = 0;
    int i = 0;
    gp.iTile[mapNum][i] = new DryTree(gp, 27, 12);
    i++;
    gp.iTile[mapNum][i] = new DryTree(gp, 28, 12);
    i++;
    gp.iTile[mapNum][i] = new DryTree(gp, 29, 12);
    i++;
    gp.iTile[mapNum][i] = new DryTree(gp, 30, 12);
    i++;
    gp.iTile[mapNum][i] = new DryTree(gp, 32, 12);
    i++;
    gp.iTile[mapNum][i] = new DryTree(gp, 33, 12);
    i++;

    gp.iTile[mapNum][i] = new DryTree(gp, 18, 40);
    i++;
    gp.iTile[mapNum][i] = new DryTree(gp, 17, 40);
    i++;
    gp.iTile[mapNum][i] = new DryTree(gp, 16, 40);
    i++;
    gp.iTile[mapNum][i] = new DryTree(gp, 15, 40);
    i++;
    gp.iTile[mapNum][i] = new DryTree(gp, 14, 40);
    i++;
    gp.iTile[mapNum][i] = new DryTree(gp, 13, 40);
    i++;
    gp.iTile[mapNum][i] = new DryTree(gp, 10, 40);
    i++;

    gp.iTile[mapNum][i] = new DryTree(gp, 13, 41);
    i++;
    gp.iTile[mapNum][i] = new DryTree(gp, 12, 41);
    i++;
    gp.iTile[mapNum][i] = new DryTree(gp, 11, 41);
    i++;
    gp.iTile[mapNum][i] = new DryTree(gp, 10, 41);
    i++;

    mapNum = 2;
    i = 0;

    gp.iTile[mapNum][i] = new DestructibleWall(gp, 18, 30);
    i++;
    gp.iTile[mapNum][i] = new DestructibleWall(gp, 17, 31);
    i++;
    gp.iTile[mapNum][i] = new DestructibleWall(gp, 17, 32);
    i++;
    gp.iTile[mapNum][i] = new DestructibleWall(gp, 17, 34);
    i++;
    gp.iTile[mapNum][i] = new DestructibleWall(gp, 18, 34);
    i++;
    gp.iTile[mapNum][i] = new DestructibleWall(gp, 10, 33);
    i++;
    gp.iTile[mapNum][i] = new DestructibleWall(gp, 10, 22);
    i++;
    gp.iTile[mapNum][i] = new DestructibleWall(gp, 38, 24);
    i++;
    gp.iTile[mapNum][i] = new DestructibleWall(gp, 38, 18);
    i++;
    gp.iTile[mapNum][i] = new DestructibleWall(gp, 38, 19);
    i++;
    gp.iTile[mapNum][i] = new DestructibleWall(gp, 38, 21);
    i++;
    gp.iTile[mapNum][i] = new DestructibleWall(gp, 18, 13);
    i++;
    gp.iTile[mapNum][i] = new DestructibleWall(gp, 18, 14);
    i++;
    gp.iTile[mapNum][i] = new DestructibleWall(gp, 22, 28);
    i++;
    gp.iTile[mapNum][i] = new DestructibleWall(gp, 30, 28);
    i++;
    gp.iTile[mapNum][i] = new DestructibleWall(gp, 32, 28);
    i++;

    gp.iTile[mapNum][i] = new MetalPlate(gp, 20, 22);
    i++;
    gp.iTile[mapNum][i] = new MetalPlate(gp, 8, 17);
    i++;
    gp.iTile[mapNum][i] = new MetalPlate(gp, 39, 31);
    i++;

  }
}
