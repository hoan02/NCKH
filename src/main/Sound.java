package main;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class Sound {
  Clip clip;
  FloatControl fc;
  int volumeScale = 3;
  float volume;
  File[] soundURL = new File[30];

  public Sound() {
    soundURL[0] = new File("src/res/sound/BlueBoyAdventure.wav");
    soundURL[1] = new File("src/res/sound/coin.wav");
    soundURL[2] = new File("src/res/sound/powerup.wav");
    soundURL[3] = new File("src/res/sound/unlock.wav");
    soundURL[4] = new File("src/res/sound/fanfare.wav");
    soundURL[5] = new File("src/res/sound/hitmonster.wav");
    soundURL[6] = new File("src/res/sound/receivedamage.wav");
    soundURL[7] = new File("src/res/sound/swingweapon.wav");
    soundURL[8] = new File("src/res/sound/levelup.wav");
    soundURL[9] = new File("src/res/sound/cursor.wav");
    soundURL[10] = new File("src/res/sound/burning.wav");
    soundURL[11] = new File("src/res/sound/cuttree.wav");
    soundURL[12] = new File("src/res/sound/gameover.wav");
    soundURL[13] = new File("src/res/sound/stairs.wav");
    soundURL[14] = new File("src/res/sound/sleep.wav");
    soundURL[15] = new File("src/res/sound/blocked.wav");
    soundURL[16] = new File("src/res/sound/parry.wav");
    soundURL[17] = new File("src/res/sound/speak.wav");
    soundURL[18] = new File("src/res/sound/Merchant.wav");
    soundURL[19] = new File("src/res/sound/Dungeon.wav");
    soundURL[20] = new File("src/res/sound/chipwall.wav");
    soundURL[21] = new File("src/res/sound/dooropen.wav");
    soundURL[22] = new File("src/res/sound/FinalBattle.wav");

  }

  public void setFile(int i) // Java Sound File Opening Format
  {
    try {
      AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
      clip = AudioSystem.getClip();
      clip.open(ais);
      fc = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN); // pass value for clip // -80f to 6f // 6 is
                                                                          // max. -80f = 0
    } catch (Exception e) {
      e.printStackTrace();
    }
    checkVolume();
  }

  public void play() {
    clip.start();
  }

  public void loop() {
    clip.loop(Clip.LOOP_CONTINUOUSLY);
  }

  public void stop() {
    clip.stop();
  }

  public void checkVolume() {
    switch (volumeScale) {
      case 0:
        volume = -80f;
        break;
      case 1:
        volume = -20f;
        break;
      case 2:
        volume = -12f;
        break;
      case 3:
        volume = -5f;
        break;
      case 4:
        volume = 1f;
        break;
      case 5:
        volume = 6f;
        break;
    }
    fc.setValue(volume);
  }
}
