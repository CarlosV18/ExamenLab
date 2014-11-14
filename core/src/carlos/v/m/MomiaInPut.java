package carlos.v.m;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

/**
 * Created by PC on 14/11/2014.
 */
public class MomiaInPut extends InputListener {
    GameClass x = new GameClass();
    MomiaIntocable momia;

    public MomiaInPut(MomiaIntocable m){
       super();
        momia=m;
    }

    @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
        momia.remove();
        this.x.GameOver();
      return super.touchDown(event, x, y, pointer, button);
    }
}
