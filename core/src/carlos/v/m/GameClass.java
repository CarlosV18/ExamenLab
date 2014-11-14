package carlos.v.m;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class GameClass extends ApplicationAdapter  {
	Music music;
	Texture fondo,enemigo101,enemigo1,enemigo2,enemigo3,boton,momiaInto,loboInto;
    Image fondo_image,boton_image,enemigo101_image;
    Stage stage,stage2,stage3;
    int rep=0,rep2=0,altura,contMomia=1;
    boolean touched=false;
	
	@Override
	public void create () {
		fondo = new Texture("fondo.jpg");
        boton= new Texture("boton.png");
        enemigo101 = new Texture("tirador.png");
        fondo_image=new Image(fondo);
        boton_image= new Image(boton);
        enemigo101_image = new Image(enemigo101);
        altura= Gdx.graphics.getHeight();

        stage = new Stage();
        stage2 = new Stage();
        stage3 = new Stage();
        Gdx.input.setInputProcessor(stage);
        stage.addActor(fondo_image);
        stage2.addActor(boton_image);
        stage.addActor(enemigo101_image);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

      if(touched==false){
          stage2.draw();
          contMomia++;
        if(Gdx.input.isTouched()) {
            touched=true;
            stage.draw();
            stage.act();
            if (rep % 200 == 0) {
                crearEnemigo1();
                crearEnemigo2();
           }
            rep++;
            if (rep2 % 500 == 0) {
                crearEnemigo3();
            }
            rep2++;
        }

        }else{
          contMomia++;
          stage.draw();
           if(rep%200==0){
                crearEnemigo1();
               if((contMomia>1020 && contMomia<1500)||(contMomia>2500 && contMomia<2700)){
                   System.out.println("Entro aqui "+contMomia);
                    momiaIntocable();
                }else{
                   crearEnemigo2();
                   System.out.println("no entro alla "+contMomia);
               }
            }
            rep++;
            if(rep2%350==0){
                crearEnemigo3();
            }
            rep2++;
          stage.act();
          String valor=touched==true?"Verdadero":"falso";
          System.out.println("El valor de touche es: "+valor);
      }




    }



    public void crearEnemigo1(){
        enemigo1= new Texture("llamasn.png");
        Enemigo1 e = new Enemigo1(enemigo1);
        stage.addActor(e);
        e.setY((int)(Math.random()*1000%100));
    }

    public void crearEnemigo2(){
        enemigo2 = new Texture("Momian.png");
        Enemigo2 en = new Enemigo2(enemigo2);
       stage.addActor(en);
        en.setY(altura / 4);

    }

    public void crearEnemigo3(){
        enemigo3 = new Texture("lobo.png");
        Enemigo3 enem = new Enemigo3(enemigo3);
        stage.addActor(enem);
        enem.setY(altura / 2);
    }

    public void momiaIntocable(){
        momiaInto = new Texture("Momia1.png");
        MomiaIntocable enemi= new MomiaIntocable(momiaInto);
        stage.addActor(enemi);
        enemi.setY(altura / 4);
     }

    public  void GameOver(){
        touched=false;
        System.out.println("se llamo esta funcion");
    }
}
