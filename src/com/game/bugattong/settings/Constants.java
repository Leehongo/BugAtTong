package com.game.bugattong.settings;

import com.game.bugattong.R;


/*
 *	01072014 added MAXANSWERTOUNLOCK
 */

public class Constants {
	public static final int CORRECTPOINT = 10;
	public static final int HINTPENALTYPOINTS = 20;
	public static final int WRONGCLICKPENALTYPOINTS = 15;
	public static final int WRONGCLICKPENALTYCOUNT= 5;
	public static final int STARTINGPOINTS = 100;
	public static final int MAXLEVELS = 5;
	public static final int MAXQUESTIONS = 15;
	public static final int MAXANSWERTOUNLOCK = 10;
	
	public static final String SAVEUSERHINTEDNUMBERS = "shownhints";
	public static final String SAVEUSERHINTEDNUMBERSHINTSSHOWS = "numderofshownhints";
	public static final String SAVECORRECTANSWERS = "correctanswers";
	public static final String SAVECURRENTLEVEL = "currentlevel";
	public static final String SAVECURRENTPOINTS = "currentpoints";
	public static final String SAVEUNLOCKEDLEVELS = "levellocked";
	public static final String SAVECURRENTQUESTION = "currentquestion";
	
	public static final String SAVEINIT = "hasBeenSaved";
	public static final String SAVEBONUSLEVEL ="bonuslevel";
	
	public static final String PLAYEDLEVEL ="levelPlayed";
	
	public static int BTNQUESTIONCOUNTER = 0;
	
	public static int UNLOCKLEVELIMAGEDIALOG[] = {R.drawable.lvl_btn_silid_tulugan,R.drawable.lvl_btn_sala
			,R.drawable.lvl_btn_kagubatan,R.drawable.lvl_btn_attic};
}
