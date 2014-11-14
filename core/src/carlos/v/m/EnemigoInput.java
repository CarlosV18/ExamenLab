package carlos.v.m;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

/**
 * Created by PC on 13/11/2014.
 */
public class EnemigoInput extends InputListener {
    Enemigo1 enemy;

   public EnemigoInput(Enemigo1 e){
        super();
        enemy=e;
    }



    @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
      enemy.remove();

      return super.touchDown(event, x, y, pointer, button);
    }


}
