package carlos.v.m;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by PC on 13/11/2014.
 */
public class Enemigo2 extends Image {

    Enemigo2 (Texture t){
        super(t);
        addListener(new EnemigoInput2(this));
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        this.setX(this.getX() + 10);

   }
}
