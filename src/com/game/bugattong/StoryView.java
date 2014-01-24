package com.game.bugattong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.game.bugattong.pregame.MainScreen;

public class StoryView extends Activity {

	Button btnOk;
	ImageView imgStory;
	String nextPage;
	
	
	String strInitial = "initial";
	String strMystery = "mystery";
	String strLevel1 = "level1";
	String strLevel2 = "level2";
	String strLevel3 = "level3";
	String strLevel4 = "level4";
	String strLevel5 = "level5";
	

//	int titles[] = {R.drawable.select_char_title,R.drawable.select_level_title,R.drawable.select_char_title,
//			R.drawable.select_level_title,R.drawable.select_char_title,R.drawable.select_level_title,R.drawable.select_char_title};
	
	int stories[] = {R.drawable.kwento_panimula,R.drawable.kwento_hardin,R.drawable.kwento_tulugan,
			R.drawable.kwento_sala,R.drawable.kwento_kagubatan,R.drawable.kwento_attic,R.drawable.background};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		setContentView(R.layout.story_view);
		super.onCreate(savedInstanceState);
		
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			nextPage = extras.getString("getNextPage");
		}
		
		initUI();

		btnOk.setOnClickListener(ocl);

	}
 
	private void initUI() {
		btnOk = (Button) findViewById(R.id.story_view_btn_ok);
		imgStory = (ImageView) findViewById(R.id.story_view_image_story);
		
		if (nextPage.equals(strInitial)) {
			imgStory.setBackgroundResource(stories[0]);
			
		}else if(nextPage.equals(strLevel1)) {
			imgStory.setBackgroundResource(stories[1]);
			
		}else if(nextPage.equals(strLevel2)) {
			imgStory.setBackgroundResource(stories[2]);
			
		}else if(nextPage.equals(strLevel3)) {
			imgStory.setBackgroundResource(stories[3]);
			
		}else if(nextPage.equals(strLevel4)) {
			imgStory.setBackgroundResource(stories[4]);
			
		}else if(nextPage.equals(strLevel5)) {
			imgStory.setBackgroundResource(stories[5]);
			
		}else if(nextPage.equals(strMystery)) {
			imgStory.setBackgroundResource(stories[6]);
			
		}
	}

	OnClickListener ocl = new OnClickListener() {

		@Override
		public void onClick(View v) {

			if (nextPage.equals(strInitial)) {
				startNewIntent(SelectLevel.class);
			}else if (nextPage.equals(strMystery)){
				startNewIntent(BonusActivity.class);
			}else{
				startNewIntent(GameActivity.class);
			}
		}
	};

	public void onBackPressed() {
		startNewIntent(MainScreen.class);

	};
	
	private void startNewIntent(Class s){
		
		startActivity(new Intent(StoryView.this, s));
		finish();
	}

}
