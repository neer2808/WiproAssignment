package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
  public static void main(String[] args) {
    Veena obj = new Veena();
    obj.play();
    Saxophone obj1 = new Saxophone();
    obj1.play();
    Playable pobj ;
    pobj = new Veena();
    pobj.play();
    pobj = new Saxophone();
    pobj.play();
  }
}
