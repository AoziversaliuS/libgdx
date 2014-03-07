package libgdx;

import com.badlogic.gdx.backends.android.AndroidApplication;

import android.os.Bundle;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.view.Menu;

public class MainActivity extends AndroidApplication {

	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		initialize(new FirstGame(), false);
	}


}
