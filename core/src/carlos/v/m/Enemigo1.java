package carlos.v.m;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import java.util.EventListener;

/**
 * Created by PC on 13/11/2014.
 */
public class Enemigo1 extends Image{

    Enemigo1 (Texture t){
        super(t);
        addListener(new EnemigoInput(this));
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        this.setX(this.getX()+1);
    }


}
