package carlos.v.m;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

/**
 * Created by PC on 14/11/2014.
 */
public class EnemigoInput2 extends InputListener {
    Enemigo2 enemy2;

    public EnemigoInput2 (Enemigo2 e){
        super();
        enemy2=e;
    }

    @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
        enemy2.remove();
        return super.touchDown(event, x, y, pointer, button);
    }
}
