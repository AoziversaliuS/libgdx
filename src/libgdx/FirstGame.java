package libgdx;

import android.util.Log;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;

public class FirstGame implements ApplicationListener{
	float k=20;
	float i=0;
	private TextureRegion A;
	private SpriteBatch batch;
//	private Texture backGround;
//	private TextureRegion region;
	private Sprite sprite;
	@Override
	public void create() {
		batch = new SpriteBatch();
		LabelStyle labelStyle = new LabelStyle(new BitmapFont(),Color.ORANGE);
		Label label = new Label("FPS:", labelStyle);
		label.setY(0);
		label.setX(500);
//		backGround = new Texture(Gdx.files.internal("bg01.png"));
//		region = new TextureRegion(backGround, 256, 256, 256, 512);
//		sprite = new Sprite(backGround, 512, 512);
		
		TextureAtlas atlas = new TextureAtlas(Gdx.files.internal("libgdxAtlas/Oz.atlas"));
		A = atlas.findRegion("A");
		sprite = new Sprite(A);
		sprite.setPosition(0, 0);
		sprite.setScale(1f, 1f);
		
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void render() {
		if(i>960){
			k = -15;
		}
		else if(i<0){
			k = 15;
		}
		i = i+k;
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		batch.begin();
		Log.v("sysout", "ˢͼFPS:"+Gdx.graphics.getFramesPerSecond());
//		batch.draw(text, 100, 100);
		sprite.setPosition(i, 0);
		sprite.draw(batch);
		sprite.setPosition(i, 200);
		sprite.draw(batch);
		batch.end();
	}

	@Override
	public void resize(int arg0, int arg1) {
		
	}

	@Override
	public void resume() {
		
	}

}
