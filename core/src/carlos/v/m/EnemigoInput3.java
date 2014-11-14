package carlos.v.m;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

/**
 * Created by PC on 14/11/2014.
 */
public class EnemigoInput3 extends InputListener {
    Enemigo3 e;
    private int cont=0;

    public EnemigoInput3 (Enemigo3 e){
        super();
        this.e=e;
    }

    @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
        if(cont>2){
          e.remove();
            cont=0;
        }
        cont++;
        return super.touchDown(event, x, y, pointer, button);
    }
}
