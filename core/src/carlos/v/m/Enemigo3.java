package carlos.v.m;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by PC on 13/11/2014.
 */
public class Enemigo3 extends Image {

    Enemigo3 (Texture t){
        super(t);
        addListener(new EnemigoInput3(this));
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        this.setX(this.getX()+1);
        this.setY(this.getY()+3);
        this.setY(this.getY()-3);

    }




}
