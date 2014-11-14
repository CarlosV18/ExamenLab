package carlos.v.m;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by PC on 14/11/2014.
 */
public class MomiaIntocable extends Image {

    public MomiaIntocable (Texture t){
        super(t);
        addListener(new MomiaInPut(this));

    }

    @Override
    public void act(float delta) {
       super.act(delta);
        this.setX(this.getX() + 10);
    }
}
